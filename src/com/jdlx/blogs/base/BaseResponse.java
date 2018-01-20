package com.jdlx.blogs.base;


/**
 * 
 * @Title: BaseResponse
 * @Description: 通用响应 BaseResponse
 * @Company: 山东九点连线信息技术有限公司
 * @ProjectName: Blogs
 * @author fupengpeng
 * @date 2018年1月20日 下午6:28:35
 */
public class BaseResponse {
	
	/**
	 * 成功：0     失败：1
	 */
	private int code;
	/**
	 * code返回1时，携带失败信息
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
