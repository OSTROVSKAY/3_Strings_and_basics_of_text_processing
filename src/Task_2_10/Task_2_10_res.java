	
package Task_2_10;
	
public class Task_2_10_res {
	
	// Вывод на печать строки
	public void Print_line(String line) {
		
		for (int i = 0; i < line.length(); i++) {
			
			System.out.print(line.charAt(i));
		}
	}
	
	
	// Разделение строки на простые, вопросительные и восклицательные предложения
	public String[] split(String line) {
		
		StringBuilder stringBuilder = new StringBuilder();
		
		for ( int i = 0; i < line.length(); i++ ) {
			
			stringBuilder.append(line.charAt(i));
			
			if( ( line.charAt(i) == '.' | line.charAt(i) == '!' | line.charAt(i) == '?' ) )
				{
				stringBuilder.append('_');
				}
		}
		
		String new_line = stringBuilder.toString();
		
		String[] new_line1 = new_line.split("_");
		
		return new_line1;
	}
	
	
	// Вывод на печать простых предложений
	public void Print_point(String[] new_line1) {
		
		System.out.print("Предложения, оканчивающиеся точкой : ");
		
		int check = 0;
		
		int count = 0;
		
		for ( int i = 0; i < new_line1.length; i++) {
			
			check = 0;
			
			for ( int j = 0; j < new_line1[i].length(); j++) {
				
				if(new_line1[i].charAt(j) == '.')
					{
					check = 1;
					}
			}
			
			count = count + check;
			
			if(check == 1) {
				
				for ( int j = 0; j < new_line1[i].length(); j++) {
					
					System.out.print(new_line1[i].charAt(j));
				}
				
			}
			
			if (count == 0) {System.out.print("Предложений нет"); }
			
		}
		System.out.println("");
		System.out.println("------------------------------------------------------------------------");
		
	}
	
	
	// Вывод на печать восклицательных предложений
	public void Print_exclam(String[] new_line1) {
		
		System.out.print("Предложения, оканчивающиеся восклицательным знаком : ");
		
		int check = 0;
		
		int count = 0;
		
		for ( int i = 0; i < new_line1.length; i++) {
			
			check = 0;
			
			for ( int j = 0; j < new_line1[i].length(); j++) {
				
				if(new_line1[i].charAt(j) == '!')
					{
					check = 1;
					}
			}
				
				count = count + check;
				
			if(check == 1) {
				
				for ( int j = 0; j < new_line1[i].length(); j++) {
						
						System.out.print(new_line1[i].charAt(j));
				}
				
			}
			
		}
		
		if (count == 0) {System.out.print("Предложений нет"); }
		System.out.println("");
		System.out.println("------------------------------------------------------------------------");
		
	}
	
	
	// Вывод на печать вопросительных предложений
	public void Print_interrog(String[] new_line1) {
		
		System.out.print("Предложения, оканчивающиеся вопросительным знаком : ");
		
		int check = 0;
		
		int count = 0;
		
		for ( int i = 0; i < new_line1.length; i++) {
			
			check = 0;
			
			for ( int j = 0; j < new_line1[i].length(); j++) {
				
				if(new_line1[i].charAt(j) == '?')
					{
					check = 1;
					}
			}
			
			count = count + check;
			
			if(check == 1) {
				
				for ( int j = 0; j < new_line1[i].length(); j++) {
				
				System.out.print(new_line1[i].charAt(j));
				}
			}
		}
		
		if (count == 0) {System.out.print("Предложений нет"); }
		System.out.println("");
		System.out.println("------------------------------------------------------------------------");
		
	}
	
	
	// ОПРЕДЕЛЕНИЕ КОЛИЧЕСТВА И ВЫВОД НА ПЕЧАТЬ ПРЕДЛОЖЕНИЙ В СТРОКЕ
	/*
	1 - Предложения оканчивающиеся точкой
	2 - Предложения оканчивающиеся восклицательным знаком
	3 - Предложения оканчивающиеся вопросительным знаком
	*/
	
	public int count_sentence(String line) {
		
		// Разделение строки на простые, вопросительные и восклицательные предложения
		String[] new_line1 = split(line);
		
		// Печать простых предложений
		Print_point(new_line1);
		
		int count = 0;
		
		// Определение количества предложений оканчивающихся точкой
		int count1 = 0;
		
		for ( int i = 0; i < line.length(); i++ ) {
			
			if( line.charAt(i) == '.' ) {
				
				count1 ++;
				
			}
		}
		
		
		System.out.println("Количество предложений оканчивающихся точкой : " + count1);
		System.out.println("------------------------------------------------------------------------");
		System.out.println("------------------------------------------------------------------------");
		
		// Печать восклицательных предложений
		Print_exclam(new_line1);
		
		// Определение количества предложений оканчивающихся восклицательным знаком
		int count2 = 0;
		
		for ( int i = 0; i < line.length(); i++ ) {
			
			if( line.charAt(i) == '!' ) {
				
				count2 ++;
				
			}
		}
		
		System.out.println("Количество предложений оканчивающихся восклицательным знаком : " + count2);
		System.out.println("------------------------------------------------------------------------");
		System.out.println("------------------------------------------------------------------------");
		
		Print_interrog(new_line1);
		
		// Определение количества предложений оканчивающихся вопросительным знаком
		int count3 = 0;
		
		for ( int i = 0; i < line.length(); i++ ) {
			
			if( line.charAt(i) == '?' ) {
				
				count3 ++;
				
			}
		}
		
		System.out.println("Количество предложений оканчивающихся вопросительным знаком : " + count3);
		System.out.println("------------------------------------------------------------------------");
		System.out.println("------------------------------------------------------------------------");
		
		count = count1 + count2 + count3;
		
		return count;
	}
	
}
