package com.zw.moive.controller;

import javax.annotation.Resource;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.zw.moive.domain.Moive;
import com.zw.moive.domain.MoiveVO;
import com.zw.moive.service.MoiveService;

@Controller
public class MoiveController {
	@Resource
	private MoiveService moiveService;
	
	@RequestMapping("list.do")
	public String list(Model model,MoiveVO moiveVO,@RequestParam(defaultValue = "1")Integer pageNum,@RequestParam(defaultValue = "2")Integer pageSize) {
		PageInfo<Moive> info = moiveService.list(moiveVO,pageNum,pageSize);
		model.addAttribute("info", info);
		model.addAttribute("moiveVO", moiveVO);
		model.addAttribute("pageNum", pageNum);
		return "list";
	}
	
}
