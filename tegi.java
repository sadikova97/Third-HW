
public class tegi {

	public static void main(String[] args) {
		String teg = new String(
				"1. <HTML> <HEAD> \n 2. <TITLE>Управление разрывом строк </Title> \n 3. </HEAD> \n 4. <BODY> \n 5. <marquee>Это моя учебная  страница.</marquee> \n 6. <H2>Меня зовут <kbd>Ольга. </kbd></H2> \n 7. <H3 align=\"center\">Я живу во <em>Владивостоке</em>.</H3> \n 8. <H4 align=\"right\">Моя маленькая родина -  <font face=\"Academy\" color=\"Red\">Сахалин</font>. </H4> \n 9. <H5 align=left>ДВГУ - ВУЗ в котором я работаю.</H5> \n 10. <B>Здесь</B> \n 11. <I>продемонстрированы</I> \n 12. <Blink>различные</Blink> \n 13. <U> способы </U> \n 14. <KBD>управления </KBD> \n 15. <FONT SIZE=5 COLOR=FF80C0>шрифтом:</FONT> его \n 16. <FONT SIZE=5 COLOR=FF00FF>цветом</FONT> и \n 17. <FONT SIZE=+3 COLOR=FF00FF>размером.</FONT> \n 18. </BODY> </HTML>");

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

		System.out.println("\na) Число тегов: " + sumteg);
		System.out.println("\nb) Бегущая строка показывает текст: " + teg.substring(strt, nd));

		String teg2 = teg.toLowerCase();
		strt = 0;
		System.out.println("\nc) Использоваие тега <kbd>:");
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
		System.out.println("\nd) Цвет в 16-ой строке:  " + teg.substring(strt + 6, nd));

		System.out.println("\ne) Текст, который будет выведен:  ");
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
			System.out.println("\n\nf) Исправленный код");
			System.out.println(tegb);
		
	}

}
