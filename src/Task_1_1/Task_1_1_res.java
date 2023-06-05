	
package Task_1_1;
	
public class Task_1_1_res {
	
/*
	CamelCase : camelCase И CamelCase (с англ. — «ВерблюжийРегистр», также «ГорбатыйРегистр», «СтильВерблюда») —
	стиль написания составных слов, при котором несколько слов пишутся слитно без пробелов,
	при этом каждое слово внутри фразы пишется с прописной буквы. Стиль получил название CamelCase,
	поскольку прописные буквы внутри слова напоминают горбы верблюда (англ. Camel).
*/
/*
	Snake case : snake_case (или snake_case, рус. змеиный_регистр) — стиль написания составных слов,
	при котором несколько слов разделяются символом подчеркивания (_), и не имеют пробелов в записи,
	причём каждое слово обычно пишется с маленькой буквы — «foo_bar», «hello_world» и т. д.
	Такой стиль написания используется для именования переменных и функций в исходном коде,
	и иногда для именования файлов на компьютере.
*/
	
	//ПРЕОБРАЗОВАНИЕ МАССИВА НАЗВАНИЙ ПЕРЕМЕННЫХ ИЗ camelCase И CamelCase В snake_case
	public String [] to_snake_case (String [] CamelCase) {
		
		String [] snake_case = new String[CamelCase.length];
		
		for (int i = 0; i < snake_case.length; i++) {
			
			StringBuilder strBuilder = new StringBuilder();
			
			for (int j = 0; j < CamelCase[i].length(); j++) {
				
				char char1 = CamelCase[i].toCharArray()[j];
				
				if (Character.isLowerCase(char1)) {
					
					strBuilder.append(char1);
					
				} else {
					
					if ( j > 0 ) {
						
						strBuilder.append("_");
						
						strBuilder.append(Character.toLowerCase(char1));
						}
						
					if ( j == 0 ) {
						strBuilder.append(Character.toLowerCase(char1));
						}
				}
			}
			snake_case[i] = strBuilder.toString();
		}
		return snake_case;
	}
}
