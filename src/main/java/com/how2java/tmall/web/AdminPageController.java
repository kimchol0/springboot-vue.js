package com.how2java.tmall.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AdminPageController {
	@GetMapping(value="/admin")
	public String admin() {
		return "redirect:admin_category_list";
	}
	@GetMapping(value="/admin_category_list")
	public String listCategory() {
		return "admin/listCategory";
	}
	@GetMapping(value="/admin_category_edit")
	public String editCategory() {
		return "admin/editCategory";
	}
}
