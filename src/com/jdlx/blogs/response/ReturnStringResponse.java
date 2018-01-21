package com.jdlx.blogs.response;

import com.jdlx.blogs.base.BaseResponse;

/**
 * 
 * @Title: ReturnStringResponse
 * @Description: 默认字符串响应
 * @Company: 山东九点连线信息技术有限公司
 * @ProjectName: Blogs
 * @author fupengpeng
 * @date 2018年1月21日 下午12:15:50
 */
public class ReturnStringResponse extends BaseResponse {
	/**
	 * 响应数据 0:数据处理成功 1:数据处理失败
	 */
	private String data;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "ReturnStringResponse [data=" + data + "]";
	}

}
