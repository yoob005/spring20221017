package org.zerock.mapper.board;

import java.util.List;

import org.zerock.domain.board.TestBoardDto;

public interface TestBoardMapper {

	int insert(TestBoardDto board);

	List<TestBoardDto> list(int offset, int records);

	TestBoardDto select(int id);

	int update(TestBoardDto board);
	
	int delete(TestBoardDto board);

	int countAll();

}
