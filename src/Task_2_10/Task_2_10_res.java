	
package Task_2_10;
	
public class Task_2_10_res {
	
	// Вывод на печать строки
	public void Print_line(String line) {
		
		for (int i = 0; i < line.length(); i++) {
		
			System.out.print(line.charAt(i));
		}
	}
	
	
	// ОПРЕДЕЛЕНИЕ КОЛИЧЕСТВА ПРЕДЛОЖЕНИЙ В СТРОКЕ
	public int count_sentence(String line) {
		
		//System.out.print( line.charAt(line.length()));
		
		int count = 0;
		
		// Определение количества предложений оканчивающихся точкой
		int count1 = 0;
		
		for ( int i = 0; i < line.length(); i++ ) {
			
			if( line.charAt(i) == '.' ) {
				
				count1 ++;
				
			}
		}
		
		
		// Вывод на печать предложений оканчивающихся точкой
		int check1 = 0;
		
		int count10 = 0;
		
		for ( int i = 0; i < line.length(); i++ ) {
			
			//check = 0;
			
			
			if ( line.charAt(i) != '.' ) {
				
				count10 ++;
				
				check1 = 0;
			}
			
			else {
				
				//System.out.println( count10);
				
				
				for (int j = i - count10; j < line.length(); j++ ) {
					
					
					
					if ( check1 == 0 ) {
						
						//System.out.print( j);
					
						System.out.print( line.charAt(j));
					
					}
					
					else if ( line.charAt(j+1) == '.' | line.charAt(j+1) == '!' | line.charAt(j+1) == '?' | line.charAt(j+1) == ' ') {
						
						check1 = 1;
					}
				}
				
				count10 = 0;
				//check = 1;
			}
			
		}
		
		
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("Количество предложений оканчивающихся точкой : " + count1);
		System.out.println("-------------------------------------------------------------------------------");
		
		
		// Определение количества предложений оканчивающихся восклицательным знаком
		int count2 = 0;
		
		for ( int i = 0; i < line.length(); i++ ) {
			
			if( line.charAt(i) == '!' ) {
				
				count2 ++;
				
			}
		}
		
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("Количество предложений оканчивающихся восклицательным знаком : " + count2);
		System.out.println("-------------------------------------------------------------------------------");
		
		
		// Определение количества предложений оканчивающихся вопросительным знаком
		int count3 = 0;
		
		for ( int i = 0; i < line.length(); i++ ) {
			
			if( line.charAt(i) == '?' ) {
				
				count3 ++;
				
			}
		}
		
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("Количество предложений оканчивающихся вопросительным знаком : " + count3);
		System.out.println("-------------------------------------------------------------------------------");
		
		count = count1 + count2 + count3;
		
		return count;
	}

}
