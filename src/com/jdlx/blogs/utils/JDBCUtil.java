package com.jdlx.blogs.utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * 
 * @Title: JDBCUtil
 * @Description: jdbc工具类
 * @Company: 山东九点连线信息技术有限公司
 * @ProjectName: Blogs
 * @author fupengpeng
 * @date 2018年1月21日 下午1:55:01
 */
public class JDBCUtil {

	// 定义所需要的变量
	private static Connection ct = null;

	// 大多数情况下，使用的是PreparedStatement来替代Statement，目的是为了防止sql注入
	private static PreparedStatement ps = null;
	private static ResultSet rs = null;
	private static CallableStatement cs = null;

	// 连接数据库的参数
	private static String url = "";
	private static String username = "";
	private static String driver = "";
	private static String password = "";
	// 读取配置文件的属性
	private static Properties pp = null;
	private static InputStream fis = null;

	// 加载驱动，只需要一次
	static {
		try {
			// 从dbinfo。properties文件中读取配置信息
			pp = new Properties();
			// 使用web项目时，使用类加载器,类加载器读取资源时，默认读取主目录是src
			fis = JDBCUtil.class.getClassLoader().getResourceAsStream(
					"dbinfo.properties");
			pp.load(fis);
			// 读取配置文件里面的参数
			url = pp.getProperty("url");
			username = pp.getProperty("username");
			driver = pp.getProperty("driver");
			password = pp.getProperty("password");
			Class.forName(driver);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			fis = null;
		}
	}

	// 得到连接
	public static Connection getConnection() {
		try {
			ct = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return ct;
	}

	// 关闭资源的函数
	public static void close(ResultSet rs, Statement ps, Connection ct) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		if (ps != null) {
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		if (ct != null) {
			try {
				ct.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	public static Connection getCt() {
		return ct;
	}

	public static PreparedStatement getPs() {
		return ps;
	}

	public static ResultSet getRs() {
		return rs;
	}

	public static CallableStatement getCs() {
		return cs;
	}

	// 用于 insert、delete、update ---- 只有一个sql语句
	public static void executeUpdate(String sql) {
		try {
			// 创建一个ps
			ct = getConnection();
			ps = ct.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			System.out.println("sql==" + sql);
			// 执行
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		} finally {
			close(rs, ps, ct);
		}
	}

	// insert、delete、update ---- 多个sql语句 [需要考虑下事务]
	public static void executeUpdate(String[] sql) {
		try {
			// 核心
			// 1.获得连接
			ct = getConnection();
			// 传入的sql（可能是多个）
			ct.setAutoCommit(false); // 设置sql语句不是自动提交
			for (int i = 0; i < sql.length; i++) {
				ps = ct.prepareStatement(sql[i]);
				ps.executeUpdate();
			}
			ct.commit(); // 手动提交
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				// 回滚
				ct.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			throw new RuntimeException(e.getMessage());
		} finally {
			close(rs, ps, ct);
		}
	}

	// select
	public static ResultSet executeQuery(String sql) {
		try {
			ct = getConnection();
			ps = ct.prepareStatement(sql);
			rs = ps.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		} finally {
			// close(rs, cs, ct); //暂时不关闭，等到调用时获取到数据后再执行关闭方法
		}
		return rs;
	}
}
