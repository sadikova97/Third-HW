
public class tegi {

	public static void main(String[] args) {
		String teg = new String(
				"1. <HTML> <HEAD> \n 2. <TITLE>���������� �������� ����� </Title> \n 3. </HEAD> \n 4. <BODY> \n 5. <marquee>��� ��� �������  ��������.</marquee> \n 6. <H2>���� ����� <kbd>�����. </kbd></H2> \n 7. <H3 align=\"center\">� ���� �� <em>������������</em>.</H3> \n 8. <H4 align=\"right\">��� ��������� ������ -  <font face=\"Academy\" color=\"Red\">�������</font>. </H4> \n 9. <H5 align=left>���� - ��� � ������� � �������.</H5> \n 10. <B>�����</B> \n 11. <I>������������������</I> \n 12. <Blink>���������</Blink> \n 13. <U> ������� </U> \n 14. <KBD>���������� </KBD> \n 15. <FONT SIZE=5 COLOR=FF80C0>�������:</FONT> ��� \n 16. <FONT SIZE=5 COLOR=FF00FF>������</FONT> � \n 17. <FONT SIZE=+3 COLOR=FF00FF>��������.</FONT> \n 18. </BODY> </HTML>");

		String mass[][] = new String[18][20];
		int a = 0;
		int b = 0;
		int sumteg = 0;

		for (String retval : teg.split(" ")) {
			boolean c = retval.contentEquals("\n");
			if (c == true) {
				b++;
				a = 0;
				System.out.println();
			} else {

				System.out.printf(mass[a][b] = retval + " ");
				if (mass[a][b].indexOf("<") != -1)
					sumteg++;
				a++;

			}

		}
		int strt = teg.indexOf("<marquee>") + 9;
		int nd = teg.indexOf("<", strt + 1);

		System.out.println("\na) ����� �����: " + sumteg);
		System.out.println("\nb) ������� ������ ���������� �����: " + teg.substring(strt, nd));

		String teg2 = teg.toLowerCase();
		strt = 0;
		System.out.println("\nc) ������������ ���� <kbd>:");
		while (teg2.indexOf("<kbd>", strt) != -1) {
			strt = teg2.indexOf("<kbd>", strt);
			nd = teg2.indexOf("<", strt + 1);
			System.out.println(teg.substring(strt, nd + 6));
			strt = strt + 6;
		}
		strt = 0;
		strt = teg.indexOf("16", strt);
		strt = teg.indexOf("COLOR", strt);
		nd = teg.indexOf(">", strt);
		System.out.println("\nd) ���� � 16-�� ������:  " + teg.substring(strt + 6, nd));

		System.out.println("\ne) �����, ������� ����� �������:  ");
		strt = 0;
		teg2 = teg.replaceAll("([1234567890])" + "([.])", "");
		String teg3 = teg2.replaceAll("([1])", "");
		String teg4 = teg3.replaceAll("\n", "");
		String teg5 = teg4.replaceAll(" +", " ");
		while (teg5.indexOf(">", strt+4) != -1 && strt<teg5.length()) {
			strt = teg5.indexOf(">", strt);
			nd = teg5.indexOf("<", strt + 1);
			if (nd!=-1){
			System.out.print(teg5.substring(strt + 1, nd));
			strt = strt + 1;	
			}
		}	
			strt = 0;
			teg2 = teg.replaceAll("\"" , "");
			StringBuilder tegb = new StringBuilder(teg2.subSequence(0, teg2.length()));
			
			
			int l=0, m=0;
			while(tegb.indexOf("=", strt)!=-1){
				strt=tegb.indexOf("=", strt);
				if (tegb.substring(strt+1,strt+2)!="\""){
						tegb.insert(strt+1, "\"");
				
				l = tegb.indexOf(" ",strt);
				m = tegb.indexOf(">",strt);
				strt=l>m?m:l;
				tegb.insert(strt, "\"");
				
				}
			
					}
			System.out.println("\n\nf) ������������ ���");
			System.out.println(tegb);
		
	}

}
