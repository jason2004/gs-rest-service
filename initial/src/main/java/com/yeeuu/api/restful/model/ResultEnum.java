package com.yeeuu.api.restful.model;

public enum ResultEnum {
	SUCCESS,
	INVALID_AUTHENTICATION,
	INVALID_PARAM,
	OPENED_LOCK,
	SYSTEM_EXCEPTION,
	UNEXPECTED_EXCEPTION,
	OPERATION_FAILED,
	OPERATION_TIMEOUT,
	LockNotConnected,
	HostNotConnected;
}
