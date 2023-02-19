package org.stringMethods;
import java.util.Arrays;
public class StringConcepts {

	/*String Methods = camel notation
	 
	 * 1.charAt()
	 * 2.length()
	 * 3.toUpperCase()
	 * 4.toLowerCase()
	 * 5.equals()
	 * 6.equalsIgnoreCare()
	 * 7.startsWith()
	 * 8.endsWith()
	 * 9.replace()
	 * 10.indexOf()
	 * 11.lastIndex()
	 * 12.contains()
	 * 13.split()
	 * 14.subString()
	 * 15.trim()
	 * 16.isEmpty()
	 * 17.replaceAll()
	 */
public static void main(String[] args) {

//1.charAt()
	
	String Str = "Greens Tech";	
	char ch = Str.charAt(4);
	int len = Str.length();
	System.out.println("The 4th index value is : " + ch);
	System.out.println("The total string length is : " + len);
	
//2.length()
	String st = "The Great tamilnadu welcomes you";
	int length = st.length();
	System.out.println("The total string length is : " + length);

//3.toUpperCase()

	String stri = "venkateshwaran";
	String upperCase = stri.toUpperCase();
	System.out.println("After upper case : " + upperCase);
	
//4.toLowerCase()
	
	String strin = "VENKATESHWARAN";
	String lowerCase = strin.toLowerCase();
	System.out.println("After lower case : " + lowerCase);
	
//5.equals() = case Sensitive
	
	String s1 = "Venkatesh";
	String s2 = "Venkatesh";
	boolean eq = s1.equals(s2);
	System.out.println("The result of equal is : " + eq);
	
//6.equalsIgnoreCase() = not an case Sensitive
	
	String st1 = "YUVARAJ";
	String st2 = "yUvArAj";
	boolean eqIgnore = st1.equalsIgnoreCase(st2);
	System.out.println
	("The equals ignore case result is : " + eqIgnore);
	 
//7.startsWith()
	
	String string1 = "greens Technology private limited";
	boolean startsWith = string1.startsWith("private");
	System.out.println("the startsWith : " + startsWith);
	
//8.endsWith()
	String strr = "greens Technology private limited";
	boolean endsWith = strr.endsWith("limited");
	System.out.println("the endsWith result is : " + endsWith );
	
//9.replace() 
	String Strn = "venkateshwaran";
	
	String replace = Strn.replace('e', 'a');
	System.out.println
	("the replcaed string value is : " + replace )  ;
	System.out.println("before replace : " + Strn);
	
//10.indexOf()
	
	String green = "greens tech";
	int indexOf = green.indexOf('e');
	System.out.println("s indexOf number is : " + indexOf );
	
//11.lastIndexOf()
	
	String greny = "greens tech";
	int lastIndexOf = greny.lastIndexOf('e');
	System.out.println("e lastIndexOf number is : " + lastIndexOf );
	
//12.contains()
	// both words are partial or fully matched
	String strii = "Syllabus";
	boolean contains = strii.contains("Syllab");
	System.out.println("the contains are : " + contains);
	
//13.split()
	
	String spl = "java string integer multiple";
	String[] split = spl.split("\\s");   // \\s
	System.out.println
	("after split result : " + Arrays.toString(split));

//14.substring()
	
	String L = "greens Tech";
	String sub = L.substring(5,11); 
	System.out.println("the subString result is : " + sub);
	
//15.trim()
	
	String h = " greens techonolgy ";
	System.out.println(h.length());
	String trim = h.trim();
	System.out.println("triming : " + trim);
	System.out.println(trim.length());
	
//16.isEmpty()
	
	String t = "";
	boolean empty = t.isEmpty();
	System.out.println("the result of isEmpty is : " + empty);

//17.replaceAll()
	
	String k = "My name was venkat. and my friend name was rahul";
	String replaceAll = k.replaceAll("was","is");
	System.out.println("replaceall result is : " + replaceAll);	
}
}