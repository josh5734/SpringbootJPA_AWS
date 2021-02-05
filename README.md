# Springboot 기반 Web application 구현
![image](https://user-images.githubusercontent.com/61929745/106992330-88681580-67bb-11eb-8bc4-4e14b3ec4773.png)

- 아키텍쳐 
1. Availability zone 구분을 통해 지역 장애로부터 격리 가능
2. Load balancing을 통한 서버 부하 분산

- 보안 그룹 설정(Inbound)
ALB : ALL
Application : ALB
RDS: Application

- 미들웨어
WEB, WAS -> Springboot(EC2)
RDS -> MariaDB


![image](https://user-images.githubusercontent.com/61929745/106992494-e268db00-67bb-11eb-824c-82dd60ce9327.png)
- 기능 목록
1. 회원 등록/ 회원 조회
2. 상품 등록/ 상품 정보 수정 / 상품 조회
3. 상품 주문 / 주문 내역 조회 / 주문 취소

- 내용
1. start-web, Tomcat, thymeleaf, JPA, JDBC, Hibernate 등의 라이브러리 사용
2. Data-Source : mariaDB  RDS
3. Model, View, Controller(MVC패턴 이용)
4. Putty를 이용하여 EC2 접근 및  jar 형식 Building

