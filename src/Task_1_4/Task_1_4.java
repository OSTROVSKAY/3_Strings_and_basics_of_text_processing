	
// 4. В строке найти количество чисел
	
package Task_1_4;
	
import java.util.Scanner;
	
public class Task_1_4 {
	
	public static void main(String[] args) {
		
		System.out.println("--------------------------------------------");
		System.out.println("ПРОГРАММА : РАСЧЁТ КОЛИЧЕСТВА ЧИСЕЛ В СТРОКЕ");
		System.out.println("--------------------------------------------");
		
		Scanner scanner = new Scanner(System.in);
		
		// Ввод начальной строки для подсчёта чисел
		System.out.println("----------------------------------------------");
		System.out.println("Введите начальную строку для подсчёта чисел : ");
		System.out.println("----------------------------------------------");
		System.out.print("Введите данные......... :   ");
		
		String line = scanner.nextLine();
		
		// String line = "1223 7676 nnn 887878 24344343 9999";
		
		Task_1_4_res Inp = new Task_1_4_res();
		
		System.out.println("-----------------------------------------");
		System.out.println("Количество чисел в строке : " + Inp.countNumbers(line));
		System.out.println("-----------------------------------------");
	}
	
}
