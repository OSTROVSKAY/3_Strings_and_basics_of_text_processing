	
package Task_1_3;
	
import java.util.Scanner;
	
public class Task_1_3_res {
	
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
	
	
	// РАСЧЁТ КОЛИЧЕСТВА ЦИФР В СТРОКЕ
	public static int countDigits(String line) {
		
		int count = 0;
		
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		System.out.print("Цифры в строке : ");
		
		for (int i = 0; i < line.length(); i++) {
			
			if( Character.isDigit(line.charAt(i)) ) {
				
				System.out.print(line.charAt(i) + "(№ : "+ i + ")" + "  ");
				
				count++;
			}
			
		}
		
		System.out.println("");
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		
		return count;
	}
	
	
	// Ввод целого числа для повтора работы программы
	public static int InputInt() {
		
		int check = 1;
		int x = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("------------------------------");
			System.out.print("Введите Данные :.............: " + "  ");
			String xx = scanner.nextLine();
			
			check = 1;
			
			try {
				x = Integer.parseInt(xx);
				}
				catch (NumberFormatException e) {
					check = 0;
					
					System.out.println("------------------------------------------");
					System.out.println("Данные введены не правильно. Введите снова");
					System.out.println("------------------------------------------");
					}
					
			System.out.println("------------------------------");
			
		} while ( check == 0 );
		
		return x;
	}
	
	
	// Повтор работы программы
	public static int repeat() {
		
		int check = 0;
		
		do {
			System.out.println("Введите : 1 - Да или 0 - Нет");
			System.out.println("----------------------------");
			
			check = InputInt();
			
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
