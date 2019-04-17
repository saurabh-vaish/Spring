package com.app.config;

import java.util.Properties;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@EnableTransactionManagement
@ComponentScan("com.app")
@PropertySource("classpath:app.properties")
public class AppConfig {
	
	@Autowired
	private Environment env;
	
	@Bean
	public InternalResourceViewResolver ivr()
	{
		InternalResourceViewResolver vr = new InternalResourceViewResolver();
		vr.setPrefix(env.getProperty("prefix"));
		vr.setSuffix(env.getProperty("suffix"));
		return vr;
	}
	
	
	@Bean
	public BasicDataSource dataSource()
	{
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName(env.getProperty("driver"));
		ds.setUrl(env.getProperty("url"));
		ds.setUsername(env.getProperty("user"));
		ds.setPassword(env.getProperty("pwd"));
		ds.setInitialSize(2);
		ds.setMaxTotal(2);
		ds.setMaxIdle(1);
		ds.setMinIdle(1);
		return ds;
	}
	
	
	@Bean
	public LocalSessionFactoryBean sessionFactory()
	{
		LocalSessionFactoryBean sf = new LocalSessionFactoryBean();
		sf.setDataSource(dataSource());
		sf.setPackagesToScan("com.app");
		sf.setHibernateProperties(props());
		return sf;
	}

	
	private Properties props()
	{
		Properties p = new Properties();
		p.put("hibernate.dialect", env.getProperty("dialect"));
		p.put("hibernate.show_sql", env.getProperty("showsql"));
		p.put("hibernate.format_sql", env.getProperty("fmtsql"));
		p.put("hibernate.hbm2ddl.auto", env.getProperty("hbm2ddl"));
		return p;
	}
	
	@Bean
	public HibernateTemplate ht()
	{
		HibernateTemplate h =  new HibernateTemplate();
		h.setSessionFactory(sessionFactory().getObject());
		return h;
	}
	
	
	@Bean
	public HibernateTransactionManager htm()
	{
		HibernateTransactionManager hm =  new HibernateTransactionManager();
		hm.setSessionFactory(sessionFactory().getObject());
		return hm;
	}
	
	
}
