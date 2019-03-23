# Philosophy Trends

Contents of src/main/resources/application.properties:

```
spring.mvc.view.prefix: /WEB-INF/jsp/
spring.mvc.view.suffix: .jsp

## Spring DATASOURCE (DataSourceAutoConfiguration & DataSourceProperties) 
spring.datasource.driverClassName=org.postgresql.Driver
spring.datasource.url=jdbc:postgresql://server:5432/database
spring.datasource.username=username
spring.datasource.password=password
# The SQL dialect makes Hibernate generate better SQL for the chosen database
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.properties.hibernate.current_session_context_class=org.springframework.orm.hibernate5.SpringSessionContext
# prevents java.sql.SQLFeatureNotSupportedException: Method org.postgresql.jdbc.PgConnection.createClob() is not yet implemented.
spring.jpa.properties.hibernate.jdbc.lob.non_contextual_creation=true

# Hibernate ddl auto (create, create-drop, validate, update)
# We don't want this because we use liquibase to version the database 
# and then generate the entities from the tables
#spring.jpa.hibernate.ddl-auto = update
# Options, not used for now
#spring.datasource.maxActive=10
#spring.datasource.maxIdle=5
#spring.datasource.minIdle=2
#spring.datasource.initialSize=5
#spring.datasource.removeAbandoned=true

hibernate.connection.driver_class=org.postgresql.Driver
hibernate.connection.url=jdbc:postgresql://server:5432/database?currentSchema=philosophytrends
hibernate.connection.username=username
hibernate.connection.password=password


## Liquibase

driver=org.postgresql.Driver
url=jdbc:postgresql://server:5432/database?currentSchema=philosophytrends
username=username
password=password
changeLogFile=db/changelog/db.changelog.xml
```

Deploy to Heroku:

```
$ mvn clean heroku:deploy-war
```

Run locally:

```
$ mvn spring-boot:run
```

Update database schema with Liquibase:

```
$ mvn liquibase:update 
```