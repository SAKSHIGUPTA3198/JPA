package com.lti.dao;


import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import com.lti.model.Users;
import com.lti.utils.JpaUtils;

public class UserDao {
	private EntityManager entityManager;
	public UserDao(){
		entityManager = JpaUtils.getEntityManager();
	}
	
	public int readLogin(String username, String password){
	{
			
			String query = "Select u From Users u  Where u.username=' "+username  + "' And u.password=' "+password+"'";
			TypedQuery<Users> tquery = entityManager.createQuery(query,Users.class);
			List<Users> list = tquery.getResultList();
			if(list!=null &&list.size()!=0)
				return 1;
			else
				
				return 0;
		
	}
				
	}
	public List<Users> readAllUsers(){
		String query = "Select u From Users u";
		TypedQuery<Users> tquery = entityManager.createQuery(query,Users.class);
		List<Users> list = tquery.getResultList();
		return list;
	}
	
	public int deleteUser(String username){
			String s = "Delete From Users  u Where u.username = '"+username+"'";
			Query query = entityManager.createQuery(s);
			int result = query .executeUpdate();
			return result;
		
		}
	
	
	public int createUser(Users user){
		entityManager.getTransaction().begin();
		entityManager.persist(user);
		entityManager.getTransaction().commit();
	return 1;
		
		
	}
		
	public int updateUser(Users user) {
		entityManager.getTransaction().begin();
			Users user2 = entityManager.merge(user);
			entityManager.getTransaction().commit();
		String s ="Update from users u  where u.username='"+user.getUsername()+"'+ u.firstname='"+user.getPassword()+"'+u.lastname='"+user.getLastname()+"'+u.mobilenumber='"+user.getMobilenumber()+"'";
		Query query = entityManager.createQuery(s);
	int result = query.executeUpdate();
		return result;
		
		}
	public void beginTransaction() {
		entityManager.getTransaction().begin();
		
	}
	public void commitTransaction() {
		entityManager.getTransaction().commit();
		
	}
	public void rollbackTransaction() {
		entityManager.getTransaction().rollback();
		
	}
		
	}



	
	
	
	
	
	
	


