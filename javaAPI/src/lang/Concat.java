package lang;
// concat 메소드 문법
public class Concat {
	public static void main(String[] args) {
			String str1 = "Java";
			String str2 = " 학습중 ";
			String str3 = str1 + str2;
			System.out.println(str3);
			String str4 = "API를";
			System.out.println(str4.concat(str2));
	}
}

//	concat() 는 리터럴 타입의 상수값들을 합치는 메소드
