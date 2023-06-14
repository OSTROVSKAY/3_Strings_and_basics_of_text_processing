	
// 2. В строке вставить после каждого символа 'a' символ 'b'
	
package Task_2_2;
	
import java.util.Scanner;
	
public class Task_2_2 {
	
	public static void main(String[] args) {
	
	System.out.println("------------------------------------------------------------------");
	System.out.println("ПРОГРАММА : ВСТАВКА В СТРОКЕ ПОСЛЕ КАЖДОГО СИМВОЛА 'A' СИМВОЛА 'B'");
	System.out.println("------------------------------------------------------------------");
	
	Scanner scanner = new Scanner(System.in);
	
	// Ввод начальной строки
	System.out.println("--------------------------");
	System.out.println("Введите начальную строку :");
	System.out.println("--------------------------");
	System.out.print("Введите данные......... :  ");
	
	String line = scanner.nextLine();
	
	Task_2_2_res Input = new Task_2_2_res();
	
	// Вывод на печать строки
	System.out.println("------------------------------------------------------------------------------------------------");
	System.out.print("ВЫВОД НА ПЕЧАТЬ НАЧАЛЬНОЙ СТРОКИ : ");
	Input.Print_line(line);
	System.out.println("");
	System.out.println("------------------------------------------------------------------------------------------------");
	
	// ВСТАВКА В СТРОКЕ ПОСЛЕ КАЖДОГО СИМВОЛА 'A' СИМВОЛА 'B'
	
	StringBuilder strBuilder = Input.insert_line (line);
	
	String line_new = strBuilder.toString();
	
	System.out.println("------------------------------------------------------------------------------------------------");
	System.out.print("ВЫВОД НА ПЕЧАТЬ ИТОГОВОЙ СТРОКИ : " + line_new);
	System.out.println("");
	System.out.println("------------------------------------------------------------------------------------------------");
	
	scanner.close();
	
	}
	
}
