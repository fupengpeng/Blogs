package com.jdlx.blogs.base;


/**
 * 
 * @Title: BaseResponse
 * @Description: ͨ����Ӧ BaseResponse
 * @Company: ɽ���ŵ�������Ϣ�������޹�˾
 * @ProjectName: Blogs
 * @author fupengpeng
 * @date 2018��1��20�� ����6:28:35
 */
public class BaseResponse {
	
	/**
	 * �ɹ���0     ʧ�ܣ�1
	 */
	private int code;
	/**
	 * code����1ʱ��Я��ʧ����Ϣ
	 */
	private String info;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	
	
	
	
}
