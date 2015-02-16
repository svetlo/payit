package com.payit.beans;

import com.payit.util.Util;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.servlet.http.HttpSession;

@ManagedBean
@SessionScoped
public class Navigation
{
  boolean isLoggedIn;
  
  public boolean isLoggedIn()
  {
    this.isLoggedIn = false;
    String login = Util.getLogin();
    if (login != "") {
      this.isLoggedIn = true;
    }
    return this.isLoggedIn;
  }
  
  public void setLoggedIn(boolean isLoggedIn)
  {
    this.isLoggedIn = isLoggedIn;
  }
  
  public void logOut()
  {
    HttpSession session = Util.getSession();
    Util.redirect("public/login.xhtml");
    session.invalidate();
  }
}
