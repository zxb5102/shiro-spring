package com.github.zhangkaitao.shiro.chapter12.entity;

public class RespMessage {

	private String msg;
	private Object data;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "RespMessage [msg=" + msg + ", data=" + data + "]";
	}

	public RespMessage(String msg, Object data) {
		super();
		this.msg = msg;
		this.data = data;
	}

	public RespMessage() {
		super();
	}

}
