// ���� �������� ���� �������̽�

public interface SETNUM {
	int NitrogenDioxide = 0; // �̻�ȭ����
	int Ozone = 2; // ����
	int CarbonDioxide = 2; // �̻�ȭź��
	int SulfurDioxide = 3; // ��Ȳ�갡��
	int FineDust = 4; // �̼�����
	int UltrafineDust = 5; // �ʹ̼�����

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
