/**
 * 
 */
package com.eka.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author manoj
 *
 */
@ComponentScan
@Controller
public class LoginController {

	@RequestMapping("/profile")
	public ModelAndView login() {
		System.out.println("loggedin");
		ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        return modelAndView;
	}
}
