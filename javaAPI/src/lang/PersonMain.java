package lang;
/*
 * equals() 활용 예제
 */
public class PersonMain {
	public static void main(String[] args) {
		Person p1 = new Person("800101-1234567");
		Person p2 = new Person("800101-1234567");
		String result = ""; // 지역변수 초기화
		result = (p1.equals(p2)) ? "동일인" : "다른 사람" ;
		// 주소값 비교가 아닌 실제값 비교
		System.out.println("p1 == p2 일 경우 결과 :"+ result);
		// 결과가 다른사람으로 출력되는 것은 실제값 비교가 아니라 참조주소값 비교이기 때문이다.
	}
}
