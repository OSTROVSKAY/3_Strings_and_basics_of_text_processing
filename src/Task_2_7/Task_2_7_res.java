	
package Task_2_7;
	
public class Task_2_7_res {
	
	// Вывод на печать строки
	public void Print_line(String line) {
		
		for (int i = 0; i < line.length(); i++) {
			
				System.out.print(line.charAt(i));
			}
	}
	
	
	// УДАЛЕНИЕ ИЗ СТРОКИ ПОВТОРЯЮЩИХСЯ СИМВОЛОВ И ВСЕХ ПРОБЕЛОВ
	public String delete_from_string(String line) {
		
		StringBuilder stringBuilder = new StringBuilder();
		
		int check = 0;
		
		for (int i = 0; i < line.length(); i++) {
			
			check = 0;
			
			for (int j = i - 1; j >= 0; j--) {
				
				if( line.charAt(i) == line.charAt(j) ) {
					
					check = 1;
					
				}
				
			}
			
			if (check == 0) {
				
				if( line.charAt(i) != ' ' ) {
					
					stringBuilder.append(line.charAt(i));
					}
			}
			
		}
		
		String new_line = stringBuilder.toString();
		
		return new_line;
	}
	
}
