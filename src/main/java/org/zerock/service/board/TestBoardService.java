package org.zerock.service.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.board.TestBoardDto;
import org.zerock.mapper.board.TestBoardMapper;

@Service
public class TestBoardService {
	
	@Autowired
	private TestBoardMapper mapper;
	
	public int register(TestBoardDto board) {
		return mapper.insert(board);
	}

	public List<TestBoardDto> listBoard() {
		// 
		return mapper.list();
	}

	public TestBoardDto get(int id) {
		return mapper.select(id);
	}

	public int update(TestBoardDto board) {
		
		return mapper.update(board);
	}
	
}
