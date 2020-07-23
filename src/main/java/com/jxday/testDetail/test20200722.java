package com.jxday.testDetail;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import static org.quartz.JobBuilder.newJob;
import static org.quartz.SimpleScheduleBuilder.simpleSchedule;
import static org.quartz.TriggerBuilder.newTrigger;

/**
 * 〈Quartz〉
 *
 * @author cty
 * @ClassName test20200722
 * @create 2020-07-22 09:25
 * @Version 1.0.0
 */
public class test20200722 implements Job {
    public static void main(String[] args) {
        
    }
    
    public void test01() throws SchedulerException {
        StdSchedulerFactory factory = new StdSchedulerFactory();
        Scheduler scheduler = factory.getScheduler();
        scheduler.start();

        // define the job and tie it to our HelloJob class
        JobDetail job = newJob(test20200722.class)
                .withIdentity("myJob", "group1")
                .build();

        // Trigger the job to run now, and then every 40 seconds
        Trigger trigger = newTrigger()
                .withIdentity("myTrigger", "group1")
                .startNow()
                .withSchedule(simpleSchedule()
                        .withIntervalInSeconds(40)
                        .repeatForever())
                .build();

        // Tell quartz to schedule the job using our trigger
        scheduler.scheduleJob(job, trigger);
        
    }

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        
    }
}
