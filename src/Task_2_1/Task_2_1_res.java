	
package Task_2_1;
	
public class Task_2_1_res {
	
	// Вывод на печать строки
	public void Print_line(String line) {
		
		System.out.println("------------------------------------------------------------------------------------------------");
		
		System.out.print("Вывод строки на печать : ");
		
		for (int i = 0; i < line.length(); i++) {
			
			System.out.print(line.charAt(i));
		}
		
		System.out.println("");
		System.out.println("------------------------------------------------------------------------------------------------");
		
	}
	
	
	// ВЫЧИСЛЕНИЕ НАИБОЛЬШЕГО КОЛИЧЕСТВА ПОДРЯД ИДУЩИХ ПРОБЕЛОВ В СТРОКЕ
	public int big_space(String line) {
		
		int big_space = 0;
		
		int temp = 0;
		
		int check1 = 0;
		
		int end = 0;
		
		int count = 0;
		
		for( int j = line.length() - 1; j >= 0; j-- ) {
			
			if ( line.charAt(j) == ' ' & check1 == 0) {
				
				end ++;
				
			}
			
			else {check1 = 1; break; }
			
		}
		
		
		for( int i = 0; i < line.length() - end; i++ ) {
			
			if( line.charAt(i) == ' ' ) {
				
				temp++;
			
			}
			
			
			else if ( line.charAt(i) != ' ' ){
				
				if (temp > 0) {
					
					count ++;
					
					System.out.println("Номер серии подряд идущих пробелов : " + count + "  " + "Количество пробелов в серии : " + temp );
					System.out.println("---------------------------------------------------------------------------");
					
					if( temp > big_space ) {
					
					big_space = temp;
				}
				
			}
				
				temp = 0;
				
			}
			
		}
		
		if( end > 0 ) {
			
			System.out.println("Номер серии подряд идущих пробелов : " + (count + 1) + "  " + "Количество пробелов в серии : " + end );
			System.out.println("---------------------------------------------------------------------------");
			
			if( end > big_space ) { big_space = end; }
		}
		
		return big_space;
	}
	
}
