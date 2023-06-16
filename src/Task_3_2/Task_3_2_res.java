	
package Task_3_2;
	
import java.util.regex.Matcher;
	
import java.util.regex.Pattern;
	
public class Task_3_2_res {
	
	// АНАЛИЗАТОР ТЕКСТА XML-ДОКУМЕНТА
	public void analyzer_xml(String xml) {
		
		Pattern pattern = Pattern.compile(
			
			"((?<openTag><[^/>]+?>)(?<body>.+?)(?<close></.+?>))" +
			
			"|(?<openOnly><[^/>]+?>)" +
			
			"|(?<closeOnly></.+?>)" +
			
			"|(?<noBody><.+? />)|");
		
		Matcher matcher = pattern.matcher(xml);
		
		while (matcher.find()) {
			
			if (matcher.group("openTag") != null && matcher.group("close") != null) {
				
				System.out.println("Открывающий тег : " + matcher.group("openTag") + "\n Тело тега : " + matcher.group("body") + "\n Закрывающий тег : " + matcher.group("close"));
				
			} else if (matcher.group("closeOnly") == null && matcher.group("openOnly") != null) {
				
				System.out.println("Открывающий тег : " + matcher.group("openOnly"));
				
			} else if (matcher.group("openTag") == null && matcher.group("closeOnly") != null) {
				
				System.out.println("Закрывающий тег : " + matcher.group("closeOnly"));
				
			} else if (matcher.group("noBody") != null) {
				
				System.out.println("Tег без тела : " + matcher.group("noBody"));
				
			}
			
		}
		
	}
	
}
