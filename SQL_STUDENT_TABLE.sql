Question: create student table contains columns id int primary key,name varchar(10) not null,address varchar(10) not null,age int not null. insert 5 records in student tables . and perform all aggregate function (sum,avg,min,max.count)in age column.

mysql> create database sample1;
Query OK, 1 row affected (0.03 sec)

mysql> use sample1;
Database changed
mysql> create table student (id int primary key,name varchar(10) not null,address varchar(10) not null,age int not null);
Query OK, 0 rows affected (0.06 sec)

mysql> insert into student values(1, 'Asad', 'Nerul', 23),
    (2, 'Vinayak', 'thane', 22),
    (3, 'Piyush', 'Airoli', 23),
    (4, 'Rahul', 'Kalyan', 21),
    (5, 'Aditi', 'Kalyan', 20);


Query OK, 5 rows affected (0.01 sec)
Records: 5  Duplicates: 0  Warnings: 0

mysql> select * from student;
+----+---------+-----------+-----+
| id | name   | address | age |
+----+---------+-----------+-----+
|  1 | Asad   | Nerul   |  23 |
|  2 | Vinayak| thane   |  22 |
|  3 | Piyush | Airoli  |  23 |
|  4 | Rahul  | kalyan  |  21 |
|  5 | Aditi  | kalyan  |  20 |
+----+---------+-----------+-----+
5 rows in set (0.00 sec)

mysql> select sum(age) from student;
+----------+
| sum(age) |
+----------+
|      109 |
+----------+
1 row in set (0.01 sec)

mysql> select count(age) from student;
+------------+
| count(age) |
+------------+
|          5 |
+------------+
1 row in set (0.01 sec)

mysql> select min(age) from student;
+----------+
| min(age) |
+----------+
|       20 |
+----------+
1 row in set (0.00 sec)

mysql> select max(age) from student;
+----------+
| max(age) |
+----------+
|       23 |
+----------+
1 row in set (0.00 sec)

mysql> select avg(age) from student;
+----------+
| avg(age) |
+----------+
|  21.8    |
+----------+
1 row in set (0.00 sec)