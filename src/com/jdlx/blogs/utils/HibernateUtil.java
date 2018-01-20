package com.jdlx.blogs.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 * 
 * @Title: HibernateUtil
 * @Description: hibernate工具类
 * @Company: 山东九点连线信息技术有限公司
 * @ProjectName: Blogs
 * @author fupengpeng
 * @date 2018年1月20日 下午4:49:07
 */
public class HibernateUtil {
	
	/**
	 * 用于生产SessionFactory对象 SessionFactory对象产生耗资源，故只生产一个SessionFactory对象
	 */
	private static final Configuration configuration;
	private static final SessionFactory sessionFactory;

	static {
		configuration = new Configuration().configure();
		sessionFactory = configuration.buildSessionFactory();
	}

	// 提供方法返回与本地线程绑定的session对象的方法
	public static Session getSessionObject() {
		return sessionFactory.getCurrentSession();
	}

	// 提供方法返回SessionFactory对象
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

//	public static void main(String[] args) {
//
//	}

}
