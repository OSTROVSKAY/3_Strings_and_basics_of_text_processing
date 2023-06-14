	
package Task_2_3;
	
public class Task_2_3_res {
	
/*
	Палиндром (от древне-греческих слов - «назад, снова» и «бег, движение») —
	число, буквосочетание, слово или текст, одинаково читающееся в обоих направлениях.
	Пример слова-палиндрома : топот
*/
	
	// Вывод на печать строки
	public void Print_line(String line) {
		
		for (int i = 0; i < line.length(); i++) {
			
				System.out.print(line.charAt(i));
			}
			
		}
	
	
	// ПРОВЕРКА - ЯВЛЯЕТСЯ ЛИ ЗАДАННОЕ СЛОВО ПАЛИНДРОМОМ
	public boolean word_check( String line ) {
		
		boolean check = false;
		
		StringBuilder strBuilder = new StringBuilder();
		
		for ( int i = line.length() - 1; i >= 0; i-- ) {
			
			strBuilder.append(line.charAt(i));
			
		}
		
		String new_line = strBuilder.toString();
		
		System.out.println("--------------------------------------------------------");
		System.out.print("ВЫВОД НА ПЕЧАТЬ ИТОГОВОГО СЛОВА : ");
		Print_line(new_line);
		System.out.println("");
		System.out.println("--------------------------------------------------------");
		
		int check1 = 0;
		
		if( line.length() == new_line.length() ) {
			
			int size = new_line.length();
			
			for ( int i = 0; i < size; i++) {
				
				if( line.charAt(i) != new_line.charAt(i) ) {
					
					check1 = 1;
				}
				
			}
			
		}
		
		
		if( check1 == 0) {
			
			check = true;
		}
		
		return check;
	}
	
}
