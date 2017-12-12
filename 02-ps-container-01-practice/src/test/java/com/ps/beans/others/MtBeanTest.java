package com.ps.beans.others;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by iuliana.cosmina on 3/26/16.
 */
public class MtBeanTest {

    private Logger logger = LoggerFactory.getLogger(MtBeanTest.class);

    @Test
    public void testConfig() {
        //TODO 6. Modify this class to use the new set of configuration files, created by resolving TODO 5.
        //TODO 7. Try to use wildcards as well.
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring/others/sample-config-01.xml");

        MultipleTypesBean mtBean = (MultipleTypesBean) ctx.getBean("mtBean");
        assertNotNull(mtBean);
        ApplicationContext ctx2 = new ClassPathXmlApplicationContext("classpath:spring/others/split*.xml");
        int count1 = ctx.getBeanDefinitionCount();
        int count2 = ctx2.getBeanDefinitionCount();
        assertEquals(count1,count2);


    }
}
