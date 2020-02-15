package com.example.demo2.config;


import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
//	@Autowired
//	UserServiceHibernate userServiceHibernate;
	
	@Override
	public void configure(HttpSecurity http) throws Exception {
		http
		.authorizeRequests()
//		.antMatchers("/topic/add", "/topic/{topicId}/addComment", "/topic/{topicId}/reply").authenticated()
		.anyRequest().permitAll()
		.and()
//		.formLogin().loginPage("/").loginProcessingUrl("/login_check").and()
		.httpBasic()
//		.and().logout().logoutUrl("/logout").logoutSuccessUrl("/");
		;
		}
	
	@Override
	public void configure(AuthenticationManagerBuilder auth)	throws Exception {
		auth.inMemoryAuthentication()
				.withUser("user").password("password").roles("USER").
				and()
				.withUser("admin").password("password").roles("USER", "ADMIN");

//		auth.userDetailsService(userServiceHibernate);

	}
}
