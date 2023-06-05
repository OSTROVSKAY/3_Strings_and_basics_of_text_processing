	
package Task_1_5;
	
public class Task_1_5_res {
	
	// Удаление всех лишних пробелов в строке
	public static String removeExtraSpaces(String s) {
		
		StringBuilder strBuilder = new StringBuilder();
		
		String line = s.trim();
		
		boolean isSpace = false;
		
		for (int i = 0; i < line.length(); i++) {
			
			if (line.charAt(i) == ' ') {
				
				if (!isSpace) {
					
					strBuilder.append(" ");
				}
				
				isSpace = true;
				
			} else {
				
				strBuilder.append(line.charAt(i));
				
				isSpace = false;
			}
		}
		
		return strBuilder.toString();
	}
	
}
