
/*
	2. Дана строка, содержащая следующий текст (xml-документ) :
	Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа
	и его тип (открывающий тег, закрывающий тег, содержимое тега, тег без тела).
	Пользоваться готовыми парсерами XML для решения данной задачи нельзя.
*/
/*
	Работа с регулярными выражениями : (Pattern, Matcher)
*/

package Task_3_2;
	
import java.util.regex.Matcher;
	
import java.util.regex.Pattern;
	
public class Task_3_2 {
	
	public static void main(String[] args) {
	
	System.out.println("-------------------------------------------");
	System.out.println("ПРОГРАММА : АНАЛИЗАТОР ТЕКСТА XML-ДОКУМЕНТА");
	System.out.println("-------------------------------------------");
	
	Task_3_2_res Input = new Task_3_2_res();
	
	String xml = "<notes>\n" +
			
			" <note id = \"1\">\n" +
			
			" <to>Вася</to>\n" +
			
			" <from>Света</from>\n" +
			
			" <heading>Напоминание</heading>\n" +
			
			" <body>Позвони мне завтра!</body>\n" +
			
			" </note>\n" +
			
			" <note id = \"2\">\n" +
			
			" <to>Петя</to>\n" +
			
			" <from>Маша</from>\n" +
			
			" <heading>Важное напоминание</heading>\n" +
			
			" <body>Позвони мне сегодня!</body>\n" +
			
			" </note>\n" +
			
			"</notes>";
			
	System.out.println("-------------------------------------------");
	System.out.println("ВЫВОД НА ПЕЧАТЬ XML-ДОКУМЕНТА :");
	System.out.println("-------------------------------------------");
	System.out.println(xml);
	
	System.out.println("-------------------------------------------");
	System.out.println("АНАЛИЗ XML-ДОКУМЕНТА :");
	System.out.println("-------------------------------------------");
	Input.analyzer_xml(xml);
	System.out.println("-------------------------------------------");
	
	}
	
}
