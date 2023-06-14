	
// 3. Проверить, является ли заданное слово палиндромом.
	
package Task_2_3;
	
import java.util.Scanner;
	
public class Task_2_3 {
	
	public static void main(String[] args) {
	
	System.out.println("-------------------------------------------------------------");
	System.out.println("ПРОГРАММА : ПРОВЕРКА - ЯВЛЯЕТСЯ ЛИ ЗАДАННОЕ СЛОВО ПАЛИНДРОМОМ");
	System.out.println("-------------------------------------------------------------");
	
	Scanner scanner = new Scanner(System.in);
	
	// Ввод слова
	System.out.println("---------------");
	System.out.println("Введите слово :");
	System.out.println("-------------------------");
	System.out.print("Введите данные......... :  ");
	
	String line = scanner.nextLine();
	
	Task_2_3_res Input = new Task_2_3_res();
	
	// Вывод на слова
	System.out.println("------------------------------------------------------------------------------------------------");
	System.out.print("ВЫВОД НА ПЕЧАТЬ НАЧАЛЬНОГО СЛОВА : ");
	Input.Print_line(line);
	System.out.println("");
	System.out.println("------------------------------------------------------------------------------------------------");
	
	// ПРОВЕРКА - ЯВЛЯЕТСЯ ЛИ ЗАДАННОЕ СЛОВО ПАЛИНДРОМОМ
	boolean check = Input.word_check(line);
	
	if (check == true) 
		{
		System.out.println("-----------------------------------");
		System.out.println("ЗАДАННОЕ СЛОВО ЯВЛЯЕТСЯ ПАЛИНДРОМОМ");
		System.out.println("-----------------------------------");
		}
	
	else
		{
		System.out.println("--------------------------------------");
		System.out.println("ЗАДАННОЕ СЛОВО НЕ ЯВЛЯЕТСЯ ПАЛИНДРОМОМ");
		System.out.println("--------------------------------------");
		}
		
	}
	
}
