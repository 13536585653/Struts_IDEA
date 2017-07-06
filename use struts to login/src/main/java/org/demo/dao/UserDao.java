package org.demo.dao;

import org.demo.entity.User;
import org.demo.utils.HibernateUtilJpa;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by langye on 2017/1/4.
 */
public class UserDao<T> {

	//添加
	public void add(User user){
		EntityManager em = HibernateUtilJpa.getEntityManager();
		em.getTransaction().begin();

		try{
			em.persist(user);
			em.getTransaction().commit();
		}catch (Exception e){
			e.printStackTrace();
			em.getTransaction().rollback();
		}finally {
			em.close();
		}
	}

	//根据id查询单个用户
	public T findUserById(Class<T> userClass,String id){
		EntityManager em = HibernateUtilJpa.getEntityManager();
		em.getTransaction().begin();
		T user = null;


		try{
			user = em.find(userClass,id);
			em.getTransaction().commit();
		}catch (Exception e){
			e.printStackTrace();
			em.getTransaction().rollback();
		}finally {
			em.close();
		}
		return user;
	}

	//根据name查询单个用户
	public T findUserByName(String userName){
		EntityManager em = HibernateUtilJpa.getEntityManager();
		em.getTransaction().begin();
		String jpql = "from User u where u.userName = ?1";
		T user = null;

		try {
			Query query = em.createQuery(jpql);
			query.setParameter(1,userName);
			user = (T) query.getSingleResult();
			em.getTransaction().commit();
		}catch (Exception e){
			e.printStackTrace();
			em.getTransaction().rollback();
		}finally {
			em.close();
		}
		return user;
	}
	//查询所有用户
	public List<T> findAllUser(Class<T> tClass){
		EntityManager em = HibernateUtilJpa.getEntityManager();
		em.getTransaction().begin();
		List<T> list = null;
		String jpql = "from "+tClass.getName();

		try{
			Query query = em.createQuery(jpql);
			list = query.getResultList();
			em.getTransaction().commit();
		}catch (Exception e){
			e.printStackTrace();
			em.getTransaction().rollback();
		}finally {
			em.close();
		}
		return list;
	}
}
