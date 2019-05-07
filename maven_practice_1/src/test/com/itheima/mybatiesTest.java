package com.itheima;

import com.itheima.dao.MavenDao;
import com.itheima.domain.Items;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mybatiesTest {

    @Test
    public void testFindItemsById(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        MavenDao mavenDao = ac.getBean(MavenDao.class);
        Items byId = mavenDao.findById(1);
        System.out.println(byId);
    }
}
