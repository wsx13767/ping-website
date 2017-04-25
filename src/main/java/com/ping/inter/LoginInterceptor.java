package com.ping.inter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String uri = request.getRequestURI();
		System.out.println(uri);
		
		if (uri.endsWith("/registerLogin") && request.getSession().getAttribute("sessionAccount") != null) {
			response.sendRedirect("views");
			return false;
		}
		if (uri.endsWith("/registerLogin") || uri.endsWith("/login") || uri.endsWith("/logout")) {
			return true;
		}
		if (request.getSession().getAttribute("sessionAccount") != null) {
			return true;
		}
		response.sendRedirect("views/registerLogin");
		return false;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

}
