package com.test;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;

public class CommonBean
{
	
	public CommonBean() {
		System.out.println("Enter CommonBean's constructor");
	}
	
    private String commonName;
    
    @Value("CommonName")
    public void setCommonName(String commonName)
    {
    	System.out.println("Enter CommonBean.setCommonName");
        this.commonName = commonName;
    }
    @PostConstruct
    public void initMethod()
    {
        System.out.println("Enter CommonBean.initMethod(), commonName = " + commonName);
    }
    
    public void before() {
    	System.out.println("HaHa,i do it Before!!");
    }
    public void after() {
    	System.out.println("HaHa,i do it after!!");
    }
}
