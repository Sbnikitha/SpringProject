package in.codersclub.SpringBootExercises.Model;

public class Number {
	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public String word() {
		System.out.print(num);
		 String word;
	        switch (num) {
	            case 1:  word = "One";
	                     break;
	            case 2:  word = "Two";
	                     break;
	            case 3:  word = "Three";
	                     break;
	            case 4:  word = "four";
	                     break;
	            case 5:  word = "five";
	                     break;
	            case 6:  word = "six";
	                     break;
	            case 7:  word = "seven";
	                     break;
	            case 8:  word = "eight";
	                     break;
	            case 9:  word = "nine";
	          
	            default: word = "Invalid ";
	                     break;
	        }
	        return word;
	
	}
}
