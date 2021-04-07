#   REST backend 
Generated with Spring Boot  (Spring Data JPA ) for accessing MS SQL database to display a partial information about the customer's order .
Dependencies and builds are  handled by  Maven 
Maven also capable to builds a single, runnable "über-jar".
All the configuratons are in resources\application.properties file.


### Run with maaven

mvn spring-boot:run





### EXAMPLE HTTP GET

http://localhost:8080/pwds/search/findByPwd?pwd=******
response example is in the PWDQuery.JPG 




###### Mixed case in table name issue
IN our case the table name is spec in a tabOrdre wiew , and the behavior of the org.hibernate.cfg.ImprovedNamingStrategy
us to change a camelCase to under_score in table name to fix it we need to change an the behavior of the ImprovedNamingStrategy
 to DefaultNamingStrategy
 we can do this by adding a :
spring.jpa.hibernate.naming-strategy=org.hibernate.cfg.DefaultNamingStrategy
 to *applicaton.properties* file
