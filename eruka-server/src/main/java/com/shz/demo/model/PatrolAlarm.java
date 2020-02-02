package com.shz.demo.model;

public class PatrolAlarm {

	//主键
	private String id;
	
	//变电站id
	private String orgId;
	
	//巡检任务id
	private String xjrwId;
	
	//设备名称
	private String sbmc;
	
	//设备编号
	private String sbbh;
	
	//识别时间
	private String sbsj;
	
	//点位id
	private String dwid;
	
	//点位名称
	private String dwmc;
	
	//识别类型
	private String sblx;
	
	//识别结果
	private String sbjg;
	
	// 告警级别
	private String gjjb;
	
	//审核状态
	private String shzt;
	
	//告警描述
	private String gjms;
	
	//图片路径
	private String tplj;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOrgId() {
		return orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getXjrwId() {
		return xjrwId;
	}

	public void setXjrwId(String xjrwId) {
		this.xjrwId = xjrwId;
	}

	public String getSbmc() {
		return sbmc;
	}

	public void setSbmc(String sbmc) {
		this.sbmc = sbmc;
	}

	public String getSbbh() {
		return sbbh;
	}

	public void setSbbh(String sbbh) {
		this.sbbh = sbbh;
	}

	public String getSbsj() {
		return sbsj;
	}

	public void setSbsj(String sbsj) {
		this.sbsj = sbsj;
	}
	
	public String getDwid() {
		return dwid;
	}

	public void setDwid(String dwid) {
		this.dwid = dwid;
	}

	public String getDwmc() {
		return dwmc;
	}

	public void setDwmc(String dwmc) {
		this.dwmc = dwmc;
	}

	public String getSblx() {
		return sblx;
	}

	public void setSblx(String sblx) {
		this.sblx = sblx;
	}

	public String getSbjg() {
		return sbjg;
	}

	public void setSbjg(String sbjg) {
		this.sbjg = sbjg;
	}

	public String getGjjb() {
		return gjjb;
	}

	public void setGjjb(String gjjb) {
		this.gjjb = gjjb;
	}

	public String getShzt() {
		return shzt;
	}

	public void setShzt(String shzt) {
		this.shzt = shzt;
	}

	public String getGjms() {
		return gjms;
	}

	public void setGjms(String gjms) {
		this.gjms = gjms;
	}

	public String getTplj() {
		return tplj;
	}

	public void setTplj(String tplj) {
		this.tplj = tplj;
	}

	@Override
	public String toString() {
		return "PatrolAlarm [id=" + id + ", orgId=" + orgId + ", sbmc=" + sbmc + ", sbbh=" + sbbh + ", sbsj=" + sbsj
				+ ", dwmc=" + dwmc + ", sblx=" + sblx + ", sbjg=" + sbjg + ", gjjb=" + gjjb + ", shzt=" + shzt
				+ ", gjms=" + gjms + ", tplj=" + tplj + "]";
	}
}
