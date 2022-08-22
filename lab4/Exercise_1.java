package lab4;

public class Exercise_1 {

	class Person{
	    String name;
	    float age;
	}

	class Account extends Person{
	    private long accno;
	    double balance;
	    
	    
	    public void accholder(String nam, float ag){
	        name = nam;
	        age = ag;
	    }
	   
	    public double deposit(double dep){
	        balance = balance + dep;
	        return balance;
	        }
	    
	    public double withdraw(double widraw){
	        
	        balance = balance - widraw;
	        return balance;
	    }
	    
	    public double getBalance(){
	        return balance;
	    }
	    
	    public void setaccno(long acc){
	        accno = acc;
	    
	    }
	    public long getaccno(){
	        return accno;
	    }
	    
	    
	}

	class SavingsAccount extends Account {
	    
	    final double minBalance = 500;
	    
	    @Override
	    public double withdraw(double widraw){
	        
	        if(balance>minBalance){
	            balance = balance - widraw;
	        }
	        return balance;
	        
	    }

	class CurrentAccount extends Account{
	    
	    double overdraftLimit = 10000;
	    @Override
	    public double withdraw(double widraw){
	        if(widraw>1000){
	            return -1;
	        }
	        else
	            return 1;
	        
	    }
	}
	    
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
