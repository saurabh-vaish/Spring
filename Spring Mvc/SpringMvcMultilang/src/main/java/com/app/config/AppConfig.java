package com.app.config;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("com.app")
@PropertySource("classpath:app.properties")
public class AppConfig implements WebMvcConfigurer // to configure interceptor
{  
	
	@Autowired
	private Environment env;
	
	@Bean
	public InternalResourceViewResolver ive()
	{
		InternalResourceViewResolver vr = new InternalResourceViewResolver();
		vr.setSuffix(env.getProperty("suffix"));
		vr.setPrefix(env.getProperty("prefix"));
		return vr;
	}
	
	// MessageSource(I) to reload properties file when new lang req comes 
	@Bean
	public ReloadableResourceBundleMessageSource messageSource()
	{
		ReloadableResourceBundleMessageSource ms = new ReloadableResourceBundleMessageSource();
		ms.setBasename("classpath:messages");
		ms.setDefaultEncoding("UTF-8");
		return ms;
	}

	//LocaleResolver(I) to store prefred lang to cookie
	@Bean
	public CookieLocaleResolver localeResolver()
	{
		CookieLocaleResolver lr = new CookieLocaleResolver();
		lr.setDefaultLocale(Locale.ENGLISH);
		lr.setCookieName("my-cke");
		return lr;
	}
	
	//Interceptor(I) to handle lang req 
	@Bean
	public LocaleChangeInterceptor interceptor()
	{
		LocaleChangeInterceptor lc = new LocaleChangeInterceptor();
		lc.setParamName("lang");
		return lc;
	}
	
	// add interceptor
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(interceptor());
	}
	
}
