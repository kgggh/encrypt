package com.spring.test;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.test.test1.UserService;
import com.spring.test.test2.EncryptService;


/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	EncryptService encryService;
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "home";
	}
	
	@RequestMapping(value = "/test1")
	public String test1(){
		return "test1";
	}
	@RequestMapping(value = "/login")
	public String login(@RequestParam("id") String id, @RequestParam("password") String password){
		if(!id.equals("kgggh")) {
			System.out.println("실패===\n" + "id=" + id + "\n pw=" + password );
			return "login_fail";
		}else if(!password.equals("1234")){
			System.out.println("실패===\n" + "id=" + id + "\n pw=" + password );
			return "login_fail";
		}else {
			System.out.println("성공===\n" + "id=" + id + "\n pw=" + password );
			return "login_ok";
		}
		
	}
	
	
	@RequestMapping(value = "/test2")
	public String test2(){
		return "test2";
	}
	@RequestMapping(value = "/encrypt")
	public String encrypt(@RequestParam("key") String key,HttpSession session,Model model){
		String encrypt = encryService.encStr(key);
		session.setAttribute("key", key);
		session.setAttribute("encrypt", encrypt);
		return "encrypt";
	}
	@RequestMapping(value = "/decrypt")
	public String decrypt(@RequestParam("key")String encStr,String key,HttpSession session,Model model){
		String decrypt = encryService.decStr(encStr);
		session.setAttribute("key", key);
		session.setAttribute("decrypt", decrypt);
		
		
		return "decrypt";
	}
	
	
}
