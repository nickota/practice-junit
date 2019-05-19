package ch18.ex01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NickotaStringUtils {

	public static String toSnakeCase(String str) {

		if (str.isEmpty()) {
			throw new NullPointerException();
		}
		String snake = str;
		Pattern p = Pattern.compile("[A-Z]");
		for(;;) {
			Matcher m = p.matcher(snake);
			if(!m.find()) {
				break;
			}
			snake = m.replaceFirst("_" + m.group(1).toLowerCase());
		}
		return snake.replaceFirst("^_", "");
	}
}
