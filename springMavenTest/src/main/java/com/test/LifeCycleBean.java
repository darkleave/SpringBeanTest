package com.test;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;

public class LifeCycleBean implements InitializingBean,DisposableBean{

	
		public LifeCycleBean() {
			System.out.println("Construct LifeCycleBean");
		}
	 	
	    private String    lifeCycleBeanName;
	    @Value("lifeCycleBeanName")
	    public void setLifeCycleBeanName(String lifeCycleBeanName)
	    {
	        System.out.println("Enter LifecycleBean.setLifeCycleBeanName(), lifeCycleBeanName = " + lifeCycleBeanName);
	        this.lifeCycleBeanName = lifeCycleBeanName;
	    }
	    
	    public String getLifeCycleBeanName() {
	    	return this.lifeCycleBeanName;
	    }
	    
	    public void destroy() throws Exception
	    {
	        System.out.println("Enter LifecycleBean.destroy()");
	    }

	    public void afterPropertiesSet() throws Exception
	    {
	        System.out.println("Enter LifecycleBean.afterPropertiesSet()");
	    }
	    @PostConstruct 
	    public void beanStart()
	    {
	        System.out.println("Enter LifecycleBean.beanStart()");
	    }
	    @PreDestroy
	    public void beanEnd()
	    {
	        System.out.println("Enter LifecycleBean.beanEnd()");
	    }

}
