package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.factory.test.AnimalFactoryBean;
import com.test.LifeCycleBean;
import com.test.TestBean;

@RestController
@SpringBootApplication
@EnableAutoConfiguration
public class Example {

	private TestBean testBean;
	@Autowired
	public void setTestBean(TestBean testBean) {
		this.testBean = testBean;
	}
	
	private LifeCycleBean lifeCycleBean;
	@Autowired
	public void setLifeCycleBean(LifeCycleBean lifeCycleBean) {
		this.lifeCycleBean = lifeCycleBean;
	}
	
    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
    	ConfigurableApplicationContext context = SpringApplication.run(Example.class, args);
    	
    	AnimalFactoryBean bean = context.getBean(AnimalFactoryBean.class);
    	
    	bean.getObject().move();
    	
    	Thread.sleep(5000);
    	
    	context.close();
    	
//    	context.getBean(TestBean.class);
    }

}