package com.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BankMain {

	public static void main(String[] args) throws IOException {
		System.out.println("===BANK MANAGEMENT SYSTEM===");
		System.out.println("=========================================");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			System.out.println("Choose 1 to Insert Account");
			System.out.println("Choose 2 to Delete Account");
			System.out.println("Choose 3 to Display Account");
			System.out.println("Choose 4 to Update Account");
			System.out.println("Choose 5 to exit");
			int choice=Integer.parseInt(br.readLine());
			if(choice==1)
			{
				System.out.println("ENTER ACCOUNT HOLDER NAME:");
				String name=br.readLine();
				System.out.println("ENTER ACCOUNT BALANCE:");
				int balance=br.read();
				
				Bank b=new Bank(name,balance);
				boolean answer=BankCRUD.insertAcc(b);
				if(answer)
				{
					System.out.println("Account created successfully...");
				}else
				{
					System.out.println("Try again...");
				}
			}
			else if(choice==2) {
				
				System.out.println("ENTER ACCOUNTNO TO DELETE:");
				int accno=Integer.parseInt(br.readLine());
				boolean f=BankCRUD.deleteAcc(accno);
				if(f) {
					System.out.println("Deleted..");
				}
				else
				{
					System.out.println("Try Again...");
				}
			}
			else if(choice==3)
			{
				
				BankCRUD.showAccount();
				
			}
			else if(choice==4)
			{
				
				System.out.println("ENTER ACCNO:");
				int accno=Integer.parseInt(br.readLine());
				System.out.println("ENTER NAME:");
				String name=br.readLine();
				
				boolean answer=BankCRUD.updateAcc(name,accno);
				if(answer)
				{
					System.out.println("Account updated successfully..");
				{
					System.out.println("try again...");
				}
				
			}
			else
			{
				break;
			}
			
		}
		
	}
}

}
