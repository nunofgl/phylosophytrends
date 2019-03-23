package net.nunolages.philosophytrends;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		// Without this browsers will throw an error and not connect to the app
		http.headers()
				.frameOptions().sameOrigin()
				.httpStrictTransportSecurity().disable();
	}
}