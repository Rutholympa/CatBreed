# CatBreed
CRUD Operations for Cat Breed Application using Java REST API
### Things todo list:
1. Clone this repository: `git clone https://github.com/Rutholympa/CatBreed.git`
2. Go inside the folder: `cd CatBreed`
3. Run the application: `mvn clean spring-boot:run`
4. Open your favorite browser: http://localhost:8080

![image](https://user-images.githubusercontent.com/81294086/169013482-bf7704d1-b5b3-40a5-8f43-cd6da2a30cfa.png)


Add Form

![image](https://user-images.githubusercontent.com/81294086/169013574-0834a968-7037-423b-8934-adf6661361c6.png)


Used H2 Database for simple implementation

![image](https://user-images.githubusercontent.com/81294086/169013712-20061402-2667-442a-a167-208bb940b57d.png)


To use MySQL database,
Already mysql dependency has been added in pom
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <scope>runtime</scope>
</dependency>

Open MySQL in local 
Make sure it is up and running

Change application.properties as below with your DB details

spring.datasource.url=jdbc:mysql://localhost:3306/cat_breed?createDatabaseIfNotExist=true&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=Asia/Jakarta&useSSL=false
spring.datasource.username=root
spring.datasource.password=root
