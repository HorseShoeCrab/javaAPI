package lang;
// Wrapper Ŭ���� ����
public class WrapperSyntax {
	
	/*Wrapper Class
	- ������ Ÿ�� 8���� �� char �� int �� ������
	������ Ÿ���� ���۹��ڸ� �빮�ڷ� �ٲپ� ��üȭ ��Ų ��.
	- ��, Boolean, Byte, Double, Float, Short, Long �̴�.
	- �׸��� int �� Integar
	- char �� Character �̴�.
	- ��, primitive Ÿ�Ե� ��ü�� ó���ϴ� ����
	- Wrapper class �̴�.*/
	
	public static void main(String[] args) {
		// int ���� -> String Ÿ��(���ͷ�)
		String str = String.valueOf(50);
		// ���ͷ� ���� �⺻������ ĳ���ý� ��ȯ���
		// ��, String -> int
		int num1 = Integer.parseInt("200");
		int num2 = Integer.parseInt("200");
		int result = num1 + num2;
		System.out.println(result);
		
		// �⺻���� â�������� ����ȯ�ϴ� ���(ĳ���� ��������)
		// Integar num3 = (Integar)result;
		Integer num3 = result;
		System.out.println("�⺻���� ���������� ����ȯ�� ��� : "+ num3);
		Integer num4 = 2 + num3;
		System.out.println("�������� �⺻������ ���� ��� : "+ num4);
		
		int num5 = Integer.parseInt("Hello");
		System.out.println(num5);
		// Exception in thread "main" java.lang.NumberFormatException: For input string: "Hello" 
		// ���ڰ��� ���������� ����ȯ�� �õ��ߴ��� ���θ� �����ϰ� ����� �ؾ� ��
	}
}