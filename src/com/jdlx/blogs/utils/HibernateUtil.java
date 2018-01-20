package com.jdlx.blogs.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 * 
 * @Title: HibernateUtil
 * @Description: hibernate������
 * @Company: ɽ���ŵ�������Ϣ�������޹�˾
 * @ProjectName: Blogs
 * @author fupengpeng
 * @date 2018��1��20�� ����4:49:07
 */
public class HibernateUtil {
	
	/**
	 * ��������SessionFactory���� SessionFactory�����������Դ����ֻ����һ��SessionFactory����
	 */
	private static final Configuration configuration;
	private static final SessionFactory sessionFactory;

	static {
		configuration = new Configuration().configure();
		sessionFactory = configuration.buildSessionFactory();
	}

	// �ṩ���������뱾���̰߳󶨵�session����ķ���
	public static Session getSessionObject() {
		return sessionFactory.getCurrentSession();
	}

	// �ṩ��������SessionFactory����
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

//	public static void main(String[] args) {
//
//	}

}
