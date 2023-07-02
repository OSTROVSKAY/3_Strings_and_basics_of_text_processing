	
package Task_1_3;
	
import java.io.IOException;
	
import java.util.Scanner;
	
public class Task_1_3_2_res {
	
	// Ввод размера массива символов
	public static int InputInt() {
		
		int x = 0;
		int check = 1;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
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
	public static char Inp_char() throws IOException {
	
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
	public static char[] Inp_mass(int size) throws IOException {
		
		char mass[] = new char[size];
		
		System.out.print("Введите элемент массива............ : ");
		
		for ( int i = 0; i < mass.length; i++ ) {
			
			char temp = Inp_char();
			
			Character temp1 = temp;
			
			if ( temp1.charValue() == 0) { break; }
			
			else
				{
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
	public static int num_dig(char[] massiv) {
		
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
	public static void Print_mass(char[] massiv) {
		
		System.out.println("--------------------------------------------------------------------");
		System.out.print("Массив : ");
		
		for(int i = 0; i < massiv.length; i++ )
			{
			System.out.print(massiv[i]);
			}
			
		System.out.println("");
		System.out.println("--------------------------------------------------------------------");
		
	}
	
	
	// Ввод целого числа для повтора работы программы
	public static int InputInt1() {
		
		int check = 1;
		int x = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			String xx = scanner.nextLine();
			
			check = 1;
			
			try {
				x = Integer.parseInt(xx);
				}
				
				catch (NumberFormatException e)
					{
					check = 0;
					
					System.out.println("------------------------------------------");
					System.out.println("Данные введены не правильно. Введите снова");
					System.out.println("------------------------------------------");
					}
					
		} while ( check == 0 );
		
		return x;
	}
	
	
	// Повтор работы программы
	public static int repeat() {
		
		int check = 0;
		
		do {
			System.out.print("Введите : 1 - Да или 0 - Нет :  ");
			
			check = InputInt1();
			
			if ( check < 0 | check > 1 )
				{
				System.out.println("------------------------------------------------");
				System.out.println("Введеные данные не равны 0 или 1. Введите снова.");
				System.out.println("------------------------------------------------");
				}
				
		} while ( check < 0 | check > 1 );
		
		try {
			Thread.sleep(500);
			}
			catch(InterruptedException ex)
				{
				System.out.println("-------------------------");
				System.out.println("Ошибка в работе программы");
				System.out.println("-------------------------");
				}
				
		return check;
		
	}
}
