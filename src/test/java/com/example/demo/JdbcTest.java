package com.example.demo;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@MybatisTest
class JdbcTest {

	@Autowired
	private SqlSessionFactory sqlFactory;

	@Test
	void test() {
		System.out.println("TEST1111");
		try (SqlSession session = sqlFactory.openSession()) {

			System.out.println(session);

		} catch (Exception e) {

			e.printStackTrace();

		}
	}

}
