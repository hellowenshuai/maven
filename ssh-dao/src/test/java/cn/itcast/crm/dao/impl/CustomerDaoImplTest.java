package cn.itcast.crm.dao.impl;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.crm.dao.CustomerDao;
import cn.itcast.crm.entity.Customer;

public class CustomerDaoImplTest {

	@Test
	public void test() {
		ApplicationContext aap =new ClassPathXmlApplicationContext("classpath:applicationContext-dao.xml");
		CustomerDao customerDao = (CustomerDao) aap.getBean("customerDao");
		Customer customer =customerDao.findById(23L);
		System.out.println("xxxxxxxxxxxxxxxxxxxxx"+customer.getCustName());
	}

}
