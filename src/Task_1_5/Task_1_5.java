	
/*
	5. Удалить в строке все лишние пробелы,
	то есть серии подряд идущих пробелов заменить на одиночные пробелы.
	Крайние пробелы в строке удалить.
*/
	
package Task_1_5;
	
import java.util.Scanner;
	
public class Task_1_5 {
	
	public static void main(String[] args) {
	
	System.out.println("--------------------------------------------------");
	System.out.println("ПРОГРАММА : УДАЛЕНИЕ В СТРОКЕ ВСЕХ ЛИШНИХ ПРОБЕЛОВ");
	System.out.println("--------------------------------------------------");
	
	Scanner scanner = new Scanner(System.in);
	
	// Ввод начальной строки для удаления всех лишних пробелов
	System.out.println("------------------------------------------------------------");
	System.out.println("Введите начальную строку для удаления всех лишних пробелов :");
	System.out.println("------------------------------------------------------------");
	System.out.print("Введите данные......... :  ");
	
	String line = scanner.nextLine();
	
	Task_1_5_res Inp = new Task_1_5_res();
	
	// УДАЛЕНИЕ В СТРОКЕ ВСЕХ ЛИШНИХ ПРОБЕЛОВ
	String new_line = Inp.removeExtraSpaces(line);
	
	if (new_line.length() > 0)
		
		{
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("Строка после удаления всех лишних пробелов : " + new_line);
		System.out.println("-----------------------------------------------------------------------");
		}
		
	else {
		
		System.out.println("-------------------------------------------");
		System.out.println("Начальная строка состоит только из пробелов");
		System.out.println("-------------------------------------------");
		}
		
		scanner.close();
		
	}
	
}
