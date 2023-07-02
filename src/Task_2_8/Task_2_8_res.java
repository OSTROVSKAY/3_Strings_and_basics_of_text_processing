	
package Task_2_8;
	
public class Task_2_8_res {
	
	// Вывод на печать строки
	public static void Print_line(String line) {
		
		for (int i = 0; i < line.length(); i++) {
			
			System.out.print(line.charAt(i));
			
			}
	}
	
	
	// Вычисление количества пробелов с начала строки
	public static int begin_space (String line) {
		
		int begin = 0;
		
		int check = 0;
		
		
		for (int i = 0; i < line.length(); i++) {
			
			if ( line.charAt(i) == ' ' & check == 0 ) {
			
			begin ++;
			
			}
			
			else { check = 1; break; }
		
		}
		
		return begin;
	}
	
	
	// Вычисление количества пробелов с конца строки
	public static int end_space (String line) {
		
		int end = 0;
		
		int check = 0;
		
		for ( int i = line.length() - 1; i >= 0; i-- ) {
			
			if( line.charAt(i) == ' ' & check == 0) {
				
				end ++;
				
				}
				
				else { check = 1; break; }
			}
			
		return end;
	}
	
	
	// Вычисление длины слова с конца строки после пробелов
	public static int word_end_space(String line, int end) {
		
		int size_end = 0;
		
		int check = 0;
		
		
		for ( int i = line.length() - 1 - end; i >= 0; i--) {
				
				if ( line.charAt(i) != ' ' & check == 0)
					{
					size_end ++;
					}
					
			else { check = 1; break; }
			
		}
		
		return size_end;
	}
	
	
	// ОПРЕДЕЛЕНИЕ САМОГО ДЛИННОГО СЛОВА
	public static int long_word(String line) {
		
		int size = 0;
		
		int begin = begin_space (line);
		
		int end = end_space (line);
		
		int temp = 0;
		
		
		for ( int i = begin; i < line.length() - end; i++ ) {
			
			if ( line.charAt(i) != ' ' )
				{
				temp ++;
				}
				
			else {
				
				if( temp > 0) {
					
					if( temp > size )
						{
						size = temp;
						}
						
					//System.out.println(temp);
					
					}
					
				temp = 0;
				
			}
			
		}
		
		
		int size_end =  word_end_space(line, end);
		
		if ( size_end > size)
			{
			size = size_end;
			}
			
		return size;
	}
	
	
	// ВЫВОД НА ПЕЧАТЬ САМЫХ ДЛИННЫХ СЛОВ
	public static void Print_word(String line) {
		
		System.out.println("------------------------------------");
		System.out.println("ВЫВОД НА ПЕЧАТЬ САМЫХ ДЛИННЫХ СЛОВ :");
		System.out.println("------------------------------------");
		
		int begin = begin_space (line);
		
		int end = end_space (line);
		
		int long_size = long_word(line);
		
		int count = 0;
		
		int temp = 0;
		
		for ( int i = begin; i < line.length() - end; i++ ) {
			
			if ( line.charAt(i) != ' ' )
				{
				temp ++;
				}
				
			else {
				
				if( long_size == temp ) {
					
					count++;
					
					System.out.print("Слово № " + count + " : ");
					
					for ( int j = i - temp ; j < i; j++ ) {
						
						System.out.print(line.charAt(j));
						
						if( j == i - 1 ) {
							
							System.out.println(" ");
							System.out.println("------------------------------------");
							
						}
						
					}
					
				}
				
				temp = 0;
			}
			
		}
		
		
		// Печать слова с конца
		int size_end = word_end_space(line, end);
		
		if(size_end > 0 & size_end == long_size ) {
			
			System.out.print("Слово № " + (count + 1) + " : ");
			
			for( int y = line.length() - end - long_size; y < line.length() - end; y++ ) {
				
				System.out.print(line.charAt(y));
				
				if( y == line.length() - end - 1 ) {
					
					System.out.println("");
					System.out.println("------------------------------------");
				}
				
			}
			
		}
		
	}
	
}
