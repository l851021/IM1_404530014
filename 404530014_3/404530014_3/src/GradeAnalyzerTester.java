
/*
 * [A]102
 * [TA's Advise]
 * 1. 程式沒什麼問題, 也寫得很好!
 * */

import javax.swing.JOptionPane;

public class GradeAnalyzerTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GradeAnalyzer gradeAnalyzer = new GradeAnalyzer();
		while (true) {
			String input_score = JOptionPane.showInputDialog(null, "請輸入學生成績:");
			if (input_score.equalsIgnoreCase("q")) {
				break;
			}
			try {
				gradeAnalyzer.addGrade(Double.parseDouble(input_score));
			} catch (Exception e) {
				System.out.println("請重新輸入成績");
			}
		}
		gradeAnalyzer.analyzeGrades();
		if (gradeAnalyzer.input_count > 2) {
			System.out.println("You entered " + gradeAnalyzer.input_count
					+ " valid grades from 0 to 110.  Invalid grades are ignored! ");
			System.out.println("The average = " + (int) gradeAnalyzer.average + " with a standard deviation = "
					+ (int) gradeAnalyzer.sd);
			System.out.println(gradeAnalyzer.toString());
		} else
			System.out.println("You did not enter enough grades to analyze.Please enter at least 2 valid grades ");
	}
}
