package com.ps.beans.set;

import com.ps.beans.set.ComplexBean2Impl;
import com.ps.beans.set.ComplexBeanImpl;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by iuliana.cosmina on 3/26/16.
 */
public class SIBeansTest {
    private Logger logger = LoggerFactory.getLogger(SIBeansTest.class);

    @Test
    public void testConfig() {
        // ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring/set/sample-config-01.xml");
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring/set/sample-config-02.xml");

        logger.info(" --- All beans in context --- ");
        for(String beanName :  ctx.getBeanDefinitionNames()) {
            logger.info("Bean " + beanName + " of type " + ctx.getBean(beanName).getClass().getSimpleName());
        }
com.ps.beans.set.ComplexBeanImpl complexBean0 = (com.ps.beans.set.ComplexBeanImpl) ctx.getBean("complexBean0");
        com.ps.beans.set.ComplexBeanImpl complexBean1 = (ComplexBeanImpl) ctx.getBean("complexBean1");
        assertNotNull(complexBean0.getSimpleBean());
        assertNotNull(complexBean1.getSimpleBean());
        assertTrue(complexBean1.isComplex());
        com.ps.beans.set.ComplexBean2Impl complexBean2 = (ComplexBean2Impl) ctx.getBean("complexBean2");
        assertNotNull(complexBean2.getSimpleBean());

    }
}
