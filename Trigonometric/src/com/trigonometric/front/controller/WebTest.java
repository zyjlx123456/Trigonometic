package com.trigonometric.front.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.util.RestResponse;


@Controller
@RequestMapping("/test")
public class WebTest {
	
	@RequestMapping(value = "/test.do", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> testInfo(HttpServletRequest request) {
	     RestResponse response = new RestResponse();
	     String id=request.getParameter("id");
	     System.out.println("id = "+1);
		 response.setRetObject("bean", "zyj");
		 return response.returnResult();
	}

}
