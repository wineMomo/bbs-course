
insert into user select 1,20120,'admin', 123456 ,'ADMIN' ,'信息管理与工程学院' ,'电子商务' ,current_time ,current_time ;



insert into  course select 1,'电子商务导论','信息管理与工程学院', '陈明晶' ,0 ,0, current_time ,current_time ;

insert into course select 2,'计算机导论','信息管理与工程学院','应小凡',0,0,current_time,current_time;
insert  into course select 3 ,'微积分','数统学院','刘应红',0,0,current_time,current_time;
insert into course select 4,'会计学','会计学院','李楠',0,0,current_time,current_time;




insert into  comment select 1,212012,'电子商务导论',0,0 ,current_time,current_time;
insert into comment select 2,1503020503023 ,'谜弟上线',1,0,current_time,current_time;
insert into  comment select 3,150320403020,'6666',2,0,current_time,current_time;



insert  into event select 1,150320403023,1,3,current_time,current_time;
insert  into event select 2,150302050233,1,3,current_time,current_time;
