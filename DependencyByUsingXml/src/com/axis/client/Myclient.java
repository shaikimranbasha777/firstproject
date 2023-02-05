package com.axis.client;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import com.axis.Employee;

public class Myclient {
	
	public static void main(String[] args) {
		Resource res = new ClassPathResource("beans.xml");
		BeanFactory fac = new XmlBeanFactory(res);
		
		Employee emp = (Employee) fac.getBean("emp");
		emp.dispalyEmployeeInfo();
	}

}
