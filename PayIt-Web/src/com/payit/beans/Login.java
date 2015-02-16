package com.payit.beans;

import com.payit.User;
import com.payit.UserServiceBean;
import com.payit.util.Util;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.servlet.http.HttpSession;

@ManagedBean
public class Login
{
  @EJB
  UserServiceBean userServiceBean;
  private String login;
  private String password;
  private String errorMessage;
  
  public String getErrorMessage()
  {
    return this.errorMessage;
  }
  
  public void setErrorMessage(String errorMessage)
  {
    this.errorMessage = errorMessage;
  }
  
  public String getLogin()
  {
    return this.login;
  }
  
  public void setLogin(String login)
  {
    this.login = login;
  }
  
  public String getPassword()
  {
    return this.password;
  }
  
  public void setPassword(String password)
  {
    this.password = password;
  }
  
  public void login()
  {
    User currentUser = this.userServiceBean.login(this.login, this.password);
    if (currentUser == null)
    {
      this.errorMessage = "Incorrect password or login";
      this.login = null;
      this.password = null;
    }
    else
    {
      HttpSession session = Util.getSession();
      session.setAttribute("login", currentUser.getLogin());
      session.setAttribute("id", Integer.valueOf(currentUser.getId()));
      Util.redirect("../profile.xhtml");
    }
  }
}
