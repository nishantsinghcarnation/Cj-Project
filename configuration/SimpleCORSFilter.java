package com.cts.cj.configuration;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class SimpleCORSFilter implements Filter {

	private final Logger log = LoggerFactory.getLogger(SimpleCORSFilter.class);
	//private final String localClientUrl = "http://localhost:8100";

	public SimpleCORSFilter() {
		log.info("SimpleCORSFilter init");
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) res;
//		String requestUrl = request.getRemoteAddr() + ":" + request.getRemotePort();
//		if (requestUrl.equals(localClientUrl)) {
//			// allow access
//			response.setHeader("Access-Control-Allow-Origin", requestUrl);
//		}
		
	//response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
//		response.setHeader("Access-Control-Allow-Origin", "https://182.156.233.29");
	  
	  //response.setHeader("Access-Control-Allow-Headers", "Access-Control-Allow-Headers, Origin,Accept, X-Requested-With, Content-Type, Access-Control-Request-Method, Access-Control-Request-Headers");
	//	response.setHeader("Access-Control-Allow-Credentials", "true");
	//	response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE, PUT, HEAD");
	//	response.setHeader("Access-Control-Max-Age", "3600");
	//	response.setHeader("Access-Control-Allow-Headers",	"Content-Type, Access-Control-Allow-Headers, Authorization, X-Requested-With");
		
		//response.setHeader("Access-Control-Allow-Origin", "*");	
		 response.setHeader("Access-Control-Allow-Methods",	  "POST, GET, OPTIONS, DELETE, PUT, HEAD");
	    response.setHeader("Access-Control-Max-Age", "3600");
	   // request.getMethod()
	 //   request.get
		 chain.doFilter(req, res);
		//chain.doFilter(req, res);
	}

	@Override
	public void init(FilterConfig filterConfig) {
	}

	@Override
	public void destroy() {
	}

}
