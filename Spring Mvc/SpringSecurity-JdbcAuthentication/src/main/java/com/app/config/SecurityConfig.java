package com.app.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;


@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	
	@Autowired
	private DataSource dataSource; 		// for jdbc
	
	@Autowired
	private BCryptPasswordEncoder pwdEncoder;
	
	String usernameSQL = "select username, password, enabled from users where username=?";
	String authSql = "select username, authority from authorities where username=?";
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		auth.jdbcAuthentication()			// authentication using jdbc
		.dataSource(dataSource)				// setting datasource for database connection
		.usersByUsernameQuery(usernameSQL)		// for matching users details
		.authoritiesByUsernameQuery(authSql)	// for matching roles
		.passwordEncoder(pwdEncoder)			// setting password encoder
		;
	
	}
	
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
	
		http.authorizeRequests()
		.antMatchers("/all").permitAll()
		.antMatchers("/emp").hasAuthority("EMP")
		.antMatchers("/admin").hasAuthority("ADMIN")
		.antMatchers("/common").hasAnyAuthority("ADMIN","EMP")
		.anyRequest().authenticated()
		
		
		// form login
		.and()
		.formLogin()
		.defaultSuccessUrl("/view",true)
		
		//logout 
		.and()
		.logout()
		.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
		.logoutSuccessUrl("/login?logout")
		
		//error page
		.and()
		.exceptionHandling()
		.accessDeniedPage("/denied")
		;
	}
	
}
