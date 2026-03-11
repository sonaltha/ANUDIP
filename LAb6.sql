mysql> Create table student(
      id int primary key,
      name varchar(10) not null,
      address varchar(10) not null,
      age int not null
     );
Query OK, 0 rows affected (0.39 sec)

mysql> desc student;
+---------+-------------+------+-----+---------+-------+
| Field   | Type        | Null | Key | Default | Extra |
+---------+-------------+------+-----+---------+-------+
| id      | int         | NO   | PRI | NULL    |       |
| name    | varchar(10) | NO   |     | NULL    |       |
| address | varchar(10) | NO   |     | NULL    |       |
| age     | int         | NO   |     | NULL    |       |
+---------+-------------+------+-----+---------+-------+
4 rows in set (0.10 sec)

mysql> Insert into student values(1,'Riya','Bandra',23),
    -> (2,'siya','parel',22),
    -> (3,'diya','sion',21),
    -> (4,'liya','dadar',22),
    -> (5,'priya','kurla',20);
Query OK, 5 rows affected (0.03 sec)
Records: 5  Duplicates: 0  Warnings: 0

mysql> select *from student;
+----+-------+---------+-----+
| id | name  | address | age |
+----+-------+---------+-----+
|  1 | Riya  | Bandra  |  23 |
|  2 | siya  | parel   |  22 |
|  3 | diya  | sion    |  21 |
|  4 | liya  | dadar   |  22 |
|  5 | priya | kurla   |  20 |
+----+-------+---------+-----+
5 rows in set (0.00 sec)

mysql> SELECT sum(Age) from student;
+----------+
| sum(Age) |
+----------+
|      108 |
+----------+
1 row in set (0.07 sec)

mysql> select avg(age) ,min(age),max(age),count(Age) from student;
+----------+----------+----------+------------+
| avg(age) | min(age) | max(age) | count(Age) |
+----------+----------+----------+------------+
|  21.6000 |       20 |       23 |          5 |
+----------+----------+----------+------------+
1 row in set (0.04 sec)