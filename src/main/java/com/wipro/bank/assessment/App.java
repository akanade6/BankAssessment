package com.wipro.bank.assessment;

import com.wipro.bank.entity.Account;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{

	public static final List<Account> accounts = new ArrayList<Account>();
	private List<Account> emp2;

	public Account getAccountDetailsByID(int id)    {
           Account emp1=null;
           for(Account e:accounts)
           {
                  if(e.getAccountID()==id){
                        emp1=e;
                  }                  
           }
           return emp1;          
           
    }
    
    public List<Account> getAccountDetailsByBalance(double amount)
    {      
    emp2 =new ArrayList<Account>();          
           for(Account e:accounts){                 
                  if(e.getBalance()>=amount){                     
                        emp2.add(e);
                  }
           }
           if(emp2.size()==0){
                  emp2=null;
           }
           return emp2;         
           
    }

	public static void main( String[] args )
	{
		

	}
}
