package org.bg.persistence;

import javax.sql.DataSource;

import org.bg.sample.SampleTests;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;


@Log4j
public class MybatisTest {

	
		@Autowired
		private DataSource dataSource;
		
		@Autowired
		private SqlSessionTemplate sessionTemplate;
		
		
		@Test
		public void sessionTemplate() {
			System.out.println(sessionTemplate);
		}
}
