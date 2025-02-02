package com.tca;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class AddStudent 
{
	public static void main(String[] args) 
	{
		Connection con=null;
		PreparedStatement ps =null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		final String DB_URL  = "jdbc:mysql://localhost:3300/hfb02";
		final String DB_USER = "root";
		final String DB_PWD  = "root";
		
		try
		{
			//1. Load Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2. Form the Connection
			con = DriverManager.getConnection(DB_URL,DB_USER,DB_PWD);
			
			System.out.print("Enter the Roll Number : ");
			int rno = Integer.parseInt(br.readLine());
			
			System.out.print("Enter the Name :");
			String name = br.readLine();
			
			System.out.print("Enter Percentage :");
			double per = Double.parseDouble(br.readLine());
			
			
			//3. Prepare SQL
			ps = con.prepareStatement("INSERT INTO student VALUES(?,?,?)");
			
			ps.setInt(1, rno);
			ps.setString(2, name);
			ps.setDouble(3, per);
			
			// 4. Fire SQL
			int sval = ps.executeUpdate();
			
			if(sval==1)
			{
				System.out.println("Record Saved Successfully !!");
			}
			else
			{
				System.out.println("Record is not Saved Successfully !!");
			}
		}
		catch(Exception e)
		{
			System.out.println("Problem in SQL");
			e.printStackTrace();
		}
		finally
		{
			try
			{
				// 5.close connection
				System.out.println("Connection Closed");
				br.close();
				con.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	}

}
