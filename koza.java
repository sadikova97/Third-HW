import java.util.Scanner;

public class koza {

	public static void main(String[] args) {
		String stih = new String(
				"����-���� ���� � ���������. \n ������� ���� � ��� ���� ����� ��������, ���� ���� ��������. \n ��� ������ ����� - �������� ������ ������� � ���� ������ �� �������. \n ��������� ����, ���������� � ����� � ������:\n � ����������, ���������! \n ����������, ����������! \n ���� ���� ������ - ������ ��������; \n ����� ������ �� �������, \n �� ������� �� ���������, \n �� ��������� �� ���� �����! \n �������� ������� ����� � ������� ����. \n ��� �� ��������, ������ � ����� ����� � ���, � ������� �������� ������ - ��������. \n ���� ���������, ��� ���� ����. \n ��� ��� ���� ����, ���� ������� � ������� � �������� ������� �������: \n - ��, �������! ��, ����������! ����������, ����������, ���� ���� ������,  ������ ��������. \n ����� ������� ������!");
		String result = stih.replaceAll("([,!;:.-])" , "");
		Scanner in = new Scanner(System.in);
		String mass[][] = new String[20][20];
		int a = 0;
		int b = 0;
		String q;

		for (String retval : result.split(" ")) {
			boolean c = retval.contentEquals("\n");
			if (c == true) {
				b++;
				a = 0;
				System.out.println();
			} else {
				
				System.out.print(mass[b][a] = retval + " ");
				a++;
			}

		}
		System.out.println();
		String arr[] = new String[130];
		int podarr[] = new int[130];
		boolean c, fl;
		int sum = 1;
		for (a = 0; a < 20; a++) {
			for (b = 0; b < 20; b++) {
				if (mass[a][b] != null) {
					fl = false;
					for (int g = 0; g < 130 && fl == false; g++) {
						if (arr[g] != null) {
							c = arr[g].equalsIgnoreCase(mass[a][b]);
							if (c == true) {
								podarr[g]++;
								fl = true;
							}
						}
					}
					if (fl==false){
						arr[sum]=mass[a][b];
						podarr[sum]=1;
					sum++;
						
						
					}
					
				}
			}

		}
		for (int g = 0; g < 130; g++) {
			if (arr[g] != null){
			arr[g] = arr[g] +" : "+ String.valueOf(podarr[g]);
			System.out.println(arr[g]);
			}
		}
	}
}
