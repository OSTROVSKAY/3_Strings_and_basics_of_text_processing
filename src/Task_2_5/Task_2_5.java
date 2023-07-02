	
// 5. Подсчитать, сколько раз среди символов заданной строки встречается буква 'а'
	
package Task_2_5;
	
import java.util.Scanner;
	
public class Task_2_5 {
	
	public static void main(String[] args) {
	
	System.out.println("-----------------------------------------------------------");
	System.out.println("ПРОГРАММА : ВЫЧИСЛЕНИЕ ЧИСЛА СИМВОЛОВ 'a' В ЗАДАННОЙ СТРОКЕ");
	System.out.println("-----------------------------------------------------------");
	
	Scanner scanner = new Scanner(System.in);
	
	// Ввод строку
	System.out.println("----------------");
	System.out.println("Введите строку :");
	System.out.println("-------------------------");
	System.out.print("Введите данные......... :  ");
	
	String line = scanner.nextLine();
	
	// Вывод на печать строки
	System.out.println("------------------------------------------------------------------------------");
	System.out.println("Вывод на печать строки : " + line);
	System.out.println("------------------------------------------------------------------------------");
	
	// ВЫЧИСЛЕНИЕ ЧИСЛА СИМВОЛОВ 'a' В ЗАДАННОЙ СТРОКЕ
	int count = Task_2_5_res.calculation(line);
	
	System.out.println("------------------------------------------");
	System.out.println("ЧИСЛО СИМВОЛОВ 'a' В ЗАДАННОЙ СТРОКЕ : " + count);
	System.out.println("------------------------------------------");
	
	scanner.close();
	
	}
}
