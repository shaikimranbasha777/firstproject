/*create database */
/*create database BankSystem;

/* use database*/
use bankSystem;
create table bankdemo(id int primary key auto_increment,BankName varchar(255) not null,BankLocation text not null);
insert into bankdemo(BankName,BankLocation) values('Axis','Banglore'),('BOD','delhi');

create table customer(id int primary key auto_increment, customername varchar(255) not null, customeremail varchar(255) not null,customerphono bigint, customercardno bigint);
alter table customer add password varchar(255) after customeremail;
insert into customer(customername,customeremail,password,customerphno,customercardno) values('imran','imran@gmail.com','imran@123',8434510178,44437389746),('ram','ram@gmail.com','ram@123',9380853755,5566773322);
insert into customer(customername,customeremail,password,customerphono,customercardno) values('malik','malik@gmail.com','malik@123',84254610178,4425856389746),('javeed','javeed@gmail.com','javeed@123',9380855555,55668683322);

create table account(accountid int primary key auto_increment, accountno bigint unique,accountType varchar(255) not null, accountbalance float not null, customerid int, foreign key(customerid) references customer(id));
alter table account add bankid int;
alter table account add foreign key(bankid) references bankdemo(id);
insert into account(accountno,accounttype,accountbalance,customerid) values(4567839790,'saving',10000,1),(4567839757,'saving',10000,2),(4567839756,'saving',10000,3),(4585685578,'saving',100000,4);

create table transaction(transactionid int primary key auto_increment, transactionType varchar(255) not null, transactionAmount float not null, transactiondate DATE not null, transactiontime TIME not null);
insert into transaction(transactionType, transactionAmount, transactiondate,transactiontime) values('deposite', 15000, CURDATE(), CURTIME());
update account set accountbalance = accountbalance + 15000 where accountid=1;

insert into transaction(transactionType, transactionAmount, transactiondate,transactiontime) values('deposite', 5000, CURDATE(), CURTIME());
update account set accountbalance = accountbalance + 5000 where accountid=2;

insert into transaction(transactionType, transactionAmount, transactiondate,transactiontime) values('deposite', 10000, CURDATE(), CURTIME());


