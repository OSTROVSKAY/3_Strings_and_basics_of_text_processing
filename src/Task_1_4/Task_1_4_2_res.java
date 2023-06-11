	
package Task_1_4;
	
import java.util.Scanner;
	
public class Task_1_4_2_res {
	
	// Ввод размера массива символов
	public int InputInt() {
		
		int x = 0;
		int check = 1;
		
		do {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Введите Данные :.............: " + "  ");
			
			check = 1;
			
			if (scanner.hasNextInt()) {
				
				x = scanner.nextInt();
				
				System.out.println("----------------------------------");
				System.out.println("Введённое число : " + x);
				
			} else {
				
				check = 0;
				System.out.println("------------------------------------------");
				System.out.println("Данные введены не правильно. Введите снова");
				System.out.println("------------------------------------------");
				}
				
				System.out.println("-----------------------------------");
				
		} while ( check == 0 );
		
		return x;
		
	}
	
	
	// Ввод одного символа для массива символов
	public char Inp_char() {
	
	int x = 0;
	
	char char1;
	
	do {
		try {
			
			x = System.in.read();
			
			} catch(java.io.IOException e) {
				
				System.out.println("------------------------------------------");
				System.out.println("Данные введены не правильно. Введите снова");
				System.out.println("------------------------------------------");
				}
			
		char1 = (char)x;
		
		} while (char1 == '\n');
		
		return char1;
	}
	
	
	// Ввод массива символов
	public char[] Inp_mass(int size) {
		
		char mass[] = new char[size];
		
		System.out.print("Введите элемент массива............ : ");
		
		for ( int i = 0; i < mass.length; i++ ) {
			
			char temp = Inp_char();
			
			Character temp1 = temp;
			
			if ( temp1.charValue() == 0) {break;}
			
			else {
				
				mass[i] = temp;
				System.out.println("-----------------------------------------------------------");
				System.out.println("Номер элемента массива : " + i + "   "+ "Значение элемента массива : " + mass[i]);
				}
			
		}
		System.out.println("-----------------------------------------------------------");
		
		return mass;
	}
	
	
	// Проверка : является ли данный символ цифрой
	public static boolean isDigit (char char1) {
		
		boolean isDigit = false;
		
		char [] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		
		for (int i = 0; i < digits.length; i++ ) {
			
			if (digits[i] == char1) {
				
				isDigit = true;
				}
			}
			return isDigit;
		}
	
	
	// Вывод массива на печать
	public void Print_mass(char[] massiv) {
		
		System.out.println("--------------------------------------------------------------------");
		System.out.print("Массив символов : ");
		
		for(int i = 0; i < massiv.length; i++ ) {
			
			System.out.print(massiv[i]);
			}
			
		System.out.println("");
		System.out.println("--------------------------------------------------------------------");
		
		}
	
	
	// Подсчёт количества чисел в строке и вывод чисел на печать :
	public static int countNumbers (char[] massiv) {
		
		int count_end = 0;
		
		int end = 0;
		
		int check = 0;
		
		int stop = 0;
		
		for ( int j = massiv.length - 1; j >= 0; j-- )
			{
			
			if (isDigit(massiv[j] ) ) { stop ++;}
			
			if( isDigit(massiv[j] ) & check == 0 ) {end ++;}
			
			if( j > 0)
				{
				if( isDigit(massiv[j]) & !isDigit(massiv[j-1]) ) { check = 1; }
				}
			
			if( !isDigit(massiv[j]) & stop == 0 ) {count_end ++;}
			}
		
		count_end = count_end + end;
		
		int count = 0;
		
		int count1 = 0;
		
		int counter = 0;
		
		System.out.println("Числа в строке-массиве символов :");
		System.out.println("---------------------------------");
		
		for (int i = 0; i < massiv.length; i++) {
			
			if (isDigit(massiv[i]) & massiv[i] != '\n') {
				
				if(count1 == 0) { System.out.print("Число № " + (counter + 1) + " : " + "  "); }
				
				System.out.print(massiv[i]);
				
				if( i <= massiv.length - 1 - count_end ) {count = 0;}
				
				count1++;
				
				if (i == massiv.length - 1 || !isDigit(massiv[i + 1])) {
					
					count1 = 0;
					
					counter++;
				}
			}
			
			else if (count == 0 & massiv[i] != '\n' & count_end != massiv.length & counter != 1 ){
				
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
	
}
