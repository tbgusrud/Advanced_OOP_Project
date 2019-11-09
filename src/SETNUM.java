// 변수 설정값을 위한 인터페이스

public interface SETNUM {
	int NitrogenDioxide = 0; // 이산화질소
	int Ozone = 2; // 오존
	int CarbonDioxide = 2; // 이산화탄소
	int SulfurDioxide = 3; // 아황산가스
	int FineDust = 4; // 미세먼지
	int UltrafineDust = 5; // 초미세먼지

	default int getNum(String name) {
		if (name.equalsIgnoreCase("NitrogenDioxide")) {
			return NitrogenDioxide;
		} else if (name.equalsIgnoreCase("Ozone")) {
			return Ozone;
		} else if (name.equalsIgnoreCase("CarbonDioxide")) {
			return CarbonDioxide;
		} else if (name.equalsIgnoreCase("SulfurDioxide")) {
			return SulfurDioxide;
		} else if (name.equalsIgnoreCase("FineDust")) {
			return FineDust;
		} else if (name.equalsIgnoreCase("UltrafineDust")) {
			return UltrafineDust;
		} else {
			return -1;
		}
	}
}
