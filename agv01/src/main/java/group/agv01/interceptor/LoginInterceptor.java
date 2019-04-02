package group.agv01.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
/**
 * 登录拦截器 
 * @author Alex
 *
 */
public class LoginInterceptor implements HandlerInterceptor{
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
//		HttpSession session = request.getSession();
//		if(session.getAttribute("uid") == null ) {
//			response.sendRedirect("/web/login.html");//发现没有登录等其他脑残情况，重定向到登录页面
//			return false;
//		}
		return true;
	}
	
}
