# STRUS 2 - CRUD

- XML Configuration
- JDBC 
- MySQL
- Docker

___

## How to run the project:
- You can run the project by upping docker-compose located in project root directory,
access localhost:8081 to get into _adminer_ (DBMS). Manually create a new database called **struts2crud** and create also a table and its columns **(id autoincrement, name, number)**.
- Configure Apache Tomcat (8.5 preferably) to project.
- Starting up Tomcat server go to: http://localhost:8080/struts2xml/index.jsp. You can access
the list action directly from http://localhost:8080/struts2xml/ListContacts.action

___

## Important:
- Copy _Maven Dependencies_ to **src/main/webapp/WEB-INF/lib**;
- Docker volumes will be stored at $YOUR_HOME_DIRECTORY/utils/docker/volumes/struts2crud;
- If application can not read **struts.xml** file try moving it to **src/main/resources/** folder;

___
