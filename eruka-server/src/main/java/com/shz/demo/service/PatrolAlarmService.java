package com.shz.demo.service;

import com.shz.demo.model.PatrolAlarm;

public interface PatrolAlarmService {

	//保存告警信息
	public Boolean SaveAlarm(PatrolAlarm patrolAlarm);
	
}
