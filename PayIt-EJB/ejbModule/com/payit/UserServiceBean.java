package com.payit;

import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
@LocalBean
public class UserServiceBean
{
  @PersistenceContext
  private EntityManager em;
  
  public void createUser(User user)
  {
    user.setCreated(Calendar.getInstance().getTime());
    this.em.persist(user);
  }
  
  public User login(String login, String password)
  {
    Collection<User> users = this.em.createQuery("SELECT u FROM User u WHERE u.login=:login AND u.password=:password").setParameter("login", login).setParameter("password", password).getResultList();
    if ((users == null) || (users.size() > 1)) {
      return null;
    }
    return (User)users.iterator().next();
  }
}
