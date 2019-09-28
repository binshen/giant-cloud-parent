package com.giant.cloud.service.filter;


import com.giant.cloud.common.utils.http.DateSecret;
import com.giant.cloud.common.utils.http.ResponseWrapper;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(filterName = "restResponseFilter", urlPatterns = "/*")
public class EncyptionResponseContentFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		if (chek(null, httpServletRequest.getRequestURI())) {
			ResponseWrapper responseWrapper = new ResponseWrapper((HttpServletResponse) response);
			chain.doFilter(request, responseWrapper);
			try {
				String responseContent = new String(responseWrapper.getDataStream(), "utf-8");
				String decodeContent = DateSecret.encryptDES(responseContent);
				byte[] bytes = decodeContent.getBytes("utf-8");
				response.getOutputStream().write(bytes, 0, bytes.length);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			chain.doFilter(request, response);
		}
	}

	@Override
	public void destroy() {

	}

	/**
	 * @param notFilter
	 *            不拦截的url
	 * @param url
	 *            ：请求的url
	 * @return false：不拦截 true：拦截
	 */
	public boolean chek(String[] notFilter, String url) {
		// url以css和js结尾的不进行拦截
		if (url.endsWith(".png") || url.endsWith(".jpg") || url.endsWith(".jpeg") || url.endsWith(".gif")
				|| url.endsWith(".css") || url.endsWith(".js") || url.contains("/report/")) {
			return false;
		}
		// 含有notFilter中的任何一个则不进行拦截
		// for (String s : notFilter) {
		// if (url.indexOf(s) != -1) {
		// return false;
		// }
		// }
		return true;
	}

}
