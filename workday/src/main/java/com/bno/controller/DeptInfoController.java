package com.bno.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.bno.service.DeptInfoService;

@Controller
public class DeptInfoController {
	
	private static Logger logger = LoggerFactory.getLogger(DeptInfoController.class);
	
	
	
	@Autowired
	private DeptInfoService service;
	
	
	
	
	
}//class end
