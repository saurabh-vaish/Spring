package com.app.process;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 *  Scheduling :-  Scheduling to used to do a task simultaneously by container without (any user involve) 
 *  				by period of time or point of time is called Spring scheduling .
 *  
 *   			i.e. container automatically executes gives process or method after described time .
 * 	
 * 		***  works only in web applications .
 * 
 *   
 *   **** @EnableScheduling --> It is used to enable scheduling in spring . Write it in configuration file .
 *   
 *   
 *   **** @Scheduled ----> It is used over method that is going to scheduled . It takes time as parameter as Fixed Delay ,Fixed Rate or Cron expression
 *   
 *   **Scheduled Method ---> The method should be   public void methodName ()  {}  // no param with void 
 *   
 *   
 *   
 * ****  Period of Time :-  Time after some delay i.e. time gap without any time and date involved 
 *		   					eg. after 5 sec , one 2 months , 6 hours
 *   
 *   
 * ****  Point of Time :-   Point of time indicates time in which time and date involved .
 * 							e.g.  10.00 am , 12th may , 1:34:41 etc..  
 *   	
 *  				 
 *  *** Fixed Delay :-  In  fixed delay after certain fixed time the method will be called by container . It is concept of Period of time.
 *  					
 *  						e.g. if fixed delay : 5sec , execution time : 3sec . i.e. wait = 5sec 
 *  					  		  then container will wait exact 5 sec after executing  method 
 * 
 * 
 *	*** Fixed Rate  :-  	It indicates max wait time for next method call to be execute including method execution time . 
 *  					
 *  						if fixed rate > execution time ---> wait = fixed - execution 
 *  						if fixed rate <= execution time ---> wait = 0
 *  
 *  						e.g. if fixed delay : 5sec , execution time : 3sec . i.e. wait = 2sec 
 *  					  		  then container will wait exact 2 sec after executing  method 
 * 
 * 
 * 			****  Fixed Rate are denoted by cron expressions 
 * 
 *  
 *   **** Cron Expression --> It is expressed as * * * * * * .    
 *    							i.e.   sec(0-59)  minute(0-59)  hour(0-23)  day(1-31)  month(1-12)  week(Son - sat) 
 * 
 * 							---  , indicates  multiple values of same time and / indicates every  
 * **/




@Component
public class ProcessSchedular {


	/***** using fixedDelay  **********/
 	
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
		
		
		/********  Fixed Rate   Using  cron  ************/
		
		
		@Scheduled(cron="*/15 * * * * *")
		public void usingCron1()
		{
			System.out.println("hello using cron after every 15 sec");
		}
		
	
		@Scheduled(cron="0 0 10 * * *")
		public void  usingCron2()
		{
			System.out.println("every date in morning at 10.00 am  "+ new Date());
		}
		
		
		@Scheduled(cron="0 0 10,11,16 * * *")			// follow 24 hr format
		public void  usingCron3()
		{
			System.out.println(" at 10.00 am ,11.00 am , 4.00 pm  "+ new Date());
		}
		
		
		@Scheduled(cron=" 0 0 9 * * SUN ")
		public void  usingCron4()
		{
			System.out.println("every sunday  at 9.00 am  "+ new Date());
		}
		
}
