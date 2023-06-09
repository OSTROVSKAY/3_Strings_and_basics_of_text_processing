	
// 3. В строке найти количество цифр
	
package Task_1_3;
	
import java.util.Scanner;
	
public class Task_1_3 {
	
	public static void main(String[] args) {
		
		System.out.println("-------------------------------------------");
		System.out.println("ПРОГРАММА : РАСЧЁТ КОЛИЧЕСТВА ЦИФР В СТРОКЕ");
		System.out.println("-------------------------------------------");
		
		Scanner scanner = new Scanner(System.in);
		
		// Ввод начальной строки для подсчёта цифр
		System.out.println("--------------------------------------------");
		System.out.println("Введите начальную строку для подсчёта цифр :");
		System.out.println("--------------------------------------------");
		System.out.print("Введите данные......... :   ");
		String line = scanner.nextLine();
		
		Task_1_3_res Input = new Task_1_3_res();
		
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("Начальная строка для подсчёта цифр : " + line);
		System.out.println("-------------------------------------------------------------------------");
		
		// Расчёт количества цифр в строке
		int count = Input.countDigits(line);
		
		System.out.println("--------------------------------------");
		System.out.println("Расчёт количества цифр в строке : " + count);
		System.out.println("--------------------------------------");
		
		scanner.close();
	}
	
}
