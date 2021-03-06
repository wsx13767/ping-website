package com.ping.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String uri = request.getRequestURI();
//		System.out.println(uri);
		if (uri.endsWith("/registerLogin") && request.getSession().getAttribute("sessionUser") != null) {
			request.getRequestDispatcher("/").forward(request, response);
			return false;
		}
		if (uri.endsWith("/registerLogin") || uri.endsWith("/login") || uri.endsWith("/logout") || uri.endsWith("/register")
				|| uri.endsWith("/AccountCheck")) {
			return true;
		}
		if (request.getSession().getAttribute("sessionUser") != null) {
			return true;
		}
//		response.sendRedirect("/views/registerLogin");
		request.getRequestDispatcher("/views/registerLogin").forward(request, response);
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
