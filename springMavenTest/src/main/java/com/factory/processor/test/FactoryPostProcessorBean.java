package com.factory.processor.test;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AutowireCandidateResolver;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * @author 五月的仓颉 http://www.cnblogs.com/xrq730/p/5721366.html
 */
public class FactoryPostProcessorBean implements BeanFactoryPostProcessor
{
	
	private AutowireCandidateResolver parent = null;
    private BeanFactory beanFactory = null;
	
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurablelistablebeanfactory)
            throws BeansException
    {
        System.out.println("Enter FactoryPostProcessorBean.postProcessBeanFactory()\n");
        
        //zhztest
        DefaultListableBeanFactory dlbf = (DefaultListableBeanFactory) configurablelistablebeanfactory;
        parent = dlbf.getAutowireCandidateResolver();
//        dlbf.setAutowireCandidateResolver(this);

        beanFactory = configurablelistablebeanfactory;
        //
        
        BeanDefinition beanDefinition = configurablelistablebeanfactory.getBeanDefinition("commonBean");
        MutablePropertyValues beanProperty = beanDefinition.getPropertyValues();
        System.out.println("scope before change：" + beanDefinition.getScope());
        beanDefinition.setScope("singleton");
        System.out.println("scope after change：" + beanDefinition.getScope());
        System.out.println("beanProperty：" + beanProperty);
    }
}
