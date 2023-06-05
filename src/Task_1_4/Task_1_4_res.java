	
package Task_1_4;
	
public class Task_1_4_res {
	
	// Проверка : является ли данный символ цифрой 
	private static boolean isDigit (char ch) {
		
		boolean isDigit = false;
		
		char [] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		
		for (char element : digits) {
			
			if (ch == element) {
				
				isDigit = true;
				}
			}
		return isDigit;
		}
	
	
	// Подсчёт количества чисел в строке : 1 Вариант
	public static int countNumbers (String line) {
		
		int counter = 0;
		
		for (int i = 0; i < line.length(); i++) {
			
			if (isDigit(line.charAt(i))) {
				
				if (i == line.length() - 1 || !isDigit(line.charAt(i + 1))) {
					
					counter++;
				}
			}
		}
		return counter;
	}
	
}
