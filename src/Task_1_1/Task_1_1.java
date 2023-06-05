	
// 1. Дан массив названий переменных в camelCase. Преобразовать названия в snake_case
	
package Task_1_1;
	
public class Task_1_1 {
	
	public static void main(String[] args) {
	
	System.out.println("--------------------------------------------------------------------------------------------");
	System.out.println("ПРОГРАММА : ПРЕОБРАЗОВАНИЕ МАССИВА НАЗВАНИЙ ПЕРЕМЕННЫХ ИЗ camelCase И CamelCase В snake_case");
	System.out.println("--------------------------------------------------------------------------------------------");
	
	// Массив переменных в camelCase И CamelCase
	String [] camelCase = { "HumpBackNotation", "getChars", "BackColor", "charAt", "CamelCase", "equalsIgnoreCase", "CamelHumpedWord", "toLowerCase",
			"MixedCase", "toUpperCase", "WordsStrungTogether", "mixedCase", "WordsRunTogether", "toCharArray", "WordCase", "backColor"};
	
	// System.out.println("--------------------------------------------------------------------------------------------------------");
	// System.out.println("Массив переменных в camelCase и CamelCase : " + String.join(" , ", camelCase));
	// System.out.println("--------------------------------------------------------------------------------------------------------");
	
	Task_1_1_res Input = new Task_1_1_res();
	
	// Массив для переменных в snake_case
	String [] snakeCase = Input.to_snake_case(camelCase);
	
	//System.out.println("--------------------------------------------------------------------------------------------------------");
	//System.out.println("Массив переменных в snake_case : " + String.join(" , ", snakeCase));
	//System.out.println("--------------------------------------------------------------------------------------------------------");
	
	
		if ( camelCase.length == snakeCase.length ) {
			
			System.out.println("          МАССИВ НАЗВАНИЯ ПЕРЕМЕННЫХ :");
			System.out.println("--------------------------------------------------");
			System.out.println("camelCase И CamelCase :  " + "   " + "snake_case : " );
			
			for (int i = 0; i < camelCase.length; i++ ) {
				
				System.out.println("--------------------------------------------------");
				System.out.printf("%-20s  :     %-20s%n", camelCase[i], snakeCase[i]);
			}
			
			System.out.println("--------------------------------------------------");
			
		}
	
	}
	
}
