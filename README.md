# 팀명 : 빨간약 ( RedMedicine )

# 프로젝트 이름 : 몽글몽글 ( SpringBoot Project )

## 📚프로젝트 주제 

마음의 안정이 필요로 하는 사람들이 이용하고 쉴 수 있는 공간이 될 수 있는 사이트
1. 무료 **상담사 등록** 기능 및 유료 상담사로의 변경
2. 일반회원의 **상담사 매칭** 기능
3. 본인만의 **일기장**이 되어줄 일기쓰기 게시판
4. 우리나라에 있는 상담소에 대한 정보
5. 마음에 안정을 줄 수 있는 음악감상

## 목차
- [팀명 : 빨간약](#팀명--빨간약)
- [프로젝트 이름 : 몽글몽글 - Spring Boot Project](#프로젝트-이름--몽글몽글---spring-boot-project)
  - [📚프로젝트 주제](#프로젝트-주제)
  - [목차](#목차)
  - [팀 구성](#팀-구성)
  - [ERD구성](#erd구성)
  - [Tools](#tools)
  - [담당 작업](#나의-작업)
    - [메인페이지 WIKI로 이동](#메인페이지--wiki로-이동)
    - [상담사등록 WIKI로 이동](#상담사-등록-wiki로-이동)
    - [상담사 프로필(목록) WIKI로 이동](#상담사-프로필목록-wiki로-이동)
    - [상담사 프로필(상세보) WIKI로 이동](#상담사-프로필목록-wiki로-이동)
    - [상담 예약 회원 관리 WIKI로 이동](#상담예약-회원관리-wiki로-이동)
    - [제휴등록 WIKI로 이동](#제휴등록-wiki로-이동)

## 팀 구성

|팀장|노의진|           
|:--:|:--:|
|부팀장|이지윤| 
|팀원|이동현| 
|팀원|유대훈| 

## ERD구성

<details open>
<summary>ERD</summary>
  
  <a href='https://ifh.cc/v-H9Fj40' target='_blank'><img src='https://ifh.cc/g/H9Fj40.jpg' border='0'></a>
  
</details>

 ## Tools
- **Java**
- **Spring Boot**
### DB
- **Oracle**

## 담당 작업

### 메인페이지 <a href="https://github.com/NohEuijin/RedMedicine2/wiki/%EB%A9%94%EC%9D%B8%ED%8E%98%EC%9D%B4%EC%A7%80"> WIKI로 이동</a>
- 로그인시 세션 유지
- 세션에 따른 헤더 메뉴 등 매핑 다름
- 세션의 레벨에 따라 000 님 , 000 상담사 님 , 000 관리자 님 으로 구분
- 세션의 레벨에 따라 드롭다운 목록이 변경
<a href="https://github.com/NohEuijin/RedMedicine2/wiki/%EB%A9%94%EC%9D%B8%ED%8E%98%EC%9D%B4%EC%A7%80"> 
 <img src="https://github.com/2teamSpring/RedMedicine/assets/141835418/59c8569b-cd25-48fa-aa52-ad59d1f155aa?type=w580" width="500">
</a>

### 상담사 등록<a href="https://github.com/NohEuijin/RedMedicine2/wiki/%EC%83%81%EB%8B%B4%EC%82%AC%EB%93%B1%EB%A1%9D"> WIKI로 이동</a>
- 상담사는 유료상담사, 무료상담사로 구분
- 상담사 회원은 결제를 완료하면 유료 상담사로 활동이 가능
- 유료 상담사는 등록 페이지에서 비용을 입력 가능한 칸이 나타남
- 상담사의 프로필 이미지를 첨부파일로 등록이 가능

<a href="https://github.com/NohEuijin/RedMedicine2/wiki/%EC%83%81%EB%8B%B4%EC%82%AC%EB%93%B1%EB%A1%9D"> 
<img src="https://github.com/NohEuijin/RedMedicine2/assets/141835418/bca6b628-fc70-43a7-8805-6a2ff7e3d9af?type=w580" width="500">
<img src="https://github.com/NohEuijin/RedMedicine2/assets/141835418/88e6f01e-e3aa-4c21-bcc9-d6220f75e911" width="500">
</a>

### 상담사 프로필(목록)<a href="https://github.com/donghyun3193/SpringRedMedicine/wiki/%EC%83%81%EB%8B%B4-%EA%B2%8C%EC%8B%9C%ED%8C%90"> WIKI로 이동</a>
- 리스트에 보여줄 내용 가져오기
- 페이징 처리 (비동기)
- 게시글 쓰기, 수정, 삭제
- 이미지 파일 첨부하기

<a href="https://github.com/donghyun3193/SpringRedMedicine/wiki/%EC%83%81%EB%8B%B4-%EA%B2%8C%EC%8B%9C%ED%8C%90"> 
 <img src="https://github.com/donghyun3193/SpringRedMedicine/assets/131939490/02aabf5b-6507-41eb-9104-69c42939830f?type=w580" width="500">
 <img src="https://github.com/donghyun3193/SpringRedMedicine/assets/131939490/0cce62a4-ce6d-4c0c-a498-3aa759ab13c3?type=w580" width="500">
</a>

### 상담사 프로필(상세보기)<a href="https://github.com/donghyun3193/SpringRedMedicine/wiki/%ED%9A%8C%EC%9B%90-%EC%A0%95%EB%B3%B4-%EC%88%98%EC%A0%95"> WIKI로 이동</a>
- 회원 정보 수정 전 비밀번호 재입력 후 검증
- 회원 정보 수정 페이지에서는 기존 회원의 정보를 가져올 수 있도록

<a href="https://github.com/donghyun3193/SpringRedMedicine/wiki/%ED%9A%8C%EC%9B%90-%EC%A0%95%EB%B3%B4-%EC%88%98%EC%A0%95"> 
 <img src="https://github.com/donghyun3193/SpringRedMedicine/assets/131939490/4654d255-62c5-452f-ada9-d2f8643eb93d?type=w580" width="500">
</a>

### 상담예약 회원관리<a href="https://github.com/donghyun3193/SpringRedMedicine/wiki/%EC%83%81%EB%8B%B4-%EA%B2%8C%EC%8B%9C%ED%8C%90-%EB%8C%93%EA%B8%80"> WIKI로 이동</a>
- 댓글 리스트 띄우기 및 페이징 처리 (비동기)
- 댓글 날짜(1분 전, 1시간 전, 1일 전 형식으로 띄우기)
- 댓글 수정, 삭제

<a href="https://github.com/gimdaeyeon/happy_pets_day/wiki/%EB%A9%94%EC%9D%B8%ED%99%94%EB%A9%B4%EC%97%90%EC%84%9C-%EC%A1%B0%EA%B1%B4%EC%97%90-%EB%94%B0%EB%A5%B8-%EA%B2%8C%EC%8B%9C%EA%B8%80-%EB%85%B8%EC%B6%9C"> 
 <img src="https://github.com/donghyun3193/SpringRedMedicine/assets/131939490/5e4ce5c3-d455-4ebc-a67d-7cf4b76e90ee?type=w580" width="500">
</a>

### 제휴등록<a href="https://github.com/donghyun3193/SpringRedMedicine/wiki/%EC%83%81%EB%8B%B4-%EA%B2%8C%EC%8B%9C%ED%8C%90-%EB%8C%93%EA%B8%80"> WIKI로 이동</a>
- 댓글 리스트 띄우기 및 페이징 처리 (비동기)
- 댓글 날짜(1분 전, 1시간 전, 1일 전 형식으로 띄우기)
- 댓글 수정, 삭제

<a href="https://github.com/gimdaeyeon/happy_pets_day/wiki/%EB%A9%94%EC%9D%B8%ED%99%94%EB%A9%B4%EC%97%90%EC%84%9C-%EC%A1%B0%EA%B1%B4%EC%97%90-%EB%94%B0%EB%A5%B8-%EA%B2%8C%EC%8B%9C%EA%B8%80-%EB%85%B8%EC%B6%9C"> 
 <img src="https://github.com/donghyun3193/SpringRedMedicine/assets/131939490/5e4ce5c3-d455-4ebc-a67d-7cf4b76e90ee?type=w580" width="500">
</a>
