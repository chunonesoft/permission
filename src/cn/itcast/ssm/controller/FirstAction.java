package cn.itcast.ssm.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.itcast.ssm.po.ActiveUser;
import cn.itcast.ssm.po.SysPermission;

@Controller
public class FirstAction {
	//系统首页
	//重要修改
	@RequestMapping("/first")
	public String first(Model model)throws Exception{
		return "/first";
	}
	
	//欢迎页面
	@RequestMapping("/welcome")
	public String welcome(Model model)throws Exception{
		
		return "/welcome";
		
	}
}	
