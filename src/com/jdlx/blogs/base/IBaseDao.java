package com.jdlx.blogs.base;

import java.util.List;

/**
 * 
 * @Title: IBaseDao
 * @Description: ͨ��Dao�ӿ�
 * @Company: ɽ���ŵ�������Ϣ�������޹�˾
 * @ProjectName: Blogs
 * @author fupengpeng
 * @date 2018��1��20�� ����5:35:33
 */
public interface IBaseDao<T> {
	/**
	 * ���
	 */
	public void save(T entity);
	
	/**
	 * ����idɾ��
	 */
	public void delete(Long id);
	
	/**
	 * ����id�޸�
	 */
	public void update(T entity);
	
	/**
	 * ����id��ѯ
	 */
	public T getById(Long id);
	
	/**
	 * һ�β�ѯ�������
	 */
	public List<T> getByIds(Long[] ids);
	
	/**
	 * ��ѯ����
	 */
	public List<T> findAll();

}
