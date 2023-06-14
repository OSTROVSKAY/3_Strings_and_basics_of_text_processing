	
package Task_2_2;
	
public class Task_2_2_res {
		
		// Вывод на печать строки
		public void Print_line(String line) {
			
			for (int i = 0; i < line.length(); i++) {
				
				System.out.print(line.charAt(i));
			}
			
		}
		
		// ВСТАВКА В СТРОКЕ ПОСЛЕ КАЖДОГО СИМВОЛА 'A' СИМВОЛА 'B'
		
		public StringBuilder insert_line (String line) {
			
			StringBuilder strBuilder = new StringBuilder();
			
			for (int i = 0; i < line.length(); i++) {
				
				if(line.charAt(i) != 'a') {
					
					strBuilder.append(line.charAt(i));
					
				}
				
				else if(line.charAt(i) == 'a'){
					
					strBuilder.append(line.charAt(i));
					
					strBuilder.append('b');
					
				}
				
			}
			
			return strBuilder;
		}
	
}
