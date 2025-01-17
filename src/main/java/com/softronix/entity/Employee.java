package com.softronix.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.domain.Persistable;

public class Employee implements Persistable<String>{
	
	public static boolean isNew = false;
	
	@Id
	private String eid;
	
	private String ename;
	private String eaddr;
	private String esal;
	
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEaddr() {
		return eaddr;
	}
	public void setEaddr(String eaddr) {
		this.eaddr = eaddr;
	}
	public String getEsal() {
		return esal;
	}
	public void setEsal(String esal) {
		this.esal = esal;
	}
	@Override
	public String getId() {
		
		return eid;
	}
	@Override
	public boolean isNew() {
		return isNew;
	}
	

}
