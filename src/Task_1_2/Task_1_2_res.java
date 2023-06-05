	
package Task_1_2;
	
public class Task_1_2_res {
	
	public static String changeWords(String word) {
		
		StringBuilder strBuilder = new StringBuilder();
		
		String letter;
		
		for (int i = 0; i < word.length(); i++) {
			
			if (i + 3 < word.length() & word.charAt(i) == 'w'
								  & word.charAt(i + 1) == 'o'
								  & word.charAt(i + 2) == 'r'
								  & word.charAt(i + 3) == 'd') {
				
				strBuilder.append("letter");
				
				i += 3;
				
			} else {
				
				strBuilder.append(word.charAt(i));
			}
		}
		
		letter = strBuilder.toString();
		
		return letter;
	}
	
}
