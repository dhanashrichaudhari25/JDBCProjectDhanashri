package com.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class BankCRUD {
	public static boolean insertAcc(Bank b) {
		boolean f=false;
		try {
			Connection con=Connection1.createC();
			String s="insert into ACCOUNT(accno,name,balance)values(?,?,?)";
		
			PreparedStatement st=con.prepareStatement(s);
			
			st.setInt(1, b.getAccno());
			st.setString(2, b.getName());
			st.setInt(3, b.getBalance());
		
			st.executeUpdate();
			f=true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return f;
		
	}
	public static boolean deleteAcc(int accno) {
		boolean f=false;
		try {
			Connection con=Connection1.createC();
			String s="delete from ACCOUNT where accno=?";
			
			PreparedStatement st=con.prepareStatement(s);
	
			st.setInt(1, accno);
		
			st.executeUpdate();
			f=true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return f;
		
	}

public static boolean  showAccount() {
	boolean f=false;
	try {
		Connection con=Connection1.createC();
		String s="select * from ACCOUNT";
		Statement st=con.createStatement();
		ResultSet set=st.executeQuery(s);
	
		while(set.next())
		{
			int accno=set.getInt(1);
			String name=set.getString(2);
			int balance=set.getInt(3);
			
			System.out.println("Account No. :"+accno);
			System.out.println("Account Name :"+name);
			System.out.println("Balance:"+balance);
			
			System.out.println("=================================================");
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return f;
}

public static boolean updateAcc(String name,int accno) {
	boolean f=false;
	try {
		Connection con=Connection1.createC();
		String s="update ACCOUNT set name=? where accno=?";
		
		PreparedStatement st=con.prepareStatement(s);
		
		st.setString(1,name);
		st.setInt(2, accno);

		st.executeUpdate();
		f=true;
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return f;
	}

}

