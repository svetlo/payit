package com.payit.util;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter(filterName="AuthenticationFilter", urlPatterns={"*.xhtml"})
public class AuthenticationFilter
  implements Filter
{
  public void init(FilterConfig filterConfig)
    throws ServletException
  {}
  
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
    throws IOException, ServletException
  {
    try
    {
      HttpServletRequest req = (HttpServletRequest)request;
      HttpServletResponse res = (HttpServletResponse)response;
      HttpSession session = req.getSession(false);
      String reqURI = req.getRequestURI();
      if ((session != null) && (session.getAttribute("login") != null) && ((reqURI.indexOf("login.xhtml") >= 0) || (reqURI.indexOf("register.xhtml") >= 0))) {
        res.sendRedirect(req.getContextPath() + "/profile.xhtml");
      } else if (((session != null) && (session.getAttribute("login") != null)) || (reqURI.indexOf("/public/") >= 0) || (reqURI.contains("javax.faces.resource")) || (reqURI.indexOf("/resources/") >= 0)) {
        chain.doFilter(request, response);
      } else {
        res.sendRedirect(req.getContextPath() + "/public/login.xhtml");
      }
    }
    catch (Throwable e)
    {
      System.out.println(e.getMessage());
    }
  }
  
  public void destroy() {}
}
