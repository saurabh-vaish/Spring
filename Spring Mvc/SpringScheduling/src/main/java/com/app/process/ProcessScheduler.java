package com.app.process;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ProcessScheduler {

	
	// using fixedDelay
	
	@Scheduled(fixedDelay=4000)
	public void showInSeconds()
	{
		System.out.println("hello after 4 seconds" + new Date());
	}
	
	@Scheduled(fixedDelay=1000*60)
	public void showInMinutes()
	{
		System.out.println("hello after 1 minutes" + new Date());
	}
	
	@Scheduled(fixedDelay=1000*60*60*4)
	public void showInhours()
	{
		System.out.println("hello after 4 hours" + new Date());
	}
	
	@Scheduled(fixedDelay=1000*60*60*24*6)
	public void showInDays()
	{
		System.out.println("hello after 6 days" + new Date());
	}
	
	@Scheduled(fixedDelay=1000*60*60*24*7*2)
	public void showInWeeks()
	{
		System.out.println("hello after 2 weeks" + new Date());
	}
	
	
	/*
	 * @Scheduled(fixedDelay=1000*60*60*24*30*3) public void showInMonths() {
	 * System.out.println("hello after 3 months" + new Date()); }
	 */
	
	
	// using cron expression
	
	@Scheduled(cron="*/15 * * * * *")
	public void usingCron()
	{
		System.out.println("hello using cron after every 15 sec");
	}
	
	
	
}
