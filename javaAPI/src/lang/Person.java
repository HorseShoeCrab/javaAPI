package lang;

public class Person {
	private String ssn;
	public Person(String ssn) {
		this.ssn = ssn; // ��� �� ����
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	@Override
	public boolean equals(Object obj) {
		boolean flag = false; // �������� �ʱ�ȭ
		/*
		 * Object �� ��� ������ Ÿ���� �ǹ��ϱ� ������
		 * �ݵ�� �ֹι�ȣ�� ������ �ִ� Person ������ Ȯ���ؾ� 
		 * �ֹι�ȣ ��ġ���θ� ���� �� �ֱ� ������
		 * ��ü ĳ���� ������ instanceof �� ����Ѵ�.
		 * �̷� ����� Valuation �� ��ȿ�� üũ�ϰ� �Ѵ�.
		 */
		if (obj != null && obj instanceof Person) { // obj�� null�� �ƴϸ鼭 Person�� �ν��Ͻ����� true�� ����
			return ssn == ((Person)obj).ssn;
		} else {
			return flag; // false�� �ʸ�ȭ ������ false�� ����
		}
		
	}
}
