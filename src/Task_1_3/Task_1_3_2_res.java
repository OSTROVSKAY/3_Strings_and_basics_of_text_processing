	
package Task_1_3;
	
import java.util.Scanner;
	
public class Task_1_3_2_res {
	
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
	
	
	// РАСЧЁТ КОЛИЧЕСТВА ЦИФР В СТРОКЕ
	public int num_dig(char[] massiv) {
		
		int count = 0;
		
		System.out.println("--------------------------------------------------------------------");
		System.out.print("Цифры в строке : ");
		
		for( int i = 0; i < massiv.length; i++ ) {
			
			boolean isDigit = isDigit (massiv[i]);
				
				if( isDigit == true )
					{
					count++;
					System.out.print(massiv[i] + "(№ : "+ i + ")" + "  ");
					}
			}
			
			if( count == 0)
				{
				System.out.print("НЕТ");
				}
			
			System.out.println("");
			System.out.println("--------------------------------------------------------------------");
			
			return count;
		}
	
	
	// Вывод массива на печать
	public void Print_mass(char[] massiv) {
		
		System.out.println("--------------------------------------------------------------------");
		System.out.print("Массив : ");
		
		for(int i = 0; i < massiv.length; i++ ) {
			
			System.out.print(massiv[i]);
		}
		
		System.out.println("");
		System.out.println("--------------------------------------------------------------------");
		
	}
}
