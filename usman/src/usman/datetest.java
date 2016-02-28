package usman;

public class datetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String dddate = "Dec,2014";

		String day_f = date_format(dddate);

		System.out.println(day_f + "     Finel Date");

	}

	public static String date_format(String df) {

		String idate = df;

		String aa = idate.replaceAll("\\s", "");

		aa = aa.replace(",", ".");

		aa = aa.replace(".", "-");

		aa = aa.replace("-", "/");

		aa = aa.replace("/", "-");
		System.out.println("aziz re hman");
		System.out.println("aziz re asdas");
		
		

		int asterisks = 0;
		for (int i = 0; i < aa.length(); i++) {
			if (aa.charAt(i) == '-') {
				asterisks++;
			}
		}

		String[] date_str = aa.split("-");

		if (asterisks == 1) {

			String[] month = aa.split("-");

			String temp = month[0];

			String a = month(temp);

			df = "01" + "-" + a + "-" + month[1];
		}

		if (asterisks == 2) {
			String[] day = aa.split("-");

			String temp = day[0];

			String m_temp = day[1];

			String day_f = day(temp);

			String mon_f = month(m_temp);

			df = day_f + "-" + mon_f + "-" + day[2];
		}

		return df;

	}

	public static String day(String day) {

		if (day.length() != 2) {

			day = "0" + day;

		}
		return day;

	}

	public static String month(String month) {

		String mname[] = { "January", "February", "March", "April", "May",
				"June", "July", "August", "September", "October", "November",
				"December" };

		if (month.length() < 2) {

			month = "0" + month;

		}

		if (month.length() > 2) {

			for (int q = 0; q < mname.length; q++) {

				if (mname[q].contains(month)) {

					q = q + 1;
					if (q < 10)

					{
						month = "0" + q;

					}

					else {

						month = q + "";

					}
				}

			}

		}
		return month;

	}

}
