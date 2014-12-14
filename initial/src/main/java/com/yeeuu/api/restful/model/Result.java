package com.yeeuu.api.restful.model;

public class Result {
	public boolean success;
	public ResultEnum code;
	public String errMsg;

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public ResultEnum getCode() {
		return code;
	}

	public void setCode(ResultEnum code) {
		this.code = code;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
}
