
public class DSI implements SETNUM {
	private String year; // ���� ����
	private String observatory; // ������
	private double[][] res; // ������

	// date�� 1212 �� ���� �������� �ޱ�, date�� ���ϴ� �������̸�
	public double getRes(String inputDate, String data) {
		int date = Integer.parseInt(inputDate);
		int dataIndex = getNum(data);
		if (dataIndex != -1) {
			return res[date][dataIndex]; // �ִ� ������
		} else {
			return -1; // ���� ������
		}

	}

	// res �κ� ���� �ʿ�
	public void setDSI(String year, String observatory, double[][] res) {
		this.year = year;
		this.observatory = observatory;
		this.res = res;
	}

}
