package com.exercise.bll;

public class HourlyEmployee extends Employee {
	
	private double payof;
	private double hours;
	
	
    
    public HourlyEmployee( String name, String jobTitle, double hrSalary, double hoursWorked )
    {
       super( name, jobTitle ); 
       setpayoff( hrSalary );
       setHours(hoursWorked);
    }
    
    public void setpayoff( double hrSalary )
         {
             if ( hrSalary >= 0.0 )
                payof = hrSalary;
             else
                
                   System.out.println("Hourly payoff must be  >= 0.0" );
          } 
    
       
          public double getpayoff()
          {
             return payof;
          } 
          
          
          public void setHours(double hoursWorked)
          {
        	  if ( ( hoursWorked >= 0.0 ))
        	  {
        		  hours=hoursWorked;
        	  }
        	  else
        	  {
        		 
        		  System.out.println("Hours worked must be >= 0.0" );
        	  }
          }
          public double getHours()
          {
        	  return hours;
          }
          
         
          @Override                                                           
          public double calculatePay()                                            
          {
              return getHours()*getpayoff();                                        
          }

		@Override
		public String toString() {
			return "HourlyEmployee [name="+getName()+", jobTitle="+getJobTitle()+", payoff=" + payof + ", hours=" + hours +", totalpayoff="+calculatePay()+ "]";
		}

		public double getPayof() {
			return payof;
		}

		public void setPayof(double payof) {
			this.payof = payof;
		}

}
