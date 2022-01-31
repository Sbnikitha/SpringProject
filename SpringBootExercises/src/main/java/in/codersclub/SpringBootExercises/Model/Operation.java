package in.codersclub.SpringBootExercises.Model;

public class Operation {
	private int num1;
	private int num2;
	private char operator;
	
	public char getOperator() {
		return operator;
	}
	public void setOperator(char operator) {
		this.operator = operator;
	}
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public double Total()
	{
		double result = 0;
		 switch(operator)
	        {
	            case '+' :
	            {
	            	result   = num1+num2;
	            }
	            case '-' :
	            {
	            	result   = num1-num2;
	               
	            }
	            case '*' :
	            {
	            	 result  = num1*num2;
	            }
	            case '/' :
	            {
	            	result   = num1/num2;

	            }
	          
	        }
		 return result;
		 
	}
}
