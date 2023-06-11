	
// 4. В строке найти количество чисел
	
package Task_1_4;
	
import java.util.Scanner;
	
public class Task_1_4 {
	
	public static void main(String[] args) {
		
		System.out.println("--------------------------------------------");
		System.out.println("ПРОГРАММА : РАСЧЁТ КОЛИЧЕСТВА ЧИСЕЛ В СТРОКЕ");
		System.out.println("--------------------------------------------");
		
		Task_1_4_res Inp = new Task_1_4_res();
		
		Scanner scanner = new Scanner(System.in);
		
		// Ввод начальной строки для подсчёта чисел
		System.out.println("----------------------------------------------");
		System.out.println("Введите начальную строку для подсчёта чисел : ");
		System.out.println("----------------------------------------------");
		System.out.print("Введите данные......... :  ");
		
		String line = scanner.nextLine();
		
		System.out.println("---------------------------------------------------");
		System.out.print("Вывод строки на печать :");
		
		Inp.Print_line (line);
		
		// РАСЧЁТ КОЛИЧЕСТВА ЧИСЕЛ В СТРОКЕ И ВЫВОД ЧИСЕЛ НА ПЕЧАТЬ
		
		int counter = Inp.countNumbers(line);
		
		System.out.println("-------------------------------");
		System.out.println("Количество чисел в строке : " + counter);
		System.out.println("-------------------------------");
	}
	
}