create table atm(id int primary key auto_increment, deposite boolean not null, withdraw boolean not null, checkbalance boolean not null, atmid int, foreign key(atmid) references transaction(transactionid));
/*Microsoft Windows [Version 10.0.22621.1105]
(c) Microsoft Corporation. All rights reserved.

C:\Users\Imran>mysql -u root -p
Enter password: *************
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 49
Server version: 8.0.31 MySQL Community Server - GPL

Copyright (c) 2000, 2022, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> use banksystem;
Database changed
mysql> create table bankdemo(id int primary key auto_increment,BankName varchar(255) not null,BankLocation text not null);
Query OK, 0 rows affected (0.10 sec)

mysql> show tables;
+----------------------+
| Tables_in_banksystem |
+----------------------+
| bankdemo             |
+----------------------+
1 row in set (0.01 sec)

mysql>  insert into bankdemo(BankName,BankLocation) values('Axis','Banglore'),('BOD','delhi');
Query OK, 2 rows affected (0.02 sec)
Records: 2  Duplicates: 0  Warnings: 0

mysql> create table customer(id int primary key auto_increment, customername varchar(255) not null, customeremail varchar(255) not null,customerphono bigint, customercardno bigint);
Query OK, 0 rows affected (0.04 sec)

mysql> show tables;
+----------------------+
| Tables_in_banksystem |
+----------------------+
| bankdemo             |
| customer             |
+----------------------+
2 rows in set (0.00 sec)

mysql> desc customer;
+----------------+--------------+------+-----+---------+----------------+
| Field          | Type         | Null | Key | Default | Extra          |
+----------------+--------------+------+-----+---------+----------------+
| id             | int          | NO   | PRI | NULL    | auto_increment |
| customername   | varchar(255) | NO   |     | NULL    |                |
| customeremail  | varchar(255) | NO   |     | NULL    |                |
| customerphono  | bigint       | YES  |     | NULL    |                |
| customercardno | bigint       | YES  |     | NULL    |                |
+----------------+--------------+------+-----+---------+----------------+
5 rows in set (0.01 sec)

mysql> create table account(accountid int primary key auto_increment, accountno bigint, accountbalance float not null, customerid int, foreign key(customerid) refernces customer(id));
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'refernces customer(id))' at line 1
mysql> create table account(accountid int primary key auto_increment, accountno bigint, accountbalance float not null, customerid int foreign key(customerid) refernces customer(id));
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'foreign key(customerid) refernces customer(id))' at line 1
mysql> create table account(accountid int primary key auto_increment, accountno bigint, accountbalance float not null, customerid int, foreign key(customerid) refernces customer(id));
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'refernces customer(id))' at line 1
mysql> create table account(accountid int primary key auto_increment, accountno bigint, accountbalance float not null, customerid int, foreign key(customerid) refernces customer(id);
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'refernces customer(id)' at line 1
mysql> create table account(accountid int primary key auto_increment, accountno bigint, accountbalance float not null, customerid int, foreign key(customerid) refernceses customer(id));
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'refernceses customer(id))' at line 1
mysql> create table account(accountid int primary key auto_increment, accountno bigint, accountbalance float not null, customerid int, foreign key(customerid refernceses customer(id));
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'refernceses customer(id))' at line 1
mysql> create table account(accountid int primary key auto_increment, accountno bigint, accountbalance float not null, customerid int, foreign key(customerid refernces customer(id));
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'refernces customer(id))' at line 1
mysql> create table account(accountid int primary key auto_increment, accountno bigint, accountbalance float not null, customerid int, foreign key(customerid) refernces customer(id));
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'refernces customer(id))' at line 1
mysql> create table account(accountid int primary key auto_increment, accountno bigint unique,accountType varchar(255) not null, accountbalance float not null, customerid int, foreign key(customerid) references customer(id));
Query OK, 0 rows affected (0.06 sec)

mysql> insert into customer(customername,customeremail,password,customerphno,customercardno) values('imran','imran@gmail.com','imran@123',8434510178,44437389746),('ram','ram@gmail.com','ram@123',9380853755,5566773322);
ERROR 1054 (42S22): Unknown column 'password' in 'field list'
mysql> alter table customer add column password after customeremail;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'after customeremail' at line 1
mysql> alter table customer add password varchar(255) after customeremail;
Query OK, 0 rows affected (0.05 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> desc customer;
+----------------+--------------+------+-----+---------+----------------+
| Field          | Type         | Null | Key | Default | Extra          |
+----------------+--------------+------+-----+---------+----------------+
| id             | int          | NO   | PRI | NULL    | auto_increment |
| customername   | varchar(255) | NO   |     | NULL    |                |
| customeremail  | varchar(255) | NO   |     | NULL    |                |
| password       | varchar(255) | YES  |     | NULL    |                |
| customerphono  | bigint       | YES  |     | NULL    |                |
| customercardno | bigint       | YES  |     | NULL    |                |
+----------------+--------------+------+-----+---------+----------------+
6 rows in set (0.00 sec)

mysql> insert into customer(customername,customeremail,password,customerphno,customercardno) values('imran','imran@gmail.com','imran@123',8434510178,44437389746),('ram','ram@gmail.com','ram@123',9380853755,5566773322);
ERROR 1054 (42S22): Unknown column 'customerphno' in 'field list'
mysql> insert into customer(customername,customeremail,password,customerphono,customercardno) values('imran','imran@gmail.com','imran@123',8434510178,44437389746),('ram','ram@gmail.com','ram@123',9380853755,5566773322);
Query OK, 2 rows affected (0.01 sec)
Records: 2  Duplicates: 0  Warnings: 0

mysql> select * from customer;
+----+--------------+-----------------+-----------+---------------+----------------+
| id | customername | customeremail   | password  | customerphono | customercardno |
+----+--------------+-----------------+-----------+---------------+----------------+
|  1 | imran        | imran@gmail.com | imran@123 |    8434510178 |    44437389746 |
|  2 | ram          | ram@gmail.com   | ram@123   |    9380853755 |     5566773322 |
+----+--------------+-----------------+-----------+---------------+----------------+
2 rows in set (0.00 sec)

mysql> insert into customer(customername,customeremail,password,customerphono,customercardno) values('malik','malik@gmail.com','malik@123',84254610178,4425856389746),('javeed','javeed@gmail.com','javeed@123',9380855555,55668683322);
Query OK, 2 rows affected (0.00 sec)
Records: 2  Duplicates: 0  Warnings: 0

mysql> select * from customer;
+----+--------------+------------------+------------+---------------+----------------+
| id | customername | customeremail    | password   | customerphono | customercardno |
+----+--------------+------------------+------------+---------------+----------------+
|  1 | imran        | imran@gmail.com  | imran@123  |    8434510178 |    44437389746 |
|  2 | ram          | ram@gmail.com    | ram@123    |    9380853755 |     5566773322 |
|  3 | malik        | malik@gmail.com  | malik@123  |   84254610178 |  4425856389746 |
|  4 | javeed       | javeed@gmail.com | javeed@123 |    9380855555 |    55668683322 |
+----+--------------+------------------+------------+---------------+----------------+
4 rows in set (0.00 sec)

mysql> insert into account(accountno,accounttype,accountbalance,customerid) values(4567839790,'saving',10000,1),(4567839757,'saving',10000,2),(4567839756,'saving',10000,3),(4585685578,'saving',100000,4);
Query OK, 4 rows affected (0.01 sec)
Records: 4  Duplicates: 0  Warnings: 0

mysql> select * from account;
+-----------+------------+-------------+----------------+------------+
| accountid | accountno  | accountType | accountbalance | customerid |
+-----------+------------+-------------+----------------+------------+
|         1 | 4567839790 | saving      |          10000 |          1 |
|         2 | 4567839757 | saving      |          10000 |          2 |
|         3 | 4567839756 | saving      |          10000 |          3 |
|         4 | 4585685578 | saving      |         100000 |          4 |
+-----------+------------+-------------+----------------+------------+
4 rows in set (0.00 sec)

mysql> select * from customer inner join account on customer.id = account.accountid;
+----+--------------+------------------+------------+---------------+----------------+-----------+------------+-------------+----------------+------------+
| id | customername | customeremail    | password   | customerphono | customercardno | accountid | accountno  | accountType | accountbalance | customerid |
+----+--------------+------------------+------------+---------------+----------------+-----------+------------+-------------+----------------+------------+
|  1 | imran        | imran@gmail.com  | imran@123  |    8434510178 |    44437389746 |         1 | 4567839790 | saving      |          10000 |          1 |
|  2 | ram          | ram@gmail.com    | ram@123    |    9380853755 |     5566773322 |         2 | 4567839757 | saving      |          10000 |          2 |
|  3 | malik        | malik@gmail.com  | malik@123  |   84254610178 |  4425856389746 |         3 | 4567839756 | saving      |          10000 |          3 |
|  4 | javeed       | javeed@gmail.com | javeed@123 |    9380855555 |    55668683322 |         4 | 4585685578 | saving      |         100000 |          4 |
+----+--------------+------------------+------------+---------------+----------------+-----------+------------+-------------+----------------+------------+
4 rows in set (0.00 sec)

mysql> create table transaction(transactionid int primary key auto_increment, transactionType varchar(255) not null, transactionAmount float not null, transactiondate DATE not null, transactiontime TIME not null);
Query OK, 0 rows affected (0.03 sec)

mysql> insert into transaction(transactionType, transactionAmount, transactiondate,transactiontime) values('deposite', 15000, CURDATE(), CURTIME());
Query OK, 1 row affected (0.01 sec)

mysql> select * from tranaction;
ERROR 1146 (42S02): Table 'banksystem.tranaction' doesn't exist
mysql> select * from transaction;
+---------------+-----------------+-------------------+-----------------+-----------------+
| transactionid | transactionType | transactionAmount | transactiondate | transactiontime |
+---------------+-----------------+-------------------+-----------------+-----------------+
|             1 | deposite        |             15000 | 2023-01-17      | 14:33:18        |
+---------------+-----------------+-------------------+-----------------+-----------------+
1 row in set (0.00 sec)

mysql> update account set customerbalance = customerbalance + 15000 where accountid=1;
ERROR 1054 (42S22): Unknown column 'customerbalance' in 'field list'
mysql> update account set accountbalance = accountbalance + 15000 where accountid=1;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select * from account;
+-----------+------------+-------------+----------------+------------+
| accountid | accountno  | accountType | accountbalance | customerid |
+-----------+------------+-------------+----------------+------------+
|         1 | 4567839790 | saving      |          25000 |          1 |
|         2 | 4567839757 | saving      |          10000 |          2 |
|         3 | 4567839756 | saving      |          10000 |          3 |
|         4 | 4585685578 | saving      |         100000 |          4 |
+-----------+------------+-------------+----------------+------------+
4 rows in set (0.00 sec)

mysql> insert into transaction(transactionType, transactionAmount, transactiondate,transactiontime) values('deposite', 5000, CURDATE(), CURTIME());
Query OK, 1 row affected (0.00 sec)

mysql> update account set accountbalance = accountbalance + 5000 where accountid=2;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select * from account;
+-----------+------------+-------------+----------------+------------+
| accountid | accountno  | accountType | accountbalance | customerid |
+-----------+------------+-------------+----------------+------------+
|         1 | 4567839790 | saving      |          25000 |          1 |
|         2 | 4567839757 | saving      |          15000 |          2 |
|         3 | 4567839756 | saving      |          10000 |          3 |
|         4 | 4585685578 | saving      |         100000 |          4 |
+-----------+------------+-------------+----------------+------------+
4 rows in set (0.00 sec)

mysql> insert into transaction(transactionType, transactionAmount, transactiondate,transactiontime) values('deposite', 10000, CURDATE(), CURTIME());
Query OK, 1 row affected (0.00 sec)

mysql> update account set accountbalance = accountbalance + transaction.transactionAmount where accountid=3;
ERROR 1054 (42S22): Unknown column 'transaction.transactionAmount' in 'field list'
mysql> select * from account where accountid = ANY(select transactionid from transaction);
+-----------+------------+-------------+----------------+------------+
| accountid | accountno  | accountType | accountbalance | customerid |
+-----------+------------+-------------+----------------+------------+
|         1 | 4567839790 | saving      |          25000 |          1 |
|         2 | 4567839757 | saving      |          15000 |          2 |
|         3 | 4567839756 | saving      |          10000 |          3 |
+-----------+------------+-------------+----------------+------------+
3 rows in set (0.00 sec)

mysql> select * from customer where custumername LIKE "im%";
ERROR 1054 (42S22): Unknown column 'custumername' in 'where clause'
mysql> select * from customer where customername LIKE "im%";
+----+--------------+-----------------+-----------+---------------+----------------+
| id | customername | customeremail   | password  | customerphono | customercardno |
+----+--------------+-----------------+-----------+---------------+----------------+
|  1 | imran        | imran@gmail.com | imran@123 |    8434510178 |    44437389746 |
+----+--------------+-----------------+-----------+---------------+----------------+
1 row in set (0.00 sec)

mysql> select * from customer where customername LIKE "%im";
Empty set (0.00 sec)

mysql> select * from customer where customername LIKE "%im%";
+----+--------------+-----------------+-----------+---------------+----------------+
| id | customername | customeremail   | password  | customerphono | customercardno |
+----+--------------+-----------------+-----------+---------------+----------------+
|  1 | imran        | imran@gmail.com | imran@123 |    8434510178 |    44437389746 |
+----+--------------+-----------------+-----------+---------------+----------------+
1 row in set (0.00 sec)

mysql> select * from customer where customername LIKE "%n";
+----+--------------+-----------------+-----------+---------------+----------------+
| id | customername | customeremail   | password  | customerphono | customercardno |
+----+--------------+-----------------+-----------+---------------+----------------+
|  1 | imran        | imran@gmail.com | imran@123 |    8434510178 |    44437389746 |
+----+--------------+-----------------+-----------+---------------+----------------+
1 row in set (0.00 sec)

mysql> select * from account where accountid = ANY(select transactionid from transaction);^C
mysql> show tables;
+----------------------+
| Tables_in_banksystem |
+----------------------+
| account              |
| bankdemo             |
| customer             |
| transaction          |
+----------------------+
4 rows in set (0.00 sec)

mysql> desc bankdemo;
+--------------+--------------+------+-----+---------+----------------+
| Field        | Type         | Null | Key | Default | Extra          |
+--------------+--------------+------+-----+---------+----------------+
| id           | int          | NO   | PRI | NULL    | auto_increment |
| BankName     | varchar(255) | NO   |     | NULL    |                |
| BankLocation | text         | NO   |     | NULL    |                |
+--------------+--------------+------+-----+---------+----------------+
3 rows in set (0.00 sec)

mysql> alter table account add bankid int;
Query OK, 0 rows affected (0.03 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> alter table account add foreign key(bankid) references bankdemo(id);
Query OK, 4 rows affected (0.08 sec)
Records: 4  Duplicates: 0  Warnings: 0

mysql> desc account;
+----------------+--------------+------+-----+---------+----------------+
| Field          | Type         | Null | Key | Default | Extra          |
+----------------+--------------+------+-----+---------+----------------+
| accountid      | int          | NO   | PRI | NULL    | auto_increment |
| accountno      | bigint       | YES  | UNI | NULL    |                |
| accountType    | varchar(255) | NO   |     | NULL    |                |
| accountbalance | float        | NO   |     | NULL    |                |
| customerid     | int          | YES  | MUL | NULL    |                |
| bankid         | int          | YES  | MUL | NULL    |                |
+----------------+--------------+------+-----+---------+----------------+
6 rows in set (0.00 sec)

mysql> crete table atm(id int primary key auto_increment, deposite boolean not null, withdraw boolean not null, checkbalance boolean not null, atmid int, forrign key(atmid) references transaction(transactionid));
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'crete table atm(id int primary key auto_increment, deposite boolean not null, wi' at line 1
mysql> create table atm(id int primary key auto_increment, deposite boolean not null, withdraw boolean not null, checkbalance boolean not null, atmid int, forrign key(atmid) references transaction(transactionid));
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'key(atmid) references transaction(transactionid))' at line 1
mysql> create table atm(id int primary key auto_increment, deposite boolean not null, withdraw boolean not null, checkbalance boolean not null, atmid int, foreign key(atmid) references transaction(transactionid));
Query OK, 0 rows affected (0.05 sec)

mysql> desc atm;
+--------------+------------+------+-----+---------+----------------+
| Field        | Type       | Null | Key | Default | Extra          |
+--------------+------------+------+-----+---------+----------------+
| id           | int        | NO   | PRI | NULL    | auto_increment |
| deposite     | tinyint(1) | NO   |     | NULL    |                |
| withdraw     | tinyint(1) | NO   |     | NULL    |                |
| checkbalance | tinyint(1) | NO   |     | NULL    |                |
| atmid        | int        | YES  | MUL | NULL    |                |
+--------------+------------+------+-----+---------+----------------+
5 rows in set (0.00 sec)

mysql> desc bankdemo;
+--------------+--------------+------+-----+---------+----------------+
| Field        | Type         | Null | Key | Default | Extra          |
+--------------+--------------+------+-----+---------+----------------+
| id           | int          | NO   | PRI | NULL    | auto_increment |
| BankName     | varchar(255) | NO   |     | NULL    |                |
| BankLocation | text         | NO   |     | NULL    |                |
+--------------+--------------+------+-----+---------+----------------+
3 rows in set (0.00 sec)

mysql> select * from bankdemo;
+----+----------+--------------+
| id | BankName | BankLocation |
+----+----------+--------------+
|  1 | Axis     | Banglore     |
|  2 | BOD      | delhi        |
+----+----------+--------------+
2 rows in set (0.00 sec)

mysql> select * from transaction;
+---------------+-----------------+-------------------+-----------------+-----------------+
| transactionid | transactionType | transactionAmount | transactiondate | transactiontime |
+---------------+-----------------+-------------------+-----------------+-----------------+
|             1 | deposite        |             15000 | 2023-01-17      | 14:33:18        |
|             2 | deposite        |              5000 | 2023-01-17      | 14:37:26        |
|             3 | deposite        |             10000 | 2023-01-17      | 14:39:03        |
+---------------+-----------------+-------------------+-----------------+-----------------+
3 rows in set (0.00 sec)

mysql> update atm set deposite = TRUE where transactionid = 1;
ERROR 1054 (42S22): Unknown column 'transactionid' in 'where clause'
mysql> update atm set deposite = TRUE where atmid = 1;
Query OK, 0 rows affected (0.00 sec)
Rows matched: 0  Changed: 0  Warnings: 0

mysql> select * from atm;
Empty set (0.00 sec)

mysql> insert into atm(deposite, withdraw, checkbalance, atmid) values(true,false,false,1);
Query OK, 1 row affected (0.01 sec)

mysql> select * from atm;
+----+----------+----------+--------------+-------+
| id | deposite | withdraw | checkbalance | atmid |
+----+----------+----------+--------------+-------+
|  1 |        1 |        0 |            0 |     1 |
+----+----------+----------+--------------+-------+
1 row in set (0.00 sec)

mysql> insert into atm(deposite, withdraw, checkbalance, atmid) values(true,false,false,2);
Query OK, 1 row affected (0.01 sec)

mysql> insert into atm(deposite, withdraw, checkbalance, atmid) values(true,false,false,3);
Query OK, 1 row affected (0.01 sec)

mysql> insert into atm(deposite, withdraw, checkbalance, atmid) values(false,true,false,4);
ERROR 1452 (23000): Cannot add or update a child row: a foreign key constraint fails (`banksystem`.`atm`, CONSTRAINT `atm_ibfk_1` FOREIGN KEY (`atmid`) REFERENCES `transaction` (`transactionid`))
mysql> insert into transaction(transactionType, transactionAmount, transactiondate,transactiontime) values('deposite', 10000, CURDATE(), CURTIME());
Query OK, 1 row affected (0.01 sec)

mysql> insert into transaction(transactionType, transactionAmount, transactiondate,transactiontime) values('deposite', 10000, CURDATE(), CURTIME());
Query OK, 1 row affected (0.00 sec)

mysql> insert into transaction(transactionType, transactionAmount, transactiondate,transactiontime) values('withdraw', 10000, CURDATE(), CURTIME());
Query OK, 1 row affected (0.01 sec)

mysql> select * from transaction;
+---------------+-----------------+-------------------+-----------------+-----------------+
| transactionid | transactionType | transactionAmount | transactiondate | transactiontime |
+---------------+-----------------+-------------------+-----------------+-----------------+
|             1 | deposite        |             15000 | 2023-01-17      | 14:33:18        |
|             2 | deposite        |              5000 | 2023-01-17      | 14:37:26        |
|             3 | deposite        |             10000 | 2023-01-17      | 14:39:03        |
|             4 | deposite        |             10000 | 2023-01-17      | 15:41:23        |
|             5 | deposite        |             10000 | 2023-01-17      | 15:41:26        |
|             6 | withdraw        |             10000 | 2023-01-17      | 15:42:07        |
+---------------+-----------------+-------------------+-----------------+-----------------+
6 rows in set (0.00 sec)

mysql> insert into atm(deposite, withdraw, checkbalance, atmid) values(true,false,false,4),(true,false,false,5), (false,true,fasle,);
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near ')' at line 1
mysql> insert into atm(deposite, withdraw, checkbalance, atmid) values(true,false,false,4),(true,false,false,5), (false,true,fasle,6);
ERROR 1054 (42S22): Unknown column 'fasle' in 'field list'
mysql> insert into atm(deposite, withdraw, checkbalance, atmid) values(true,false,false,4),(true,false,false,5), (false,true,false,6);
Query OK, 3 rows affected (0.01 sec)
Records: 3  Duplicates: 0  Warnings: 0

mysql> selesct * from atm;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'selesct * from atm' at line 1
mysql> select * from atm;
+----+----------+----------+--------------+-------+
| id | deposite | withdraw | checkbalance | atmid |
+----+----------+----------+--------------+-------+
|  1 |        1 |        0 |            0 |     1 |
|  2 |        1 |        0 |            0 |     2 |
|  3 |        1 |        0 |            0 |     3 |
|  5 |        1 |        0 |            0 |     4 |
|  6 |        1 |        0 |            0 |     5 |
|  7 |        0 |        1 |            0 |     6 |
+----+----------+----------+--------------+-------+
6 rows in set (0.00 sec)

mysql> select * from account;
+-----------+------------+-------------+----------------+------------+--------+
| accountid | accountno  | accountType | accountbalance | customerid | bankid |
+-----------+------------+-------------+----------------+------------+--------+
|         1 | 4567839790 | saving      |          25000 |          1 |   NULL |
|         2 | 4567839757 | saving      |          15000 |          2 |   NULL |
|         3 | 4567839756 | saving      |          10000 |          3 |   NULL |
|         4 | 4585685578 | saving      |         100000 |          4 |   NULL |
+-----------+------------+-------------+----------------+------------+--------+
4 rows in set (0.00 sec)

mysql> select * from transaction;
+---------------+-----------------+-------------------+-----------------+-----------------+
| transactionid | transactionType | transactionAmount | transactiondate | transactiontime |
+---------------+-----------------+-------------------+-----------------+-----------------+
|             1 | deposite        |             15000 | 2023-01-17      | 14:33:18        |
|             2 | deposite        |              5000 | 2023-01-17      | 14:37:26        |
|             3 | deposite        |             10000 | 2023-01-17      | 14:39:03        |
|             4 | deposite        |             10000 | 2023-01-17      | 15:41:23        |
|             5 | deposite        |             10000 | 2023-01-17      | 15:41:26        |
|             6 | withdraw        |             10000 | 2023-01-17      | 15:42:07        |
+---------------+-----------------+-------------------+-----------------+-----------------+
6 rows in set (0.00 sec)

mysql> update account set bankid=1 where accoutid=1;
ERROR 1054 (42S22): Unknown column 'accoutid' in 'where clause'
mysql> update account set bankid=1 where accountid=1;
Query OK, 1 row affected (0.00 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> update account set bankid=2 where accountid=2;
Query OK, 1 row affected (0.00 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> update account set bankid=3 where accountid=3;
ERROR 1452 (23000): Cannot add or update a child row: a foreign key constraint fails (`banksystem`.`account`, CONSTRAINT `account_ibfk_2` FOREIGN KEY (`bankid`) REFERENCES `bankdemo` (`id`))
mysql> update account set bankid=2 where accountid=3;
Query OK, 1 row affected (0.00 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> update account set bankid=1 where accountid=4;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select * from account;
+-----------+------------+-------------+----------------+------------+--------+
| accountid | accountno  | accountType | accountbalance | customerid | bankid |
+-----------+------------+-------------+----------------+------------+--------+
|         1 | 4567839790 | saving      |          25000 |          1 |      1 |
|         2 | 4567839757 | saving      |          15000 |          2 |      2 |
|         3 | 4567839756 | saving      |          10000 |          3 |      2 |
|         4 | 4585685578 | saving      |         100000 |          4 |      1 |
+-----------+------------+-------------+----------------+------------+--------+
4 rows in set (0.00 sec)

mysql> desc transaction;
+-------------------+--------------+------+-----+---------+----------------+
| Field             | Type         | Null | Key | Default | Extra          |
+-------------------+--------------+------+-----+---------+----------------+
| transactionid     | int          | NO   | PRI | NULL    | auto_increment |
| transactionType   | varchar(255) | NO   |     | NULL    |                |
| transactionAmount | float        | NO   |     | NULL    |                |
| transactiondate   | date         | NO   |     | NULL    |                |
| transactiontime   | time         | NO   |     | NULL    |                |
+-------------------+--------------+------+-----+---------+----------------+
5 rows in set (0.01 sec)

mysql> alter table add accountid int;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'add accountid int' at line 1
mysql> alter table account add accountid int;
ERROR 1060 (42S21): Duplicate column name 'accountid'
mysql> alter table transaction add accountid int;
Query OK, 0 rows affected (0.02 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> alter table transaction add foreign key(accountid) references account(accountid);
Query OK, 6 rows affected (0.07 sec)
Records: 6  Duplicates: 0  Warnings: 0

mysql> desc transaction;
+-------------------+--------------+------+-----+---------+----------------+
| Field             | Type         | Null | Key | Default | Extra          |
+-------------------+--------------+------+-----+---------+----------------+
| transactionid     | int          | NO   | PRI | NULL    | auto_increment |
| transactionType   | varchar(255) | NO   |     | NULL    |                |
| transactionAmount | float        | NO   |     | NULL    |                |
| transactiondate   | date         | NO   |     | NULL    |                |
| transactiontime   | time         | NO   |     | NULL    |                |
| accountid         | int          | YES  | MUL | NULL    |                |
+-------------------+--------------+------+-----+---------+----------------+
6 rows in set (0.00 sec)

mysql> select * from transaction;
+---------------+-----------------+-------------------+-----------------+-----------------+-----------+
| transactionid | transactionType | transactionAmount | transactiondate | transactiontime | accountid |
+---------------+-----------------+-------------------+-----------------+-----------------+-----------+
|             1 | deposite        |             15000 | 2023-01-17      | 14:33:18        |      NULL |
|             2 | deposite        |              5000 | 2023-01-17      | 14:37:26        |      NULL |
|             3 | deposite        |             10000 | 2023-01-17      | 14:39:03        |      NULL |
|             4 | deposite        |             10000 | 2023-01-17      | 15:41:23        |      NULL |
|             5 | deposite        |             10000 | 2023-01-17      | 15:41:26        |      NULL |
|             6 | withdraw        |             10000 | 2023-01-17      | 15:42:07        |      NULL |
+---------------+-----------------+-------------------+-----------------+-----------------+-----------+
6 rows in set (0.00 sec)

mysql> select * from account;
+-----------+------------+-------------+----------------+------------+--------+
| accountid | accountno  | accountType | accountbalance | customerid | bankid |
+-----------+------------+-------------+----------------+------------+--------+
|         1 | 4567839790 | saving      |          25000 |          1 |      1 |
|         2 | 4567839757 | saving      |          15000 |          2 |      2 |
|         3 | 4567839756 | saving      |          10000 |          3 |      2 |
|         4 | 4585685578 | saving      |         100000 |          4 |      1 |
+-----------+------------+-------------+----------------+------------+--------+
4 rows in set (0.00 sec)

mysql> update transaction set acoountid = 1 where transactionid=1;
ERROR 1054 (42S22): Unknown column 'acoountid' in 'field list'
mysql> update transaction set accountid = 1 where transactionid=1;
Query OK, 1 row affected (0.00 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> update transaction set accountid = 2 where transactionid=2;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> update transaction set accountid = 3 where transactionid=3;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> update transaction set accountid = 4 where transactionid=3;
Query OK, 1 row affected (0.00 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> update transaction set accountid = 3 where transactionid=4;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> update transaction set accountid = 3 where transactionid=5;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select * from account;
+-----------+------------+-------------+----------------+------------+--------+
| accountid | accountno  | accountType | accountbalance | customerid | bankid |
+-----------+------------+-------------+----------------+------------+--------+
|         1 | 4567839790 | saving      |          25000 |          1 |      1 |
|         2 | 4567839757 | saving      |          15000 |          2 |      2 |
|         3 | 4567839756 | saving      |          10000 |          3 |      2 |
|         4 | 4585685578 | saving      |         100000 |          4 |      1 |
+-----------+------------+-------------+----------------+------------+--------+
4 rows in set (0.00 sec)

mysql> select * from transaction;
+---------------+-----------------+-------------------+-----------------+-----------------+-----------+
| transactionid | transactionType | transactionAmount | transactiondate | transactiontime | accountid |
+---------------+-----------------+-------------------+-----------------+-----------------+-----------+
|             1 | deposite        |             15000 | 2023-01-17      | 14:33:18        |         1 |
|             2 | deposite        |              5000 | 2023-01-17      | 14:37:26        |         2 |
|             3 | deposite        |             10000 | 2023-01-17      | 14:39:03        |         4 |
|             4 | deposite        |             10000 | 2023-01-17      | 15:41:23        |         3 |
|             5 | deposite        |             10000 | 2023-01-17      | 15:41:26        |         3 |
|             6 | withdraw        |             10000 | 2023-01-17      | 15:42:07        |      NULL |
+---------------+-----------------+-------------------+-----------------+-----------------+-----------+
6 rows in set (0.00 sec)

mysql> update transaction set accountid = 3 where transactionid=3;
Query OK, 1 row affected (0.00 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select * from transaction;
+---------------+-----------------+-------------------+-----------------+-----------------+-----------+
| transactionid | transactionType | transactionAmount | transactiondate | transactiontime | accountid |
+---------------+-----------------+-------------------+-----------------+-----------------+-----------+
|             1 | deposite        |             15000 | 2023-01-17      | 14:33:18        |         1 |
|             2 | deposite        |              5000 | 2023-01-17      | 14:37:26        |         2 |
|             3 | deposite        |             10000 | 2023-01-17      | 14:39:03        |         3 |
|             4 | deposite        |             10000 | 2023-01-17      | 15:41:23        |         3 |
|             5 | deposite        |             10000 | 2023-01-17      | 15:41:26        |         3 |
|             6 | withdraw        |             10000 | 2023-01-17      | 15:42:07        |      NULL |
+---------------+-----------------+-------------------+-----------------+-----------------+-----------+
6 rows in set (0.00 sec)

mysql> update transaction set accountid = 4 where transactionid=6;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select * from transaction;
+---------------+-----------------+-------------------+-----------------+-----------------+-----------+
| transactionid | transactionType | transactionAmount | transactiondate | transactiontime | accountid |
+---------------+-----------------+-------------------+-----------------+-----------------+-----------+
|             1 | deposite        |             15000 | 2023-01-17      | 14:33:18        |         1 |
|             2 | deposite        |              5000 | 2023-01-17      | 14:37:26        |         2 |
|             3 | deposite        |             10000 | 2023-01-17      | 14:39:03        |         3 |
|             4 | deposite        |             10000 | 2023-01-17      | 15:41:23        |         3 |
|             5 | deposite        |             10000 | 2023-01-17      | 15:41:26        |         3 |
|             6 | withdraw        |             10000 | 2023-01-17      | 15:42:07        |         4 |
+---------------+-----------------+-------------------+-----------------+-----------------+-----------+
6 rows in set (0.00 sec)

mysql> update account set accountbalance = accountbalance + 10000 where accountid=3;
Query OK, 1 row affected (0.00 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> update account set accountbalance = accountbalance + 10000 where accountid=3;
Query OK, 1 row affected (0.00 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> update account set accountbalance = accountbalance + 10000 where accountid=3;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select * from account;
+-----------+------------+-------------+----------------+------------+--------+
| accountid | accountno  | accountType | accountbalance | customerid | bankid |
+-----------+------------+-------------+----------------+------------+--------+
|         1 | 4567839790 | saving      |          25000 |          1 |      1 |
|         2 | 4567839757 | saving      |          15000 |          2 |      2 |
|         3 | 4567839756 | saving      |          40000 |          3 |      2 |
|         4 | 4585685578 | saving      |         100000 |          4 |      1 |
+-----------+------------+-------------+----------------+------------+--------+
4 rows in set (0.00 sec)

mysql> update account set accountbalance = accountbalance - 10000 where accountid=4;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select * from account;
+-----------+------------+-------------+----------------+------------+--------+
| accountid | accountno  | accountType | accountbalance | customerid | bankid |
+-----------+------------+-------------+----------------+------------+--------+
|         1 | 4567839790 | saving      |          25000 |          1 |      1 |
|         2 | 4567839757 | saving      |          15000 |          2 |      2 |
|         3 | 4567839756 | saving      |          40000 |          3 |      2 |
|         4 | 4585685578 | saving      |          90000 |          4 |      1 |
+-----------+------------+-------------+----------------+------------+--------+
4 rows in set (0.00 sec)

mysql>*/