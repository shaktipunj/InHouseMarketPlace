package com.cg.ima.dto;

public class SuccessMessageDto {

	private String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public SuccessMessageDto()
	{
		
	}
	public SuccessMessageDto(String msg) {
		super();
		this.msg = msg;
	}
}
