package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SampleController {

	@RequestMapping(value = "/spsample")
	public ModelAndView page(ModelAndView mav) {
		mav.setViewName("sample"); //遷移先のview名を拡張子無しで指定(フォルダ階層がある場合はそれも含む)
		return mav;
	}
	
	//ModelAndView使わない場合
	@GetMapping(value="/hello")
	public String hello(Model model) {
		model.addAttribute("controller", "SampleController");
		return "hello";				//src/main/resources/templatesからのパスで指定
	}
}
