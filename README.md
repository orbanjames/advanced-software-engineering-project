#PROJECT-MANAGEMENT-SYSTEM(PMS)

This is a project work for the course title: Advanced Software Engineering on Master studies submitted in the Department of Software Engineering and Computer Science, Faculty of Organisational Sciences, UNIVERSITY OF BELGRADE, SERBIA. It is an additional experience using spring boot-2/ spring-framework-5 fully implemented using java Programming Language. The application is a CRUD application that allows the users/students to log in with username and password after registration from the user account page and can see the list of students on scholarship, view the list of universities, faculties and courses available in various universities of their choice.


#DATABASE - Connection parameters

I use postgresql, for data storage and manipulation, 
I have created a database student_management_system, and you can find the connection in the "dev-config.edn"

classname: "com.postgresql.cj.jdbc.Driver"

subprotocol: "postgres"

subname: "//localhost:5433/student_management_system"

user: "postgres"

password: "postgres"

I used PgAdmin to run a postgreSQL Server on my localhost.

#STARTING THE APPLICATION:

YOU CAN CLICK ON MAIN CLASS AND RUN IT 

http://localhost:8080, navigate to the browser for the application home page. http://localhost:8080 for postman test.


#TESTING THE APPLICATION

I USED J-UNIT TEST AND YOU CNA TEST THE APPLICATION BY RUNNING ALL THE UNITS OR ENTITIES/THEIR UNITS.


LICENSE

Copyright © 2022 ORBANJAMES.

