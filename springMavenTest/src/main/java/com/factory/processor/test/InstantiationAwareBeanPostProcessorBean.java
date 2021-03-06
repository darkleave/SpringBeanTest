package com.factory.processor.test;

import java.beans.PropertyDescriptor;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;

import com.test.CommonBean;

/**
 * @author 五月的仓颉 http://www.cnblogs.com/xrq730/p/5721366.html
 */
public class InstantiationAwareBeanPostProcessorBean implements InstantiationAwareBeanPostProcessor
{
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException
    {
    	if(bean instanceof CommonBean) {
    		System.out.println("Enter InstantiationAwareBeanPostProcessorBean.postProcessAfterInitialization()");
            
    	}
    	
        return bean;
    }

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException
    {
    	if(bean instanceof CommonBean) {
    		 System.out.println("Enter InstantiationAwareBeanPostProcessorBean.postProcessBeforeInitialization()");
    	        
    	}
       return bean;
    }

    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException
    {
    	if(bean instanceof CommonBean) {
    		System.out.println("Enter InstantiationAwareBeanPostProcessorBean.postProcessAfterInstantiation()boolean");
    	       
    	}
        return true;
    }
    			
    public Object postProcessBeforeInstantiation(Class<?> bean, String beanName) throws BeansException
    {
    	if(bean.getSimpleName().equals("CommonBean")) {
    		System.out.println("Enter InstantiationAwareBeanPostProcessorBean.postProcessBeforeInstantiation()Class");
            
    	}
        
        return null;
    }

    public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pd, Object bean,
            String beanName) throws BeansException
    {
    	if(bean instanceof CommonBean) {
    		System.out.println("Enter postProcessPropertyValues");
    	}
    	
    	
        return pvs;
    }
}