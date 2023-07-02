	
package Task_1_5;
	
import java.util.Scanner;
	
public class Task_1_5_2_res {
	
	// Ввод размера массива символов
	public static int InputInt() {
		
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
				
			} else
					{
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
	public static char Inp_char() {
		
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
	public static char[] Inp_mass(int size) {
		
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
	
	
	// Вывод массива на печать
	public static void Print_mass(char[] massiv) {
		
		System.out.println("--------------------------------------------------------------------");
		System.out.print("Массив символов : ");
		
		for(int i = 0; i < massiv.length; i++ )
			{
			System.out.print(massiv[i]);
			}
			
		System.out.println("");
		System.out.println("--------------------------------------------------------------------");
		
	}
	
	
	// Расчёт длины нового массива символов
	public static int Array_length (char massiv[]) {
		
		int length = 0;
		
		// Расчёт пробелов сначала строки
		int begin = 0;
		
		int check1 = 0;
		
		
		for (int i = 0; i < massiv.length; i++) {
			
			if ( massiv[i] == ' ' & check1 == 0 )
				{
				begin ++;
				}
				
			else { check1 = 1; }
		}
		
		//System.out.println(begin);
		
		
		// Расчёт пробелов с конца строки
		int end = 0;
		
		int check2 = 0;
		
		for ( int j = massiv.length-1; j >= 0; j-- ) {
			
			if( massiv[j] == ' ' & check2 == 0)
				
				{
				end ++;
				}
				
			else { check2 = 1; }
		}
		
		//System.out.println(end);
		
		// Расчёт длины символов с начала строки после пробелов
		int begin1 = 0;
		
		int check4 = 0;
		
		for ( int b = begin; b <= massiv.length - 1 - end; b++ ) {
			
			if( massiv[b] != ' ' & check4 == 0 )
				{
				begin1 ++;
				}
				
			else { check4 = 1; }
			
			}
			
		// System.out.println(begin1);
		
		// Расчёт пробелов в середине строки
		int middle = 0;
		
		int temp = 0;
		
		for ( int a = (begin + begin1); a <= massiv.length - 1 - end; a++ ) {
			
			if ( massiv[a] == ' ' )
				{
				temp++;
				}
				
				else
				{
				//System.out.println(temp-1);
				
				middle = middle + (temp-1);
				
				temp = 0;
				}
			
		}
		
		
		length = massiv.length - begin - end - middle;
		
		//System.out.println(length);
		
		return length;
	}
	
	
	// УДАЛЕНИЕ В СТРОКЕ ВСЕХ ЛИШНИХ ПРОБЕЛОВ
	public static char[] removing_spaces( char massiv[], int size) {
		
		char[] massiv_end = new char[size];
		
		// Расчёт пробелов сначала строки
		int begin = 0;
		
		int check1 = 0;
		
		for (int i = 0; i < massiv.length; i++) {
			
			if ( massiv[i] == ' ' &  check1 == 0 )
				{
				begin ++;
				}
				
			else { check1 = 1; break; }
			
		}
		
		//System.out.println(begin);
		
		
		// Расчёт пробелов с конца строки
		int end = 0;
		
		int check2 = 0;
		
		for ( int j = massiv.length-1; j >= 0; j-- ) {
			
			if( massiv[j] == ' ' & check2 == 0)
				
				{
				end ++;
				}
				
			else { check2 = 1; }
		}
		
		//System.out.println(end);
		
		
		// Расчёт длины символов с начала строки после пробелов
		int begin1 = 0;
		
		int check4 = 0;
		
		for ( int b = begin; b <= massiv.length - 1 - end; b++ ) {
			
			if( massiv[b] != ' ' & check4 == 0 )
				{
				begin1 ++;
				}
				
			else { check4 = 1; }
			
		}
		
		//System.out.println(begin1);
		
		// Формирование нового массива
		
		int temp1 = 0;
		
		int temp = 0;
		
		int check5 = 0;
		
		int check6 = 0;
		
		int check7 = 0;
		
		//int count = 0;
		
		for ( int a = begin; a < massiv.length - end; a++ ) {
			
			if ( massiv[a] == ' ' & a >= (begin + begin1))
				{
				temp++;
				check7 = 0;
				}
				
			else if (a >= (begin + begin1) & check7 == 0)
				{
				//System.out.println(temp-1);
				
				temp1 = temp1 + (temp - 1);
				temp = 0;
				check7 = 1;
				}
			//System.out.println(temp1);
			
			
			if( massiv[a] != ' ' ) {
				
				//System.out.print(massiv[a] );
				
				//System.out.print("(" + (a -begin - temp1) + ") " );
				
				massiv_end[a - begin - temp1] = massiv[a];
				
				check5 = 1;
				
				check6 = 0;
			}
			
			else if( check5 == 1 & check6 == 0 & a < massiv.length - end) {
				
				//System.out.println(count);
				
				//System.out.print(massiv[a]);
				
				//System.out.print("(" + (a - begin - temp1 ) + ") " );
				
				massiv_end[a -temp1-begin] = massiv[a];
				
				check5 = 0;
				
				check6 = 1;
			}
			
		}
		
		return massiv_end;
		
	}
	
}
