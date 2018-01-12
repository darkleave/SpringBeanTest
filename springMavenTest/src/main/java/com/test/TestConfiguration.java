package com.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.factory.processor.test.FactoryPostProcessorBean;
import com.factory.processor.test.InstantiationAwareBeanPostProcessorBean;
import com.factory.test.AnimalFactoryBean;

@Configuration
public class TestConfiguration {

	
	@Bean
	public TestBean testBean() {
		return new TestBean();
	}
	
	@Bean
	public AwareBean awareBean() {
		return new AwareBean();
	}
	@Bean
	public LifeCycleBean lifeCycleBean( ) {
		LifeCycleBean bean = new LifeCycleBean();
		return bean;
	}
	@Bean
	public AnimalFactoryBean animalFactoryBean() {
		
		return new AnimalFactoryBean();
	}
	@Bean
	public PostProcessorBean postProcessorBean() {
		return new PostProcessorBean();
	}
	
	@Bean
	public CommonBean commonBean() {
		return new CommonBean();
	}
	@Bean
	public FactoryPostProcessorBean factoryPostProcessorBean() {
		return new FactoryPostProcessorBean();
	}
	@Bean
	public InstantiationAwareBeanPostProcessorBean instantiationAwareBeanPostProcessorBean() {
		return new InstantiationAwareBeanPostProcessorBean();
	}
	
}
