package strings;

import java.util.regex.Pattern;

public class Regular_Expression {

	public static void main(String[] args) {
		System.out.println(Pattern.matches(".s", "as"));//True
		System.out.println(Pattern.matches(".s", " s"));//True
		System.out.println(Pattern.matches("..s", "a s"));//True
		System.out.println(Pattern.matches("..s", "  s"));//True
		
		System.out.println("*********************************");
		
		System.out.println(Pattern.matches("[abc]", "cba"));//false - Only a ,b or c (One Time)
		System.out.println(Pattern.matches("[abc]", "a"));//True
		System.out.println(Pattern.matches("[abc]", "aa"));//false
		System.out.println(Pattern.matches("[^abc]", "z"));//True
		System.out.println(Pattern.matches("[a-d[m-p]]", "b"));//True
		System.out.println(Pattern.matches("[a-d[m-p]]", "n"));//True
		System.out.println(Pattern.matches("[a-d[m-p]]", "e"));//False
		
		System.out.println("? quantifier ...."); 
		System.out.println(Pattern.matches("[amn]?", "a"));//true (a or m or n comes one time)  
		System.out.println(Pattern.matches("[amn]?", ""));//true
	}

}
