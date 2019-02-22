-- 수업 테이블 삭제
drop table if exists lms_lesson;

-- 회원 테이블 삭제

drop table  if exists lms_member;

-- 게시판 테이블 삭제

drop table  if exists lms_board;

-- 수업 테이블 생성
  --한줄로 하면 유지보수 힘들다

--(컬럼명) (타입) (not null 여부: 기본이 null) (기본 값) (기타)...,
create table lms_lesson(
  lesson_id int not null auto_increment primary key comment '수업 데이터 식별 번호',
  sdt datetime not null comment '수업 시작일',                               
  edt datetime not null comment'수업 종료일',           
  tot_hr int not null comment '총 수업시간',             
  day_hr int not null comment'일 수업시간' ,          
  titl varchar(255) not null comment '수업 명',                        
  conts text not null comment '수업 내용'                              
)comment'수업';

-- 회원 테이블 생성

create table lms_member(
  member_id int not null auto_increment primary key comment '멤버 데이터 식별 번호',
  name varchar(30) not null comment'이름',
  email varchar(50) not null comment'이메일',
  pwd varchar(255) not null comment'암호',
  cdt datetime default now() comment'등록일',
  tel varchar(20)  comment'전화',
  photo varchar(255) null comment'사진'
  )comment'회원';
  
  
  
  -- 게시판 테이블 생성
  
  create table lms_board(
   board_id int not null auto_increment primary key comment '게시물번호',
   conts  text not null comment'내용',
   cdt datetime default now() comment'생성일',
   vw_cnt int default 0 comment'조회수'
  )comment '게시물';
  
  -- 고정 데이터크기는 속도가 빠르다 가변데이터크기는 속도가 느리다 그러나 요즘은 컴터 한대 더붙이면 마인드
  -- 
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  