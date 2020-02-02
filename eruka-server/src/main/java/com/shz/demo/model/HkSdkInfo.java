package com.shz.demo.model;

/**
 * 海康sdk所需信息
 * 
 * @author lenovo
 *
 */
public class HkSdkInfo {

	private String m_sDeviceIP;// 设备ip地址

	private String m_sDevicePort;// 设备端口

	private String userName;// 用户名

	private String password;// 密码
	
	private Integer channelNum;// 通道号

	public String getM_sDeviceIP() {
		return m_sDeviceIP;
	}

	public void setM_sDeviceIP(String m_sDeviceIP) {
		this.m_sDeviceIP = m_sDeviceIP;
	}

	public String getM_sDevicePort() {
		return m_sDevicePort;
	}

	public void setM_sDevicePort(String m_sDevicePort) {
		this.m_sDevicePort = m_sDevicePort;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public Integer getChannelNum() {
		return channelNum;
	}

	public void setChannelNum(Integer channelNum) {
		this.channelNum = channelNum;
	}

	@Override
	public String toString() {
		return "HkSdkInfo [m_sDeviceIP=" + m_sDeviceIP + ", m_sDevicePort=" + m_sDevicePort + ", userName=" + userName
				+ ", password=" + password + "]";
	}
	
}
