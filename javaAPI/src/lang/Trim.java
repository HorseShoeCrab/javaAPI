package lang;
// trim ����
public class Trim {
	public static void main(String[] args) {
		String str = "   Hello     Java     World  !!   ";
		System.out.println(str.trim());
		// trim�� ���ͷ����� �յ� ������ ����
		System.out.println(str.trim().replace("Java", "JSP"));
		// �޼ҵ� ü�� ��� : �����ϴ� ���� String �̶�� String �� �޼ҵ���� �����ؼ� ����ϴ� ��
	}
}
