	
package Task_2_4;
	
public class Task_2_4_res {
	
	// СОСТАВЛЕНИЕ СЛОВА ИЗ ЧАСТЕЙ ДРУГОГО СЛОВА
	public static String build_word(String word) {
		
		String new_word = null;
		
		// Буква "т"
		String a1 = null;
		
		// Буква "о"
		String a2 = null;
		
		// Буква "р"
		String a3 = null;
		
		for (int i = 0; i < word.length() - 1; i++) {
			
			if( word.charAt(i) == 'т')
				{
				a1 = word.substring(i, i+1);
				}
				
			if( word.charAt(i) == 'о')
				{
				a2 = word.substring(i, i+1);
				}
				
			if( word.charAt(i) == 'р')
				{
				a3 = word.substring(i, i+1);
				}
				
			}
			
		if ( a1 != null & a2 != null & a3 != null )
				{
				new_word = a1 + a2 + a3 + a1;
				}
				
			else
				{
				System.out.println("-------------------");
				System.out.println("СЛОВО НЕ СОСТАВЛЕНО");
				System.out.println("-------------------");
				}
				
		return new_word;
	}
	
}
