	
package Task_1_5;
	
public class Task_1_5_res {
	
	// Удаление всех лишних пробелов в строке
	public static String removeExtraSpaces(String s) {
	
	/*
	Метод trim() удаляет пробельные символы с начала и конца строки.
	Пробельными символами в этом контексте считаются все собственно
	пробельные символы (пробел, табуляция, неразрывный пробел и прочие)
	и все символы конца строки (LF, CR и прочие).
	*/
	/*
	Метод trim() возвращает строку с вырезанными пробельными символами с её концов.
	Метод trim() не изменяет значение самой строки.
	*/
		
		StringBuilder strBuilder = new StringBuilder();
		
		String line = s.trim();
		
		boolean isSpace = false;
		
		for (int i = 0; i < line.length(); i++) {
			
			if (line.charAt(i) == ' ') {
				
				if (!isSpace) {
					
					strBuilder.append(" ");
				}
				
				isSpace = true;
				
			} else {
				
				strBuilder.append(line.charAt(i));
				
				isSpace = false;
			}
		}
		
		return strBuilder.toString();
	}
	
}
