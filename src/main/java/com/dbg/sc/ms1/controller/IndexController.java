package com.dbg.sc.ms1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dbg.sc.ms1.dto.StatusDTO;

@RestController
@RequestMapping("/")
public class IndexController {

	@RequestMapping(method = RequestMethod.GET)
	public StatusDTO index() {
		return new StatusDTO();
	}

}
