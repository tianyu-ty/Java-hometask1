package hometask1p4;

public class StringCharacters {
	
	public static void main(String[] args) {  
		 String text = "To be or not to be, that is the question;"  
	                + "Whether 'tis nobler in the mind to suffer"  
	                + " the slings and arrows of outrageous fortune,"  
	                + " or to take arms against a sea of troubles,"  
	                + " and by opposing end them?";  
	  
	        //I defined 'words' as any sequence of characters separated by spaces,ignoring letter capitalization and punctuation.   
	        //The split() function breaks the soliloquy into an array of words.
		 	//I use the regular expression \\p{Punct} to match all punctuation marks and replace them with empty strings, and convert to lowercase.
	        //Then the bubble sort algorithm is used to sort the words alphabetically.
		 
	  
	        String[] words = text.split(" ");  
 
	        for (int i = 0; i < words.length; i++) {  
	            words[i] = words[i].replaceAll("\\p{Punct}", "").toLowerCase();  
	        }  
   
	        for (int i = 0; i < words.length - 1; i++) {  
	            for (int j = 0; j < words.length - i - 1; j++) {  
	                if (words[j].compareTo(words[j + 1]) > 0) {  
	                    String temp = words[j];  
	                    words[j] = words[j + 1];  
	                    words[j + 1] = temp;  
	                }  
	            }  
	        }  
   
	        for (String word : words) {  
	            System.out.println(word);  
	        }  
	    }  
}
