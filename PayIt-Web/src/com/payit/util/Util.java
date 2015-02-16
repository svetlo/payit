package com.payit.util;

import java.io.IOException;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

public class Util
{
  public static HttpSession getSession()
  {
    return (HttpSession)FacesContext.getCurrentInstance().getExternalContext().getSession(false);
  }
  
  public static String getLogin()
  {
    HttpSession session = (HttpSession)FacesContext.getCurrentInstance().getExternalContext().getSession(false);
    return session.getAttribute("login").toString();
  }
  
  public static boolean isPostback()
  {
    return FacesContext.getCurrentInstance().isPostback();
  }
  
  public static void redirect(String url)
  {
    try
    {
      FacesContext.getCurrentInstance().getExternalContext().redirect(url);
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
  }
}
