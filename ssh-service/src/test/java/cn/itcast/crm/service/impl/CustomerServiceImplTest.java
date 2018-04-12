package cn.itcast.crm.service.impl;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.itcast.crm.dao.CustomerDao;
import cn.itcast.crm.entity.Customer;
//@ContextConfiguration(locations= {"classpath*:applicationContext-*.xml"})
@ContextConfiguration(locations = {"classpath:applicationContext-service.xml","classpath:applicationContext-dao.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class CustomerServiceImplTest {
	
	@Autowired
	private CustomerDao customerDao;

	@Test
	public void test() {
		//Customer customer = customerDao.findById(1L);
		//System.out.println("customer_Name"+customer.getCustName());
	}

}
