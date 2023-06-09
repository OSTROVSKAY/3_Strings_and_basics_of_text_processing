	
package Task_1_3;
	
public class Task_1_3_res {
	
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
	
	
	// РАСЧЁТ КОЛИЧЕСТВА ЦИФР В СТРОКЕ
	public int countDigits(String line) {
		
		int count = 0;
		
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		System.out.print("Цифры в строке : ");
		
		for (int i = 0; i < line.length(); i++) {
			
			if( Character.isDigit(line.charAt(i)) ) {
				
				System.out.print(line.charAt(i) + "(№ : "+ i + ")" + "  ");
				
				count++;
			}
			
		}
		
		System.out.println("");
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		
		return count;
	}
	
}
