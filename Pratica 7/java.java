package java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public JdbcConnection() {
    super();
  
  
  "jdbc: mysql:/localhost:0300/meu_bd";
    hostName = "localhost";
    userName = "newtonpaiva";
    password = "java rulez!";
    jdbcDriver = "org.gjt.mm.mysql.Driver";
    dataBaseName = "meu_bd";
    dataBasePrefix = "jdbc: mysql:/";
    dabaBasePort = "3306";
  
    url = dataBasePrefix + hostName + ":"+dabaBasePort+"/" + dataBaseName + "/";
  
  }