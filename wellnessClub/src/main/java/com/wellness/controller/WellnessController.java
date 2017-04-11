package com.wellness.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.View;

import com.webapp.model.Wellness;
import com.wellness.service.SendMail;

@Controller
public class WellnessController {

	public WellnessController() {
		System.out.println("in WellnessController servelet");
	}
	
	
	
	SendMail mailService =new SendMail();
	
	    @RequestMapping(value = {"index", "/"}, method = RequestMethod.GET)
	    public String index(Model model){ 
	    model.addAttribute("msg", "Hi welcome to my first servlet");	
	    	return "index";
		}
	 // get method for contact
	    @RequestMapping(value = "/contact", method = RequestMethod.GET)
	    public String contact(Model model){ 
	    model.addAttribute("sendEmail", new Wellness());	
	    model.addAttribute("message", "Wellcome to wellness, please drop us an email"); 
	    	return "contact";
	    }
	    
	 // post for sending email and validate the inputs

	    @RequestMapping(value = {"/logins"}, method = RequestMethod.GET)
	    public String logins(Model model){ 
	    model.addAttribute("msg", "Hi welcome to my first servlet");	
	    	return "kennyLoggins";
		}
	    
	    @RequestMapping(value = "/sendEmail", method = RequestMethod.POST)
	    	public String sendMail(@ModelAttribute("sendEmail") Wellness sendEmail, BindingResult bindingResult, Model model) { 
	   	    	          
	    	String validemails = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"; 
	    	model.addAttribute("em", sendEmail.getEmailAddress());
	    	model.addAttribute("sb", sendEmail.getSubject());      	              
	    	String message="Subject: " +sendEmail.getSubject()+"\nMessage: " + sendEmail.getMsg();
	   	          
	    	if(!sendEmail.getEmailAddress().matches(validemails)) {
	    		model.addAttribute("emailrror", "Invalid email "+ sendEmail.getEmailAddress()+ " use format johnsmith@scglobal.com ");		                  
	    	}
	   	                  
	    	if(sendEmail.getSubject().isEmpty()) {
	    		model.addAttribute("sbjrror", "Please enter Emain Subject");		                   
	    	}  
	   	                  
	    	if(sendEmail.getMsg().length() <= 1 || sendEmail.getMsg().length() > 300) {
	    		model.addAttribute("msgerror", "Must be between 10 and 300 characters");		                   
	    	}
	   	                  
	    	else
	   			       
	    		try {     
	    			mailService.sendMails(sendEmail.getEmailAddress() , sendEmail.getSubject(), message.toString());					          
	    			model.addAttribute("success", "Thanks Email has been sent to "+ sendEmail.getEmailAddress());
	    			model.addAttribute("emailrror", "");  
	    			model.addAttribute("sbjrror", "");		                   
	    			model.addAttribute("msgerror", "");
	    			model.addAttribute("em", "");
	    			model.addAttribute("sb", "");   
	   			       	           
	    		}catch(Exception e) {
	    			model.addAttribute("sendmailfail", "Error sending email  " );
	    			e.printStackTrace();
	    		}
	   					
	    	return "contact";
	    }
	    
	    @RequestMapping(value = "/about", method = RequestMethod.GET)
	    public String about(Model model){ 
	    	model.addAttribute("sendEmail");
	    
	    	return "about";
	    }
	    
	    @RequestMapping(value = "/products", method = RequestMethod.GET)
	    public String products(Model model){ 
	    model.addAttribute("sendEmail");	
	    	return "products";
	    }
	    
	    @RequestMapping(value = "/calculate", method = RequestMethod.GET)
	    public String calculate(Model model){ 
	    model.addAttribute("sendEmail");	
	    	return "calculate";
	    }
	    
	    @RequestMapping(value ="area",  method = RequestMethod.POST)
	    public String calcl(@RequestParam Map<String,String> requestParams,Model model) throws Exception{
	    		String name=requestParams.get("name");
	    		String w=requestParams.get("ws");
	    		String h=requestParams.get("hs");

	    		String nam = String.valueOf(name);
	           Integer wts = Integer.valueOf(w);
	           Integer hts = Integer.valueOf(h);

	           model.addAttribute("name", "shape is " +nam);
	           model.addAttribute("ws", "weight is " +wts);
	           model.addAttribute("hs", "height is " +hts);
	           model.addAttribute("area", "The Area is "+ hts*wts);



	        return "calculate";
	    }
}