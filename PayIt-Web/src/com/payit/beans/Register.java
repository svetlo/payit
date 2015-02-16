package com.payit.beans;

import com.payit.User;
import com.payit.UserServiceBean;
import com.payit.util.Util;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class Register
{
  private String login;
  private String name;
  private String surname;
  private String email;
  private String password;
  private String passwordRepeat;
  private User user;
  @EJB
  private UserServiceBean userServiceBean;
  
  public String getLogin()
  {
    return this.login;
  }
  
  public String getPasswordRepeat()
  {
    return this.passwordRepeat;
  }
  
  public void setPasswordRepeat(String passwordRepeat)
  {
    this.passwordRepeat = passwordRepeat;
  }
  
  public void setLogin(String login)
  {
    this.login = login;
  }
  
  public String getName()
  {
    return this.name;
  }
  
  public void setName(String name)
  {
    this.name = name;
  }
  
  public String getSurname()
  {
    return this.surname;
  }
  
  public void setSurname(String surname)
  {
    this.surname = surname;
  }
  
  public String getEmail()
  {
    return this.email;
  }
  
  public void setEmail(String email)
  {
    this.email = email;
  }
  
  public String getPassword()
  {
    return this.password;
  }
  
  public void setPassword(String password)
  {
    this.password = password;
  }
  
  public void createUser()
  {
    this.user = new User();
    this.user.setLogin(this.login);
    this.user.setName(this.name);
    this.user.setSurname(this.surname);
    this.user.setEmail(this.email);
    this.user.setPassword(this.password);
    this.userServiceBean.createUser(this.user);
    Util.redirect("login.xhtml");
  }
}
