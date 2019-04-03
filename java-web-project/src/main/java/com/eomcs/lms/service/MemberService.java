package com.eomcs.lms.service;

import java.util.List;
import com.eomcs.lms.domain.Member;

public interface MemberService {
  List<Member> list(String keyword);
  int add(Member member);
  Member get(int no);
  Member get(String eamil, String password);
  int update(Member member);
  int delete(int no);
}
