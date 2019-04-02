package group.agv01.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import group.agv01.interceptor.HiseeInterceptor;
import group.agv01.interceptor.LoginInterceptor;
/**
 * 以前在SpringMVC中配置登录拦截器，我们配置拦截器在xml中，Configurer-配置
 * @author soft01
 *在SpringBoot里特有注解@Configuration可以在启动时自动加载这里写的拦截器配置，不用在xml中配置了
 */
@Configuration
public class LoginInterceptorConfigurer implements WebMvcConfigurer {
	
	/**
	 * 重写接口中的方法
	 */
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		//拦截路径:必须登录才可以访问的
		List<String> patterns = new ArrayList<>();
//		patterns.add("/**");
		
		//白名单:在黑名单范围内，却不需要登录就可以访问的
		List<String> excludePatterns = new ArrayList<>();
//		excludePatterns.add("/bootstrap3/**");
//		excludePatterns.add("/css/**");
//		excludePatterns.add("/images/**");
//		excludePatterns.add("/js/**");
//		
//		excludePatterns.add("/goods/**");
//		excludePatterns.add("/districts/**");
//		excludePatterns.add("/web/register.html");
//		excludePatterns.add("/users/reg");
//		excludePatterns.add("/web/login.html");
//		excludePatterns.add("/users/login");
//		excludePatterns.add("/web/index.html");
//		excludePatterns.add("/web/product.html");
		
		//注册拦截器
		registry.addInterceptor(new LoginInterceptor())
		.addPathPatterns(patterns)
		.excludePathPatterns(excludePatterns);
		registry.addInterceptor(new HiseeInterceptor())
		.addPathPatterns(patterns)
		.excludePathPatterns(excludePatterns);
	
	}
	
}
