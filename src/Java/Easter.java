/*
 * [A]95
 * [TA's Advise]
 * 1.柔嘉下次一個作業開一個專案然後上傳新的專案喔(舊的不用刪除)
 * 2.缺少javadoc, 扣5分.
 * */

package Java;

import java.util.Scanner;

public class Easter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ym19, ym4, ym7, year, year_1, year_2, year_3, y_m30, y_m7, a, b, day;
		String month;

		Scanner Easter = new Scanner(System.in);
		System.out.print("請輸入西元年份:");
		year = Easter.nextInt();

		// calculate
		ym19 = year % 19;
		ym4 = year % 4;
		ym7 = year % 7;
		//這邊強制轉型可能會產生一些問題喔, 像是誤差, 雖然在這次的case不會出現
		year_1 = (int) Math.floor(year / 100);
		year_2 = (int) Math.floor((13 + 8 * year_1) / 25);
		year_3 = (int) Math.floor(year_1 / 4);
		y_m30 = (15 - year_2 + year_1 - year_3) % 30;
		y_m7 = (4 + year_1 - year_3) % 7;
		a = (19 * ym19 + y_m30) % 30;
		b = (2 * ym4 + 4 * ym7 + 6 * a + y_m7) % 7;

		if (a + b <= 9) {
			month = "March";
			day = 22 + a + b;
		} else {
			month = "April";
			day = (a + b) - 9;
			if (a == 29) {
				if (b == 6)
					day = (a + b) - 16;
				if (a == 28) {
					if (b == 6) {
						if ((11 * y_m7 + 11) % 30 < 19)
							day = (a + b) - 16;
					}
				}
			}
		}
		System.out.println("In " + year + ", Easter Sunday is: month = " + month + " and day = " + day);
	}
}
