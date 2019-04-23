package com.xiaofei.bean;

public class MyUser {
	private Integer uid;
	private String uname;
	private String usex;
	public MyUser() {
		super();
	}
	public MyUser(Integer uid, String uname, String usex) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.usex = usex;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUsex() {
		return usex;
	}
	public void setUsex(String usex) {
		this.usex = usex;
	}
	@Override
	public String toString() {
		return "MyUser [uid=" + uid + ", uname=" + uname + ", usex=" + usex + "]";
	}
}
