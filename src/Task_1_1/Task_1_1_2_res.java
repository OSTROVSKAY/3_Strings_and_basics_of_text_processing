	
package Task_1_1;
	
public class Task_1_1_2_res {
	
	//ПРЕОБРАЗОВАНИЕ МАССИВА НАЗВАНИЙ ПЕРЕМЕННЫХ ИЗ camelCase И CamelCase В snake_case
	public char[][] array_convers(char begin[][]) {
		
		int size1 = 0;
		
		int count = 0;
		
		int count1 = 0;
		
		int max_size = 0;
		
		for ( int i = 0; i < begin.length; i++ ) {
		
			for ( int j = 0; j < begin[i].length; j++ ) {
				
				if ( ! Character.isLowerCase(begin[i][j]) & j != 0 )
				{
				count++;
				}
			
			}
			
			size1 = begin[i].length + count;
			
			if ( max_size < size1 ) {
			
			max_size = size1;
			}
			
			count = 0;
		}
		
		count = 0;
		
		size1 = 0;
		
		
		// Итоговой массив названий переменных в snake_case
		char[][] result = new char[begin.length][max_size];
		
		for ( int i = 0; i < begin.length; i++ ) {
		
			int size = begin[i].length;
			
			char[] temp = new char[size];
			
			for ( int j = 0; j < begin[i].length; j++ )
				{
				temp[j] = begin[i][j];
				}
				
			for ( int j = 0; j < temp.length; j++ ) {
			
			if ( ! Character.isLowerCase(temp[j]) & j != 0 )
				{
				count++;
				}
		}
		
		
		size1 = temp.length + count;
		
		char[] temp1 = new char[size1];
		
		for ( int j = 0; j < temp.length; j++ ) {
			
			if ( Character.isLowerCase(temp[j]) ) {
				
				temp1[j + count1] = temp[j];
				
			} else {
				
				if ( j > 0 ) {
					
					count1++;
					
					temp1[j + count1 - 1] = '_';
					
					temp1[j + count1] = Character.toLowerCase(temp[j]);
					
				}
				
				if ( j == 0 ) {
					
					temp1[j + count1] = Character.toLowerCase(temp[j]);
					
				}
			}
		}
		
		for ( int j = 0; j < temp1.length; j++ ) {
			
			result[i][j] = temp1[j];
			
		}
		
		count = 0;
		count1 = 0;
		
	}
	
	return result;
}
	
	
	// ПЕЧАТЬ ИТОГОВОГО МАССИВА
	public void Print( char begin[][], char result[][]) {
		
		System.out.println("          МАССИВ НАЗВАНИЯ ПЕРЕМЕННЫХ :");
		System.out.println("---------------------------------------------------");
		System.out.println("camelCase И CamelCase :  " + "   " + "snake_case : ");
		System.out.println("---------------------------------------------------");
		
		int max_size1 = 0;
		
		for ( int i = 0; i < begin.length; i++ ) {
			
			if ( max_size1 < begin[i].length ) {
				
				max_size1 = begin[i].length;
			}
		}
		
		
		for ( int i = 0; i < result.length; i++ ) {
			
			for ( int j = 0; j < begin[i].length; j++ ) {
				
				System.out.print(begin[i][j]);
			}
			
			
		for ( int j = 0; j < ( max_size1 - begin[i].length + 3); j++) {
			
			System.out.print(" ");
			}
			
			
			System.out.print(":     ");
			
			
		for ( int j = 0; j < result[i].length; j++ ) {
				
				if ( result[i][j] != 0 ) {
				
				System.out.print(result[i][j]);
				}
				
			}
			
			System.out.println("");
			System.out.println("---------------------------------------------------");
			
		}
		
	}
	
}
