package de.tekup.vue.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import de.tekup.vue.models.User;
import de.tekup.vue.models.UserDB;
import de.tekup.vue.models.WelcomeMsg;

@Controller
public class IndexCtrl {

	@GetMapping({"/","/index"})
	public String getIndex(Model model) {
		WelcomeMsg welcome=new WelcomeMsg("Hello GLSI-B","Welcome in Spring course");
		model.addAttribute("welcomeMsg", welcome);
		return "index";
	}
	
	@GetMapping("/add/user")
	public String getUserAdd(Model model) {
		model.addAttribute("user", new User());
		return "users/add-user";
	}
	
	@PostMapping("/add/user")
	public String postUserAdd(@ModelAttribute("user") User user) {
		UserDB.addUser(user);
		System.out.println(UserDB.getUsers());
		return "redirect:/";
	}
}
