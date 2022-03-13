package com.ofss;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

	@RequestMapping(value="hello", method=RequestMethod.GET)
	public String m1(@RequestParam(value="myName") String myName1, ModelMap map)
	{
		map.addAttribute("msg","Hello "+myName1);
		return "hello";
	}
}