This is my first RESTful with Spring Boot, Spring Data JPA, H2 database

requirements: 
- JDK 23

First Run application in cmd or ide

1. cmd: 
- go to directory To-Do-List-API
- paste this command mvnw.cmd spring-boot:run
  
2. ide run Application

Adding Post: 
- Run PowerShell
-paste this command Invoke-WebRequest -Uri "http://localhost:8080/tasks" -Method POST -Headers @{ "Content-Type" = "application/json" } -Body '{"title": "New Task", "completed": false}'

Deleting Post:
-Run PowerShell
- paste this command -Uri "http://localhost:8080/tasks/1" -Method DELETE

Database:
-in browser paste http://localhost:8080/h2-console username = sa password = password
- paste this comand Select * from Task and you see all tasks

Display all Tasks:
-in browser paste http://localhost:8080/tasks
