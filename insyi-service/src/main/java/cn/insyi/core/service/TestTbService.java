package cn.insyi.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import cn.insyi.core.dao.TestTbDao;
import cn.insyi.core.pojo.TestTb;

@Service
@Transactional
public class TestTbService {

	@Autowired
	private TestTbDao testTbDao;
	
	//±£´æ
	public void insertTestTb(TestTb testTb){
		testTbDao.insertTestTb(testTb);
	}
	
}
