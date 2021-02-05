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


---
### 3 Tier Architecture 확장
![image](https://user-images.githubusercontent.com/61929745/106992575-1ba14b00-67bc-11eb-82cd-0dece1c54c1d.png)

- 아키텍쳐
1. 가용 영역의 구분 -> 장애로부터 격리
2. Public, Private Subnet의 구분으로 보안 강화
3. Load Balancing을 통해 서버 부하 분산
4. 3 Tier 설계로 각 계층의 부하 분산 및 서버 장애 안정성 

- 보안 그룹, Type, Port, Source(Inbound)
1. B-SG / SSH / 22 / 0.0.0.0/0
2. EX-ELB-SG / HTTP / 80 / 0.0.0.0/0
3-1. WEB-SG / HTTP / 80 / EX-ELB-SG
3-2. WEB-SG / SSH / 22 / 0.0.0.0/0
4. IN-ELB-SG / HTTP / 8080 / WEB-SG
5-1. WAS-SG / HTTP / 8080 / IN-ELB-SG
5-2. WAS-SG / SSH / 22 / 0.0.0.0/0
6. DB-SG / HHTP / 3306 / WAS-SG


