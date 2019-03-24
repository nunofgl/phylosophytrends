package net.nunolages.philosophytrends.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PhilosophyTrendsController {

	@GetMapping(value = { "/" })
	public ModelAndView app() {
		ModelAndView model = new ModelAndView();
		model.setViewName("app");
		return model;
	}
}