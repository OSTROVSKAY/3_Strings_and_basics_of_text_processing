	
package Task_1_2;
	
public class Task_1_2_1_res {
	
	// ЗАМЕНА В СТРОКЕ ВСЕХ ВХОЖДЕНИЙ 'word' НА 'letter'
	public char[] array_convers( char[] begin, int diff) {
		
		// Число вхождений 'word'
		int count = 0;
		
		int check = 1;
		
		for (int i = 0; i < begin.length; i++) {
			
			if ( i + 3 < begin.length ) {
				
				if( begin[i] == 'w' & begin[i + 1] == 'o' & begin[i + 2] == 'r' & begin[i + 3] == 'd' ) {
					
					i = i + 3;
					
					count++;
				}
				
			}
			
			else {
				
				check = 0;
				
				System.out.println("-------------------------------------");
				System.out.println("В начальном массиве меньше 4 символов");
				System.out.println("-------------------------------------");
				}
			
		}
		
		char[] result = new char [begin.length + diff*count];
		
		if ( check == 1 ) {
		
		int count1 = 0;
		
		for (int i = 0; i < begin.length; i++) {
			
			if( begin[i] == 'w' & begin[i + 1] == 'o' & begin[i + 2] == 'r' & begin[i + 3] == 'd' ) {
				
				result[i + count1] = 'l';
				
				result[i + 1 + count1] = 'e';
				
				result[i + 2 + count1] = 't';
				
				result[i + 3 + count1] = 't';
				
				result[i + 4 + count1] = 'e';
				
				result[i + 5 + count1] = 'r';
				
				count1 = count1 +diff;
				
				i = i + 3;
				
			} else {
				
				result[i + count1] = begin[i];
				
				}
				
			}
			System.out.println("---------------------------------------------------------");
			System.out.println("НАЧАЛЬНАЯ СТРОКА С 'word' : ");
			System.out.println("---------------------------------------------------------");
			
			Print (begin);
			
			System.out.println("---------------------------------------------------------");
			
			System.out.println("---------------------------------------------------------");
			System.out.println("КОНЕЧНАЯ СТРОКА С 'letter' : ");
			System.out.println("---------------------------------------------------------");
			
			Print (result);
			
			System.out.println("---------------------------------------------------------");
			
		}
		
		return result;
		
	}
	
	
	// Вывод массива на печать
	public void Print (char array[]) {
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.print(array[i]);
		}
		System.out.println("");
		
	}
	
}
