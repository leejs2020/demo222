package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.vo.BoardVo;

@Repository
public class BoardMapper {

	@Autowired
	private SqlSession sqlSession;

	public List<BoardVo> selectBoardList() {
		return sqlSession.selectList("selectBoardList");
	}

}
