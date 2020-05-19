package test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import java.sql.Driver;

public class Sol {
	 public static void main(String[] args) throws ClassNotFoundException, SQLException, NumberFormatException, IOException {
		//System.out.println(KnowlageBase.GetKB("S1","R1"));
		 Interpritator.Start();
		 Logging.PrintChain(FactBase.GetChain());
	 }  
	 }
