package net.nunolages.phylosophytrends;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	// inject via application.properties
	@Value("${welcome.message:test}")
	private String message = "Hello World";

	// This method is an example of a method that accepts a model and returns a view
	// through its name
	@RequestMapping("/hello")
	public String hello(Map<String, Object> model) {
		model.put("message", this.message);
		return "hello";
	}

	// This method is an example of a method that returns a ModelAndView object
	// For a discussion of Model (String) VS ModelAndView see
	// https://stackoverflow.com/questions/16951609/when-to-use-modelandview-vs-model-in-spring
	@RequestMapping(value = { "/", "/welcome" }, method = RequestMethod.GET)
	public ModelAndView welcome() {
		ModelAndView model = new ModelAndView();
		Map<String, Object> modelMap = new HashMap<String, Object>();
		modelMap.put("message", this.message);
		model.setViewName("welcome");
		model.addAllObjects(modelMap);
		return model;
	}
}