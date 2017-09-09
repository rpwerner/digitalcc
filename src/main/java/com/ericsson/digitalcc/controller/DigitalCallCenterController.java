package com.ericsson.digitalcc.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ericsson.digitalcc.response.WebhookResponse;

@RestController
@RequestMapping("/webhook")
public class DigitalCallCenterController 
{

	/*@RequestMapping(value = "/home")
	public String home() 
	{
	    return "The rest controller is alive";
	}*/

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody WebhookResponse webhook(@RequestBody String obj)
    {

        System.out.println(obj);

        return new WebhookResponse("Hello! " + obj, "Text " + obj);
    }
	
}
