package com.dk.util;

import com.dk.object.RfidInfo;

public class RFIDUtil {
	public boolean addInfo(String str){
		boolean flag = false;
		RfidInfo info = new RfidInfo();
		info.setEpc(str.substring(22,34));
		flag = MyUtil.addInfo(info);
		return flag;
	}
	
	public RfidInfo getInfo(String str){
		RfidInfo info = new RfidInfo();
		info = MyUtil.getInfo(str.substring(22,34));
		return info;
	}

}