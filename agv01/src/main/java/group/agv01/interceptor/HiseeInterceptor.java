package group.agv01.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;

import group.agv01.authority.BaseInterceptor;

public class HiseeInterceptor extends BaseInterceptor implements HandlerInterceptor{
//	@Autowired
//	private PermissionDomainRepository permissionDomainRepository;
//
//	@Autowired
//	private UserInfoMapper userInfoMapper;
//
//	@Override
//	public boolean preHandle(HttpServletRequest request,
//			HttpServletResponse response, Object handler) throws Exception {
//
//		//获取session用户
//		UserSession userSession = SpringUtil.getBean(UserSession.class);
//		HiseeInterceptor userInterceptor = new HiseeInterceptor();
//
//		//登录状态
//		boolean isLogin = userSession.isLogin();
//		//请求资源
//		String url = request.getRequestURI();  //  /user/deleteUser
//		UserInfo userInfo = userInfoMapper.findUserInfoById(userSession.getUserId());
//
//		//是否登录
//		if(!isLogin){
//			System.out.println("请登录 ... ...");
//			return false;
//		}
//
//		//是否拥有权限
//		boolean pstate = userInterceptor.isHavePermiss(permissionDomainRepository,userInfo,url);
//		if(!pstate){
//			System.out.println("无权限 ... ...");
//			return false;
//		}
//
//		System.out.println("权限通过 ... ...");
//		return true;
//	}
//
//	@Override
//	public void postHandle(HttpServletRequest request,
//			HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
//	}
//
//	@Override
//	public void afterCompletion(HttpServletRequest request,
//			HttpServletResponse response, Object handler, Exception ex)
//					throws Exception {
//	}
}
