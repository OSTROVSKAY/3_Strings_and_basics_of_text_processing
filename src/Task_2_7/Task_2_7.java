	
/*
7. Вводится строка.
	Требуется удалить из нее повторяющиеся символы и все пробелы.
	Например, если было введено "abc cde def", то должно быть выведено "abcdef"
*/
	
package Task_2_7;
	
import java.util.Scanner;
	
public class Task_2_7 {
	
	public static void main(String[] args) {
	
	System.out.println("---------------------------------------------------------------------");
	System.out.println("ПРОГРАММА : УДАЛЕНИЕ ИЗ СТРОКИ ПОВТОРЯЮЩИХСЯ СИМВОЛОВ И ВСЕХ ПРОБЕЛОВ");
	System.out.println("---------------------------------------------------------------------");
	
	Scanner scanner = new Scanner(System.in);
	
	// Ввод строки
	System.out.println("-----------------");
	System.out.println("Введение строки :");
	System.out.println("-------------------------");
	System.out.print("Введите данные......... :  ");
	
	String line = scanner.nextLine();
	
	Task_2_7_res Input = new Task_2_7_res();
	
	// Вывод на печать начальной строки
	System.out.println("-------------------------------------------------------------------------------");
	System.out.println("Вывод на печать начальной строки : " + line);
	System.out.println("-------------------------------------------------------------------------------");
	
	// УДАЛЕНИЕ ИЗ СТРОКИ ПОВТОРЯЮЩИХСЯ СИМВОЛОВ И ВСЕХ ПРОБЕЛОВ
	String new_line = Input.delete_from_string(line);
	
	// Вывод на печать итоговой строки
	System.out.println("-------------------------------------------------------------------------------");
	System.out.println("Вывод на печать итоговой строки : " + new_line);
	System.out.println("-------------------------------------------------------------------------------");
	
	scanner.close();
	
	}

}