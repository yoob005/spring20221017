package org.zerock.service.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.board.BoardDto;
import org.zerock.domain.board.PageInfo;
import org.zerock.mapper.board.BoardMapper;

@Service
public class BoardService {

	@Autowired
	private BoardMapper mapper;	
	
	public int register(BoardDto board) {
		return mapper.insert(board);
		
	}

	public List<BoardDto> listBoard(int page, PageInfo pageInfo) {
		
		int records = 10;
		int offset = (page-1)*records ;
		
		int countAll = mapper.countAll();
		int lastPage = (countAll - 1) / records + 1;
		
		int leftPageNumber = (page-1) / 10 * 10 +1;
		int rightPageNumber = leftPageNumber + 9;
		rightPageNumber = Math.min(rightPageNumber, lastPage);
		
		pageInfo.setCurrentPageNumber(page);
		pageInfo.setLastPageNumber(lastPage);
		pageInfo.setLeftPageNumber(leftPageNumber);
		pageInfo.setRightPageNumber(rightPageNumber);
		
		return mapper.list(offset, records);
	}

	public BoardDto get(int id) {
	
		return mapper.select(id);
	}

	public int update(BoardDto board) {
		
		return mapper.update(board);
	}

	public int remove(int id) {
		
		return mapper.delete(id);
		
	}
	
}
