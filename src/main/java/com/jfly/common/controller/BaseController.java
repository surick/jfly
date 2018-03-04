package com.jfly.common.controller;

import com.jfly.system.domain.UserToken;
import org.springframework.stereotype.Controller;
import com.jfly.common.utils.ShiroUtils;
import com.jfly.system.domain.UserDO;

@Controller
public class BaseController {
	public UserDO getUser() {
		return ShiroUtils.getUser();
	}

	public Long getUserId() {
		return getUser().getUserId();
	}

	public String getUsername() {
		return getUser().getUsername();
	}
}