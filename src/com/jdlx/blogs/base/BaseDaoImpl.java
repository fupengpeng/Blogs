package com.jdlx.blogs.base;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Properties;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



/**
 * 
 * @Title: BaseDaoImpl
 * @Description: ͨ��Dao�ӿ�ʵ����
 * @Company: ɽ���ŵ�������Ϣ�������޹�˾
 * @ProjectName: Blogs
 * @author fupengpeng
 * @date 2018��1��20�� ����5:36:36
 */
@SuppressWarnings("unchecked")
public class BaseDaoImpl<T> implements IBaseDao<T> {
	
	private SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	
	private Class<T> clazz;
	
	public BaseDaoImpl() {
		//���ʵ������
		ParameterizedType genericSuperclass = (ParameterizedType) this.getClass().getGenericSuperclass();//��������ĸ���
		Type[] types = genericSuperclass.getActualTypeArguments();
		clazz = (Class<T>) types[0];
	}
	
	public void save(T entity) {
		getSession().save(entity);
	}
	
	public void delete(Long id) {
		getSession().delete(getSession().get(clazz, id));
	}
	
	public void update(T entity) {
		getSession().update(entity);
	}

	public List<T> findAll() {
		String hql = "FROM " + clazz.getSimpleName();
		return getSession().createQuery(hql).list();
	}

	public T getById(Long id) {
		return (T) getSession().get(clazz, id);
	}
	
	public List<T> getByIds(Long[] ids) {
		String hql = "FROM " + clazz.getSimpleName() + " WHERE id in (:ids)";
		Query query = getSession().createQuery(hql);
		query.setParameterList("ids", ids);//һ�θ�ֵ���
		return query.list();
	}
	
	public Session getSession(){
		return sessionFactory.getCurrentSession();
	}

}
