drop database mrproject;

create database mrproject;

use mrproject;

create table user(
First_Name varchar(30)not null,
Last_Name varchar(30)not null,
DOB date not null,
Username varchar(50)primary key,
Password varchar(16)not null
);

insert into user values('Admin','Agarwal','2014/07/04','admin','password');

create table patient(
pno int primary key auto_increment,
p_name varchar(35) not null,
b_gp varchar(3) not null,
age int(3),
gender varchar(6) not null,
mobileno varchar(10),
rel_name varchar(35) not null,
father_name varchar(35),
address varchar(50),
disease varchar(20),
entry_date date
);

insert into patient (p_name,b_gp,age,gender,mobileno,rel_name,father_name,address,disease,entry_date) values ("Vasu Agarwal"," O+",17,"male","9877876565","abc","xyz","Shastri nagar","heart",'2013-02-05');

create table doctor(
dno int primary key auto_increment,
d_name varchar(35),
edu varchar(25),
specialization varchar(20),
charge int(3)
);

insert into doctor (d_name,edu,specialization,charge) values ("Aman Kapoor","MBBS","heart",1500);

create table prescription(
pid int primary key auto_increment,
pno int(11) references patient(pno),
dno int(11) references doctor(dno),
pric varchar(100),
visitno int(3),
pricp_date date,
days int(3) not null,
cost int(5),
reference int
);

insert into prescription (pno,dno,pric,visitno,pricp_date,days,cost,reference) values (1,1,"rest",1,'2013-02-05',5,6000,null);

create table invoice(
inno int primary key auto_increment,
pid int(11) references prescription(pid),      
pno int(11) references patient(pno),
dno int(11) references doctor(dno),
bill_date date,
amount int(5),
modepay varchar(11)
)
auto_increment=1000000;
