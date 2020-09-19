package com.vektorel.utils;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vektorel.controller.website.LoginBean;




public class LoginFilter implements Filter {

	public void doFilter(ServletRequest request, 
			ServletResponse response, FilterChain chain) 
					throws IOException, ServletException {
		
		 LoginBean login = 
				 (LoginBean)((HttpServletRequest)request).getSession().getAttribute("loginBean");
		 String gelenAdres = ((HttpServletRequest)request).getContextPath();
		 if(login==null || login.isLogin==false)
			((HttpServletResponse)response).sendRedirect(gelenAdres+ "/login.jsf");
		
		
		chain.doFilter(request, response);
	}

}
