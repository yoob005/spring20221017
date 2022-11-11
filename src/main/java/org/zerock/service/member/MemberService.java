package org.zerock.service.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.member.MemberDto;
import org.zerock.mapper.member.MemberMapper;

@Service
public class MemberService {
	
	@Autowired
	private MemberMapper mapper;

	public int insert(MemberDto member) {
		// TODO Auto-generated method stub
		return mapper.insert(member);
	}

	public List<MemberDto> list() {
		// TODO Auto-generated method stub
		return mapper.selectAll();
	}

	public MemberDto get(String id) {
		return mapper.selectMember(id);
	}

	public int update(MemberDto member) {
		int cnt = 0;
		
		try {
			mapper.updateMember(member);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return cnt; 
	}

	public int remove(String id) {
		
		return mapper.removeMember(id);
	}
	
}
