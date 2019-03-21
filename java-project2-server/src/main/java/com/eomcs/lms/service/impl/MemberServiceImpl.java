package com.eomcs.lms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.eomcs.lms.dao.MemberDao;
import com.eomcs.lms.domain.Member;
import com.eomcs.lms.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService{

	MemberDao memberDao;

	public MemberServiceImpl(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

@Override
public List<Member> list() {

	return memberDao.findAll();
}

	@Override
	public int add(Member board) {

		return memberDao.insert(board);
	}
	
	@Override
	public Member get(int no) {
		Member member = memberDao.findByNo(no);
		
		return member;
	}

	@Override
	public int update(Member member) {
		
		return memberDao.update(member);
	}
	
	@Override
	public int delete(int no) {
		return memberDao.delete(no);
	}
}
