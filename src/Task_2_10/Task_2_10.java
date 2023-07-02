
/*
	10. Строка X состоит из нескольких предложений,
	   каждое из которых кончается точкой,
	   восклицательным или вопросительным знаком.
	   Определить количество предложений в строке X
*/

package Task_2_10;
	
import java.util.Scanner;
	
public class Task_2_10 {
	
	public static void main(String[] args) {
	
	System.out.println("-------------------------------------------------------");
	System.out.println("ПРОГРАММА : ОПРЕДЕЛЕНИЕ КОЛИЧЕСТВА ПРЕДЛОЖЕНИЙ В СТРОКЕ");
	System.out.println("-------------------------------------------------------");
	
	Scanner scanner = new Scanner(System.in);
	
	// Ввод строки
	System.out.println("-----------------");
	System.out.println("Введение строки :");
	System.out.println("-------------------------");
	System.out.print("Введите данные......... :  ");
	
	String X = scanner.nextLine();
	
	// Вывод на печать начальной строки
	System.out.println("-------------------------------------------------------------------------------");
	System.out.println("Вывод на печать начальной строки : " + X);
	System.out.println("-------------------------------------------------------------------------------");
	System.out.println("-------------------------------------------------------------------------------");
	
	
	// ОПРЕДЕЛЕНИЕ КОЛИЧЕСТВА ПРЕДЛОЖЕНИЙ В СТРОКЕ. ВЫВОД НА ПЕЧАТЬ ПРЕДЛОЖЕНИЙ В СТРОКЕ.
	int count = Task_2_10_res.count_sentence(X);
	
	// Расчёт общего количества предложений в строке
	System.out.println("ОБЩЕЕ КОЛИЧЕСТВО ПРЕДЛОЖЕНИЙ В СТРОКЕ : " + count);
	System.out.println("---------------------------------------------");
	
	scanner.close();
	
	}
	
}
