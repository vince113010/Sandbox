package stringClasses;

public class Sandbox {

	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Welcome");
		stringBuilder.append(' ');
		stringBuilder.append("to");
		stringBuilder.append(' ');
		stringBuilder.append("Java");
		
		stringBuilder.insert(11, "HTML and ");
		
		System.out.println(stringBuilder);
		
		stringBuilder.reverse();
		
		System.out.println(stringBuilder);
		
		/*for(int i = 0; i < stringBuilder.length(); i++)
			System.out.printf("%d ", Integer.valueOf(stringBuilder.charAt(i)));
		*/

	}

}
