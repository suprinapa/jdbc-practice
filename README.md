# jdbc-practice
Simple jdbc
JDBC

1) import the package----> java.sql.*
2) Load the Driver -----> com.mysql.jdbc.Driver (mysql-connector)
   Register the Driver-----> Class.forName("com.mysql.jdbc.Driver)-- method
3) Establich the Connection----> connection is interface
				we cannot instanciate the interface directly					
 				getConnection() static metod that gives you object of connection 
4) Create the statement---->     Statement ----->execute query with the help of Statement object 
				PreparedStatement---->inbuilt query/predefined query but different value
				Collable Statement---->if u want to execute Procedural Lanaguage
5) Exectue the Query----> tables...etc
6) Process Result
7) Close the connection-----> get the object of Statement/Connection


url ====jdbc:mysql://localhost:3306/*database name*
jdbc is the API
mysql is the database
localhost is the server name on which mysql is running (we may also use IP address)
3306 is the port number and 
