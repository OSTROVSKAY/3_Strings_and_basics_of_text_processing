	
package Task_1_4;
	
public class Task_1_4_res {
	
	// Проверка : является ли данный символ цифрой
	private static boolean isDigit (char ch) {
		
		boolean isDigit = false;
		
		char [] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		
		for (char element : digits) {
			
			if (ch == element) {
				
				isDigit = true;
				}
			}
		return isDigit;
		}
	
	
	// Подсчёт количества чисел в строке и вывод чисел на печать :
	public static int countNumbers (String line) {
		
		int count_end = 0;
		
		int end = 0;
		
		int check = 0;
		
		int stop = 0;
		
		for ( int j = line.length() - 1; j >= 0; j-- )
			{
			
			if (isDigit(line.charAt(j) ) ) {stop ++;}
			
			if( isDigit(line.charAt(j) ) & check == 0 ) {end ++;}
			
			if( j > 0)
				{
				if( isDigit(line.charAt(j)) & !isDigit(line.charAt(j-1)) ) { check = 1; }
				}
			
			if( !isDigit(line.charAt(j) ) & stop == 0 ) {count_end ++;}
			}
		
		count_end = count_end + end;
		
		int count = 0;
		
		int count1 = 0;
		
		int counter = 0;
		
		System.out.println("Числа в строке символов :");
		System.out.println("-------------------------");
		
		for (int i = 0; i < line.length(); i++) {
			
			if (isDigit(line.charAt(i))) {
				
				if(count1 == 0) { System.out.print("Число № " + (counter + 1) + " : " + "  "); }
				
				System.out.print(line.charAt(i));
				
				if( i <= line.length() - 1 - count_end ) {count = 0;}
				
				count1++;
				
				if (i == line.length() - 1 || !isDigit(line.charAt(i + 1))) {
					
					count1 = 0;
					
					counter++;
				}
			}
			
			
			else if (count == 0 & count_end != line.length() ) {
				
				if ( counter > 0 ) {
				
				System.out.println("");
				System.out.println("------------------------");
				
				count++;
				
				}
			}
		}
		
		if ( counter == 0) {System.out.print("ЧИСЕЛ НЕТ");}
		
		System.out.println("");
		
		return counter;
	}
	
	
	// Вывод строки на печать
	public void Print_line (String line) {
		
		for (int i = 0; i < line.length(); i++) {
			
			System.out.print(line.charAt(i));
		}
		
		System.out.println("");
		System.out.println("---------------------------------------------------");
		
	}
	
}
