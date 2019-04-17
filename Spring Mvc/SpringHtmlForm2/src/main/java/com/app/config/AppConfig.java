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

import com.app.model.User;

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
		vr.setSuffix(env.getProperty("suffix"));
		vr.setPrefix(env.getProperty("prefix"));
		return vr;
	}

	
	@Bean
	public BasicDataSource bsObj()
	{
		BasicDataSource bs =new BasicDataSource();;
		bs.setDriverClassName(env.getProperty("dc"));
		bs.setUrl(env.getProperty("url"));
		bs.setUsername(env.getProperty("usr"));
		bs.setPassword(env.getProperty("pwd"));
		bs.setInitialSize(2);
		bs.setMaxTotal(1);
		bs.setMaxIdle(1);
		bs.setMinIdle(1);
		return bs;
	}
	
	@Bean
	public LocalSessionFactoryBean sfObj()
	{
		LocalSessionFactoryBean sf = new LocalSessionFactoryBean();
		sf.setDataSource(bsObj());
		sf.setHibernateProperties(props());
		sf.setAnnotatedClasses(User.class);
		return sf;
	}
	
	public Properties props()
	{
		Properties p = new Properties();
		p.put("hibernate.dialect",env.getProperty("dialect"));
		p.put("hibernate.show_sql",env.getProperty("showsql"));
		p.put("hibernate.format_sql",env.getProperty("fmtsql"));
		p.put("hibernate.hbm2ddl.auto",env.getProperty("hbm2ddl"));
		return p;
	}
	
	
	@Bean
	public HibernateTemplate ht()
	{
		HibernateTemplate ht = new HibernateTemplate();
		ht.setSessionFactory(sfObj().getObject());
		return ht;
	}
	
	@Bean
	public HibernateTransactionManager htm()
	{
		HibernateTransactionManager htm = new HibernateTransactionManager();
		htm.setSessionFactory(sfObj().getObject());
		return htm;
	}
	

	
}
