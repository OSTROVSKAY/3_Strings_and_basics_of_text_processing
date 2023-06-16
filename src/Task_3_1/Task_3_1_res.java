	
package Task_3_1;
	
import java.util.Arrays;
	
import java.util.Comparator;
	
import java.util.stream.Collectors;
	
public class Task_3_1_res {
	
	// Отсортировать абзацы по количеству предложений
	public void bySentenceCount(String text) {
		
		String[] paragraphs = splitByParagraph(text);
		
		Arrays.sort(paragraphs, (paragraph1, paragraph2) ->
		
			paragraph1.split("[!?.:]+").length >= paragraph2.split("[!?.:]+").length ? 1 : -1);
		
		print2(paragraphs);
	}
	
	
	// В каждом предложении отсортировать слова по длине
	public void byWordLength(String text) {
		
		String[] paragraphs = splitByParagraph(text);
		
		for (int i = 0; i < paragraphs.length; i++) {
			
			String[] words = splitByWord(paragraphs[i]);
			
			Arrays.sort(words, Comparator.comparingInt(String::length));
			
			String result = String.join(" ", words);
			
			print1(result);
		}
	}
	
	
	// Отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по алфавиту
	public void byLexemeCount(String text, char symbol) {
		
		String[] paragraphs = splitByParagraph(text);
		
		for (String paragraph : paragraphs) {
			
			String[] words = splitByWord(paragraph);
			
			String result = Arrays.stream(words)
					
					//Сравниваем слова по количеству вхождений символа
					.sorted(Comparator.comparingLong((String word) -> word.chars()
							.filter(ch -> ch == symbol)
							.count())
							
							//А если число вхождений одинаковое, то тогда по алфавиту сравниваем
							.thenComparing(String.CASE_INSENSITIVE_ORDER)).collect(Collectors.joining(" "));
							
			print1(result);
		}
	}
	
	
	// Разделение строки : Spliter
	/*
	Метод split в Java разделяет строку на подстроки,
	используя разделитель, который определяется с помощью
	регулярного выражения.
	*/
	public String[] splitByParagraph(String text) {
		
		return text.split("\n");
	}
	
	
	// Разделение строки : Spliter
	/*
	Метод split в Java разделяет строку на подстроки,
	используя разделитель, который определяется с помощью
	регулярного выражения.
	*/
	public String[] splitByWord(String text) {
		
		return text.split(" ");
	}
	
	
	// Печать результата : PrintResult
	public void print1(String text) {
		
		System.out.println(text);
	}
	
	// Печать результата : PrintResult
	public void print2(String[] paragraphs) {
		
		for (String paragraph : paragraphs) {
			
			System.out.println(paragraph);
		}
	}
	
}
