package com.jdlx.blogs.domain;

import java.util.Date;

/**
 * 
 * @Title: User
 * @Description: �û�ʵ��
 * @Company: ɽ���ŵ�������Ϣ�������޹�˾
 * @ProjectName: Blogs
 * @author fupengpeng
 * @date 2018��1��20�� ����1:41:16
 */
public class User {

	/**
	 * id
	 */
	private Long id;
	/**
	 * �ǳ�
	 */
	private String nickName;
	/**
	 * ����
	 */
	private String name;
	/**
	 * ����
	 */
	private Date birthday;
	/**
	 * �Ա�
	 */
	private String gender;
	/**
	 * ʡ
	 */
	private String province;
	/**
	 * ��
	 */
	private String city;
	/**
	 * ��/��
	 */
	private String county;
	/**
	 * ��ַ
	 */
	private String address;
	/**
	 * �绰����
	 */
	private String phoneNumber;
	/**
	 * �����ַ
	 */
	private String emailAddress;
	/**
	 * ��¼����
	 */
	private String loginPassword;
	/**
	 * ��¼�˺�
	 */
	private String loginID;
	/**
	 * ���֤��
	 */
	private String IDCardNumber;
	/**
	 * ΢���˺�
	 */
	private String weChatAccount;
	/**
	 * QQ�˺�
	 */
	private String QQAccount;
	/**
	 * ͼ���ַ
	 */
	private String imageUrl;
	/**
	 * ע��ʱ��
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

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public String getLoginID() {
		return loginID;
	}

	public void setLoginID(String loginID) {
		this.loginID = loginID;
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

}
