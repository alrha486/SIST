CREATE DATABASE project;

 

USE project;

 

create database project;

 

 

 

use project;

 

 

 

 

 

CREATE TABLE division (

	d_no TINYINT PRIMARY KEY UNIQUE AUTO_INCREMENT,

	

	d_division VARCHAR(30) NOT NULL

)

 

 

 

 

INSERT INTO division 

VALUES

(1, '한식'),

(2, '양식'),

(3, '중식'),

(4, '일식');

 

 

 

 

 

CREATE TABLE restaurant(  

 

r_no INT PRIMARY KEY UNIQUE AUTO_INCREMENT,

 

d_no TINYINT NOT NULL,

 

r_name VARCHAR(20) NOT NULL, 		

 

r_address VARCHAR(30) NOT NULL,	

 

r_menu VARCHAR(30) NOT NULL

 

);

 

 

 

ALTER TABLE restaurant ADD FOREIGN KEY (d_no) REFERENCES division (d_no) ON DELETE CASCADE ON UPDATE CASCADE;

 

ALTER TABLE restaurant AUTO_INCREMENT = 1;  

 

SET @@AUTO_INCREMENT_INCREMENT = 1; 	

 

 

 

 

insert into restaurant values (null,1,'홍익간장게장','서울 마포구 월드컵북로 59','간장게장');

 

insert into restaurant values (null,1,'신교칼국수','서울 마포구 동교로 17','칼국수');

 

insert into restaurant values (null,1,'미소국수','서울 마포구 동교로 27','국수');

 

insert into restaurant values (null,1,'소년식당','서울 마포구 와우산로 29','덮밥');

 

insert into restaurant values (null,2,'빵나무','서울 마포구 월드컵북로 4','빵');

 

insert into restaurant values (null,2,'홍대쌀국수','서울 마포구 와우산로27','베트남쌀국수');

 

insert into restaurant values (null,2,'카페샌드박','서울 마포구 동교로 183','커피류');

 

insert into restaurant values (null,1,'명동왕돈까스','서울 마포구 동교로 25','돈까스');

 

insert into restaurant values (null,2,'커피볶는김대리','서울 마포구 월드컵북로 6','커피류');

 

insert into restaurant values (null,2,'손탁','서울 마포구 월드컵북로 5','커피류');

 

insert into restaurant values (null,4,'최우영 식당(초밥)','서울 마포구 월드컵북로 4길 12','초밥');

 

insert into restaurant values (null,4,'키움초밥','서울 마포구 잔다리로 77','초밥');

 

insert into restaurant values (null,3,'영빈루','서울 마포구 와우산로21','짬봉');

 

insert into restaurant values (null,3,'홍대교동짬뽕','서울특별시 마포구 월드컵북로 42','짬뽕');

 

insert into restaurant values (null,3,'도원','서울 마포구 월드컵북로 5',3);

 

insert into restaurant values (null,1,'아우네돼지불백','서울 마포구 동교로 149', '불백');

 

insert into restaurant values (null,1,'대청마루김치찌개전문','서울 마포구 동교로 147', '김치찌개');

 

insert into restaurant values (null,1,'서교동김밥','서울 마포구 동교로 140','김밥');

 

insert into restaurant values (null,1,'에덴김밥','서울 마포구 월드컵북로 13','분식');

 

insert into restaurant values (null,1,'북창동 순두부','서울 마포구 양화로 133','순두부');

 

insert into restaurant values (null,1,'들풀','서울 마포구 동교로 156-5','곤드레돌솥정식');

 

insert into restaurant values (null,1,'잘생긴밥집','서울 마포구 월드컵북로 4','제육볶음 등');

 

insert into restaurant values (null,1,'만족오향족발 홍대역점','서울 마포구 동교로 191','보쌈정식');

 

insert into restaurant values (null,1,'돈코보쌈','서울 마포구 월드컵북로 6','보쌈정식');

 

insert into restaurant values (null,1,'KT 플라자 서부점 구내식당','서울특별시 마포구 월드컵북로 2','요일별 메뉴');

 

insert into restaurant values (null,1,'삼시세끼 홍대점','서울 마포구 홍익로 3','돼지불백');

 

insert into restaurant values (null,1,'이맛콩나물국밥 서교점','서울 마포구 동교로 22','콩나물국밥');

 

insert into restaurant values (null,1,'이모네가마솥순대국','서울 마포구 동교로 171','순대국');

 

insert into restaurant values (null,1,'서교밥집','서울 마포구 잔다리로 78','수제왕돈까스');

 

insert into restaurant values (null,1,'섬소년','서울 마포구 월드컵북로6','모두부정식');

 

insert into restaurant values (null,1,'제주정원','서울특별시 마포구 동교로 17','김치찌개');

 

insert into restaurant values (null,1,'맛죽','서울 마포구 월드컵북로 30','닭볶음 ');

 

insert into restaurant values (null,1,'서교돼지불백','서울 마포구 동교로 140','돼지불백');

 

insert into restaurant values (null,1,'연남동 주막','서울 마포구 월드컵북로 6','쭈꾸미볶음');

 

insert into restaurant values (null,2,'투고샐러드 홍익대점','서울 마포구 홍익로 10','리코타치즈샐러드');

 

insert into restaurant values (null,3,'썰','서울 마포구 월드컵북로 6','숙주제육볶음');

 

insert into restaurant values (null,2,'듀꼬뱅','서울 마포구 동교로 27','베이커리류');

 

insert into restaurant values (null,2,'미스사이공 연남점','서울 마포구 연남로 1','쌀국수');

 

insert into restaurant values (null,2,'홍쉐프','서울 마포구 동교로 164','파스타');

 

insert into restaurant values (null,1,'안동한우마을','서울특별시 마포구 동교로 162','비빔밥류');

 

insert into restaurant values (null,1,'홍대이층집부대찌개','서울 마포구 동교로 182','부대찌개');

 

insert into restaurant values (null,4,'은화수식당 홍대점','서울 마포구 홍익로 2','돈가스');

 

insert into restaurant values (null,4,'카타코토카페','서울 마포구 동교로 148','일본가정식');

 

insert into restaurant values (null,1,'다락투','서울 마포구 와우산로 21','닭곰탕');

 

insert into restaurant values (null,1,'육대장 홍대점','서울 마포구 양화로 134','육칼면');

 

 

 

 

 

CREATE TABLE member(   

 

m_no INT PRIMARY KEY UNIQUE AUTO_INCREMENT,  

 

m_di INT,

 

m_name VARCHAR(30),

 

m_age TINYINT,   

 

m_id VARCHAR(30),  

 

m_pw VARCHAR(30),  

 

m_gender CHAR(1)

 

);

 

 

 

 

 

ALTER TABLE member AUTO_INCREMENT = 1;   

 

SET @@AUTO_INCREMENT_INCREMENT = 1;  	 

 

 

 

INSERT INTO member VALUES(NULL,1,'root@name', 10,'root', '1234','M');   

 

INSERT INTO member VALUES(NULL,2,'user@name', 10,'user', '1234', 'F');

 

 

 

 

SELECT * FROM restaurant;

SELECT * FROM member;

SELECT * FROM division;