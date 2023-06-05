	
// 1. Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
	
package Task_1_1;
	
public class Task_1_1 {
	
	public static void main(String[] args) {
	
	System.out.println("-------------------------------------------------------------------------------");
	System.out.println("ПРОГРАММА : ПРЕОБРАЗОВАНИЕ МАССИВА НАЗВАНИЙ ПЕРЕМЕННЫХ ИЗ CAMELCASE В SNAKECASE");
	System.out.println("-------------------------------------------------------------------------------");
	
	// Массив переменных в camelCase
	String [] camelCase = {"getChars", "equalsIgnoreCase", "toLowerCase",
			 				"toUpperCase", "toCharArray", "charAt"};
	
	System.out.println("--------------------------------------------------------------------------------------------------------");
	
	System.out.println("Массив переменных в camelCase : " + String.join(" , ", camelCase));
	System.out.println("--------------------------------------------------------------------------------------------------------");
	
	Task_1_1_res Input = new Task_1_1_res();
	
	
	// Массив для переменных в snake_case
	String [] snakeCase = Input.toSnakeCase(camelCase);
	
	System.out.println("--------------------------------------------------------------------------------------------------------");
	
	System.out.println("Массив переменных в snake_case : " + String.join(" , ", snakeCase));
	System.out.println("--------------------------------------------------------------------------------------------------------");
	
	}
	
}
