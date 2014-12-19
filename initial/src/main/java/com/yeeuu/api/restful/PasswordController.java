package com.yeeuu.api.restful;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yeeuu.api.restful.model.Result;
import com.yeeuu.api.restful.model.ResultEnum;

@RestController
public class PasswordController {
    protected static Logger logger = Logger.getLogger("info");
    
	@RequestMapping(value = "/passwords", method = RequestMethod.POST)
	public Result openlock(HttpServletRequest request) {
		System.out.println(request.getParameter("params"));
		Result result = new Result();
		result.setSuccess(false);
		result.setCode(ResultEnum.OPERATION_FAILED);
		result.setErrMsg("host is not on_line");
		return result;
	}
}
