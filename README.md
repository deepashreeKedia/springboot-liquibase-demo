# springboot-liquibase-demo

A simple maven project for demonstrating how liquibase can be integrated with spring-boot. It also shows how liquibase changesets
can be executed on selected spring profiles ie environments- prod, dev, test etc.


# Liquibase
It is a library for database migration and versioning. The changesets for each version is maintained with the application code. Whenever application id deployed, before starting of the application, these changesets are applied on the database
(based on which environment we are deploying changes to).

# To be done
Generating changesets automatically by taking the diff between databases.

