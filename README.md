#PROJECT-MANAGEMENT-SYSTEM(PMS)

This is a project work for the course title: Advanced Software Engineering on Master studies submitted in the Department of Software Engineering and Computer Science, Faculty of Organisational Sciences, UNIVERSITY OF BELGRADE, SERBIA. It is an additional experience using spring boot-2/ spring-framework-5 fully implemented using java Programming Language. The application is a CRUD application that allows the users/students to log in with username and password after registration from the user account page and can see the list of students on scholarship, view the list of universities, faculties and courses available in various universities of their choice.

DATABASE - Connection parameters
I use postgresql, for data storage and manipulation, and I have created a database student_management_system, and you can find the connection in the "dev-config.edn"

classname: "com.postgresql.cj.jdbc.Driver"
subprotocol: "postgres"
subname: "//localhost:5433/student_management_system"
user: "postgres"
password: "postgres"
I used PgAdmin to run a postgreSQL Server on my localhost.
Starting the application from terminal:
terminal 1: lein run

terminal 2: npx shadow-cljs watch app" for clojurescript.

http://localhost:3000, navigate to the browser for the application home page and clojurescript handle. http://localhost:3000 for swagger ui.

#Testing of the application

Lein test


License
