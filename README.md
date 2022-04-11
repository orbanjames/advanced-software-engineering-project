#PROJECT-MANAGEMENT-APPLICATION(PMA)

This is a project work for the course title: Advanced Software Engineering on Master studies submitted in the Department of Software Engineering and Computer Science, Faculty of Organisational Sciences, UNIVERSITY OF BELGRADE, SERBIA. It is an additional experience using spring boot-2/ spring-framework-5 fully implemented using java Programming Language. The application is more of a CRUD application with some additional logics added to inplements the pie chart for completed and in progress projects. 

The following functions can be executed on the web page after successfully connecting and running the application:

1. Home DashBoard containing projects, employees, user accounts and you can view the list of projects, employees and real time chart for projects completed    and in progress
2. Hr Manager/Admin can add new employees, update and perform other CRUD operations
3. Users can tract projects stage Real Time using the logical pie chart
4. Project manager can add projects and assign to employees
5. Error pages redirection configuration
6. Login and registration page for admins(Hr Manager, Project manager and main admin).

#DATABASE - CONNECTION PARAMETERS

I use postgresql, for data storage and manipulation, 
I have created a database "projectmanager", and you can find the connection in the "Application dev-properties"

classname: "com.postgresql.cj.jdbc.Driver"

subprotocol: "postgres"

subname: "//localhost:5433/student_management_system"

user: "postgres"

password: "postgres"

I used PgAdmin to run a postgreSQL Server on my localhost.




#STARTING THE APPLICATION:

You can CLICK on the MAIN ProjectManagementApplication Class and run the entire project 

http://localhost:8080, navigate to the browser for the application home page. http://localhost:8080 for postman test.




#TESTING THE APPLICATION

I USED J-UNIT TEST AND YOU CNA TEST THE APPLICATION BY RUNNING ALL THE UNITS OR ENTITIES/THEIR UNITS.






LICENSE

COPYRIGHT © 2022 ORBANJAMES.

