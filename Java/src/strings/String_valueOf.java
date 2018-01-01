package strings;

public class String_valueOf {

	public static void main(String[] args) {
		System.out.println("Hello");
		int value=30;  
		String s1=String.valueOf(value);  
		System.out.println(s1+10);//concatenating string with 10  
		
		boolean b = true;
		String s2 = String.valueOf(b);
		System.out.println(s2+10);
		
		char c = 'a';
		String s3 = String.valueOf(c);
		System.out.println(s3+10);
		
		char[] ch = {'j','a','v','a','t','p','o','i','n','t'};
		String s4 = String.valueOf(ch);
		System.out.println(s4+10);
		

	}

}
