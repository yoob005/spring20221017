package org.zerock.service.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.board.TestBoardDto;
import org.zerock.domain.board.testPageInfo;
import org.zerock.mapper.board.TestBoardMapper;

@Service
public class TestBoardService {
	
	@Autowired
	private TestBoardMapper mapper;
	
	public int register(TestBoardDto board) {
		return mapper.insert(board);
	}

	public List<TestBoardDto> listBoard(int page, testPageInfo pageInfo) {
		
		int records = 10; //보여지길 원하는 페이지 수
		int offset = (page - 1) * records ;
		// 총 게시글 수
		int countAll = mapper.countAll();
		int lastPage = (countAll - 1) / records + 1;
		
		pageInfo.setLastPageNumber(lastPage);
		
		return mapper.list(offset, records);
	}

	public TestBoardDto get(int id) {
		return mapper.select(id);
	}

	public int update(TestBoardDto board) {
		
		return mapper.update(board);
	}
	
	public int remove(TestBoardDto board) {
		return mapper.delete(board);
	}
	
}
