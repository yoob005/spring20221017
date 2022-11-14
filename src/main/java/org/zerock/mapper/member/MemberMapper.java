package org.zerock.mapper.member;

import java.util.List;

import org.zerock.domain.member.MemberDto;

public interface MemberMapper {

	List<MemberDto> selectAll();

	int insert(MemberDto member);

	MemberDto selectMember(String id);

	int updateMember(MemberDto member);

	int removeMember(String id);

	MemberDto selectByEmail(String email);
	
	
}
