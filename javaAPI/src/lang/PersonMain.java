package lang;
/*
 * equals() Ȱ�� ����
 */
public class PersonMain {
	public static void main(String[] args) {
		Person p1 = new Person("800101-1234567");
		Person p2 = new Person("800101-1234567");
		String result = ""; // �������� �ʱ�ȭ
		result = (p1.equals(p2)) ? "������" : "�ٸ� ���" ;
		// �ּҰ� �񱳰� �ƴ� ������ ��
		System.out.println("p1 == p2 �� ��� ��� :"+ result);
		// ����� �ٸ�������� ��µǴ� ���� ������ �񱳰� �ƴ϶� �����ּҰ� ���̱� �����̴�.
	}
}
