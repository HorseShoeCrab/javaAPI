package lang;
// trim 문법
public class Trim {
	public static void main(String[] args) {
		String str = "   Hello     Java     World  !!   ";
		System.out.println(str.trim());
		// trim은 리터럴값의 앞뒤 공백을 제거
		System.out.println(str.trim().replace("Java", "JSP"));
		// 메소드 체인 기법 : 리턴하는 값이 String 이라면 String 의 메소드들을 연결해서 사용하는 것
	}
}
