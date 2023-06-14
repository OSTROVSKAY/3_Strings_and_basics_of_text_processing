	
package Task_2_5;
	
public class Task_2_5_res {
	
	// ВЫЧИСЛЕНИЕ ЧИСЛА СИМВОЛОВ 'a' В ЗАДАННОЙ СТРОКЕ
	public int calculation(String line) {
		
		int count = 0;
		
		for(int i = 0; i < line.length(); i++) {
			
			if(line.charAt(i) == 'a') {
				
				count ++;
			}
		}
		
		return count;
	}
	
}
