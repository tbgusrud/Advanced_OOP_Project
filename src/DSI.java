
public class DSI implements SETNUM {
	private String year; // 측정 연도
	private String observatory; // 관측소
	private double[][] res; // 측정값

	// date는 1212 와 같은 형식으로 받기, date는 원하는 데이터이름
	public double getRes(String inputDate, String data) {
		int date = Integer.parseInt(inputDate);
		int dataIndex = getNum(data);
		if (dataIndex != -1) {
			return res[date][dataIndex]; // 있는 데이터
		} else {
			return -1; // 없는 데이터
		}

	}

	// res 부분 수정 필요
	public void setDSI(String year, String observatory, double[][] res) {
		this.year = year;
		this.observatory = observatory;
		this.res = res;
	}

}
