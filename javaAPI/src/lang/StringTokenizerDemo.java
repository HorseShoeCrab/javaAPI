package lang;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
	public static void main(String[] args) {
		/*문자열을 나누는 데에 있어서 구분자가 존재하지 않고 공백만 있는 경우
		StringTokenizer 를 사용한다.*/
		StringTokenizer tok = new StringTokenizer("Hello Java");
		while (tok.hasMoreTokens()) {
			String token = (String) tok.nextElement();
			System.out.print("\t"+token);
			
		}
	}
}
