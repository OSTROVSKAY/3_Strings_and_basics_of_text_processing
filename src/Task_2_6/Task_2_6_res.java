	
package Task_2_6;
	
public class Task_2_6_res {
	
	// Вывод на печать строки
	public static void Print_line(String line) {
		
		for (int i = 0; i < line.length(); i++) {
				
				System.out.print(line.charAt(i));
			}
		
	}
	
	
	// ПОЛУЧЕНИЕ ИЗ ЗАДАННОЙ СТРОКИ НОВОЙ, ПОВТОРИВ КАЖДЫЙ СИМВОЛ ДВАЖДЫ
	public static String new_line(String line) {
		
		StringBuilder strBuilder = new StringBuilder();
		
		for (int i = 0; i < line.length(); i++ ) {
			
			strBuilder.append(line.charAt(i));
			
			strBuilder.append(line.charAt(i));
			
		}
		
		String new_line = strBuilder.toString();
		
		return new_line;
	}
	
}
