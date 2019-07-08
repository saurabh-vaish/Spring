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

@Configuration
@EnableTransactionManagement
@ComponentScan("com.app")
@PropertySource("classpath:app.properties")
public class AppConfig {

	@Autowired
	private Environment env;
		
	/*** Orm properties ***/
	

	/*
	
	// DataSource
	@Bean
	public DriverManagerDataSource dataSource()
	{
		DriverManagerDataSource dms = new DriverManagerDataSource();
		dms.setDriverClassName(env.getProperty("driver"));
		dms.setUrl(env.getProperty("url"));
		dms.setUsername(env.getProperty("user"));
		dms.setPassword(env.getProperty("pwd"));
		return dms;
	}


	*/
	
	// or 
	
	// DataSource  with pooling
	@Bean
	public BasicDataSource dataSource()				// with connection pooling
	{
		BasicDataSource bs = new BasicDataSource();
		bs.setDriverClassName(env.getProperty("driver"));
		bs.setUrl(env.getProperty("url"));
		bs.setUsername(env.getProperty("user"));
		bs.setPassword(env.getProperty("pwd"));
		bs.setInitialSize(1);
		bs.setMaxTotal(2);
		bs.setMinIdle(1);
		bs.setMaxIdle(1);
		return bs;
	}
	
	
	// session factory
	@Bean
	public LocalSessionFactoryBean sessionFactory()
	{
		LocalSessionFactoryBean sf = new LocalSessionFactoryBean();
		sf.setDataSource(dataSource());
		sf.setPackagesToScan("com.app.model");
		sf.setHibernateProperties(props());
		return sf;
	}
	
	
	// hibernate properties
	
	public Properties props()
	{
		Properties p = new Properties();
		p.put("hibernate.dialect",env.getProperty("dialect"));
		p.put("hibernate.show_sql",env.getProperty("showsql"));
		p.put("hibernate.format_sql",env.getProperty("fmtsql"));
		p.put("hibernate.hbm2ddl.auto",env.getProperty("hbm2ddl"));
		return p;
	}
	
	
	// HibernateTemplate
	@Bean
	public HibernateTemplate hibernateTemplate()
	{
		HibernateTemplate ht = new HibernateTemplate(); 
		ht.setSessionFactory(sessionFactory().getObject());
		
		return ht;
	}
	
	// HibernateTransactionManager
		@Bean
		public HibernateTransactionManager transactionManager()
		{
			HibernateTransactionManager htm = new HibernateTransactionManager();
			htm.setSessionFactory(sessionFactory().getObject());
			return htm;
		}
		
}
