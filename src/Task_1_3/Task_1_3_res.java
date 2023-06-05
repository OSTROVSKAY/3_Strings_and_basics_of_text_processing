	
package Task_1_3;
	
public class Task_1_3_res {
	
	public int countDigits(String line) {
		
		int count = 0;
		
		for (int i = 0; i < line.length(); i++) {
			
			if( Character.isDigit(line.charAt(i)) ) {
				
				count++;
			}
			
		}
		
		return count;
	}
	
}
