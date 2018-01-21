package com.jdlx.blogs.domain;

import java.util.Date;

/**
 * 
 * @Title: User
 * @Description: 用户实体
 * @Company: 山东九点连线信息技术有限公司
 * @ProjectName: Blogs
 * @author fupengpeng
 * @date 2018年1月20日 下午1:41:16
 */
public class User {

	/**
	 * id
	 */
	private Long id;
	/**
	 * 昵称
	 */
	private String nickName;
	/**
	 * 姓名
	 */
	private String name;
	/**
	 * 生日
	 */
	private Date birthday;
	/**
	 * 性别
	 */
	private String gender;
	/**
	 * 省
	 */
	private String province;
	/**
	 * 市
	 */
	private String city;
	/**
	 * 区/县
	 */
	private String county;
	/**
	 * 地址
	 */
	private String address;
	/**
	 * 电话号码
	 */
	private String phoneNumber;
	/**
	 * 邮箱地址
	 */
	private String emailAddress;
	/**
	 * 登录账号
	 */
	private String loginID;

	/**
	 * 登录密码
	 */
	private String loginPassword;

	/**
	 * 身份证号
	 */
	private String IDCardNumber;
	/**
	 * 微信账号
	 */
	private String weChatAccount;
	/**
	 * QQ账号
	 */
	private String QQAccount;
	/**
	 * 图像地址
	 */
	private String imageUrl;
	/**
	 * 注册时间
	 */
	private Date registerTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getLoginID() {
		return loginID;
	}

	public void setLoginID(String loginID) {
		this.loginID = loginID;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public String getIDCardNumber() {
		return IDCardNumber;
	}

	public void setIDCardNumber(String iDCardNumber) {
		IDCardNumber = iDCardNumber;
	}

	public String getWeChatAccount() {
		return weChatAccount;
	}

	public void setWeChatAccount(String weChatAccount) {
		this.weChatAccount = weChatAccount;
	}

	public String getQQAccount() {
		return QQAccount;
	}

	public void setQQAccount(String qQAccount) {
		QQAccount = qQAccount;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Date getRegisterTime() {
		return registerTime;
	}

	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", nickName=" + nickName + ", name=" + name
				+ ", birthday=" + birthday + ", gender=" + gender
				+ ", province=" + province + ", city=" + city + ", county="
				+ county + ", address=" + address + ", phoneNumber="
				+ phoneNumber + ", emailAddress=" + emailAddress + ", loginID="
				+ loginID + ", loginPassword=" + loginPassword
				+ ", IDCardNumber=" + IDCardNumber + ", weChatAccount="
				+ weChatAccount + ", QQAccount=" + QQAccount + ", imageUrl="
				+ imageUrl + ", registerTime=" + registerTime + "]";
	}

}
