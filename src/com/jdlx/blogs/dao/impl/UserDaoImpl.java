package com.jdlx.blogs.dao.impl;

import java.util.List;

import org.hibernate.Query;

import com.jdlx.blogs.base.BaseDaoImpl;
import com.jdlx.blogs.dao.IUserDao;
import com.jdlx.blogs.domain.User;
import com.jdlx.blogs.response.LoginResponse;


/**
 * 
 * @Title: UserDaoImpl
 * @Description: �û� Daoʵ��
 * @Company: ɽ���ŵ�������Ϣ�������޹�˾
 * @ProjectName: Blogs
 * @author fupengpeng
 * @date 2018��1��20�� ����5:56:25
 */
@SuppressWarnings("unchecked")
public class UserDaoImpl extends BaseDaoImpl<User> implements IUserDao{

	@Override
	public LoginResponse login(String loginID, String loginPassword) {
		// TODO ���ݴ�����û���¼�˺ź������ѯ���ݿ⣬�Ƿ������ݣ�����ӵ���Ӧ�����У����򲻽�����ӣ�ֱ�ӷ�����Ӧ����
		LoginResponse loginResponse = new LoginResponse();
		
		//3.д�����crud����
        //3-1.������ѯ
		String hql = "from User where loginID=? and loginPassword=?";
        Query query = this.getSession().createQuery(hql);
        //3-2.��������
        //����1��? ��λ�ã��� 0 ��ʼ    ����2��? ��ֵ
        query.setParameter(0, loginID);
        query.setParameter(1, loginPassword);
        //3-3.���÷����õ����
        List<User> list = query.list();
        for (User user : list) {
        	loginResponse.setUser(user);
            System.out.println(user.toString());
        }
		
		return loginResponse;
	}



}
