CREATE TABLE `hr`.`employees` 
   (`emp_id` int, 
	`emp_name` text, 
	`emp_age` int, 
	`emp_doj` datetime, 
	`emp_dept` text, 
	`emp_desgn` text, 
	`emp_salary` bigint);

INSERT INTO hr.employees
(emp_id,emp_name,emp_age,emp_doj,emp_dept,emp_desgn,emp_salary) VALUES
(8057,'Narendra Modi',70,'2014-09-23','Sales','Senior',177596),
(4141,'Arun Jaitley',48,'2010-05-17','Finance','Senior',727233),
(3914,'Nitin Gadkari',47,'2014-08-25','Operations','Middle',762981),
(4452,'Nirmala Sitharaman',47,'2010-05-12','Defence','Senior',494639),
(9604,'Sushma Swaraj',45,'2015-06-20','Defence','Senior',253327),
(8109,'Rajnath Singh',67,'2015-01-01','Operations','Senior',946533),
(8825,'Piyush Goyal',68,'2015-01-22','Finance','Junior',919087),
(4553,'Manohar Parrikar',68,'2015-05-25','Defence','Junior',772905),
(9025,'Prakash Javadekar',66,'2011-11-24','Communication','Junior',869016),
(3025,'Venkaiah Naidu',54,'2013-04-07','Communication','Middle',830893),
(1300,'Suresh Prabhu',45,'2017-03-23','Operations','Junior',876616);