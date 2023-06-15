	
package Task_2_9;
	
public class Task_2_9_res {
	
	// Вывод на печать строки
	public void Print_line(String line) {
		
		for (int i = 0; i < line.length(); i++) {
		
			System.out.print(line.charAt(i));
		}
	}
	
	
	// ПОДСЧЁТ КОЛИЧЕСТВА АНГЛИЙСКИХ СТРОЧНЫХ ( МАЛЕНЬКИХ ) И ПРОПИСНЫХ ( БОЛЬШИХ ) БУКВ В СТРОКЕ
	
	// Подсчёт количества строчных ( маленьких ) букв в строке
	public int find_lower_case_count(String line) {
		
		System.out.println("СТРОЧНЫЕ АНГЛИЙСКИЕ БУКВЫ В СТРОКЕ : ");
		System.out.println("------------------------------------");
		
		int lower_case_count = 0;
		
		for (int i = 0; i < line.length(); i++) {
			
			if (line.charAt(i) >= 'a' && line.charAt(i) <= 'z') {
				
				lower_case_count ++;
				
				System.out.println("Буква № " + lower_case_count + " : " + line.charAt(i));
				System.out.println("------------------------------------");
			}
		}
		
		if (lower_case_count == 0) {
			
			System.out.println("--------");
			System.out.println("Букв нет");
			System.out.println("--------");
		}
		
		return lower_case_count;
	}
	
	
	// Подсчёт количества прописных ( больших ) букв в строке
	public int find_upper_case_count(String line) {
		
		System.out.println("ПРОПИСНЫЕ АНГЛИЙСКИЕ БУКВЫ В СТРОКЕ : ");
		System.out.println("--------------------------------------");
		
		int upper_case_count = 0;
		
		for (int i = 0; i < line.length(); i++) {
			
			if ( line.charAt(i) >= 'A' && line.charAt(i) <= 'Z') {
				
				upper_case_count ++;
				
				System.out.println("Буква № " + upper_case_count + " : " + line.charAt(i));
				System.out.println("------------------------------------");
				
			}
			
		}
		
		if (upper_case_count == 0) {
			
			System.out.println("--------");
			System.out.println("Букв нет");
			System.out.println("--------");
		}
		
		return upper_case_count;
	}
	
}
