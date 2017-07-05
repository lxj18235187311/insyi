package cn.insyi;

import java.util.Date;

import javax.management.RuntimeErrorException;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import cn.insyi.core.dao.TestTbDao;
import cn.insyi.core.pojo.TestTb;
import cn.insyi.core.service.TestTbService;

import org.junit.Test;


@RunWith(SpringJUnit4ClassRunner.class) //用于配置spring中测试的环境 
@ContextConfiguration(locations={"classpath:application-context.xml"}) //用于指定配置文件所在的位置 
public class TestTbTest {
	
	@Autowired
	private TestTbService testTbService;
	
	@Test
	public void Testname() throws Exception{
		TestTb testTb = new TestTb();
		testTb.setName("段磊1");
		testTb.setBirthday(new Date());
		
		testTbService.insertTestTb(testTb);
		throw new RuntimeException("testTb");  
		
	}
}
