package in.codersclub.SpringBootExercises.Model;

public class Sentence {
	private String sentence;

	public String getSentence() {
		return sentence;
	}

	public void setSentence(String sentence) {
		this.sentence = sentence;
	}
	public int count() {
		int count = 0;
		int countword = 1;
		int len=sentence.length();
	    System.out.println(+len);
	    System.out.println(sentence.charAt(0));
	    System.out.println(sentence.charAt(len-1));
	    

	    for (int i = 0; i < len - 1; i++)
	    {
	   
	    	if ((sentence.charAt(i) == ' ') && (sentence.charAt(i + 1) != ' '))
        {
            countword++;
        }
	        if (((sentence.charAt(i) == '.') && (sentence.charAt(i + 1) != '.'))||( i + 1==len-1))
	        {   
	        	
	            count++;
	            System.out.println("no of words "+countword+" "+count);
	            countword=1;
	            
	            
	        }
	    }
	    
	    return count;
	}
}
