package regulaExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
  
	public static void main(String args[]) {
		Pattern pattern = Pattern.compile("hello");
		Matcher matcher = pattern.matcher("hello");
		System.out.println(matcher.find());
	}
}
