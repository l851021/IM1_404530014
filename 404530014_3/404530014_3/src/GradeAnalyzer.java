import java.util.ArrayList;

class Count {
	String name;
	int count;

	Count() {
	}

	Count(String _name, int _count) {
		this.name = _name;
		this.count = _count;
	}
}

public class GradeAnalyzer {

	double input_count, sum, sd_all, sd_average, sd, average;
	ArrayList<Double> AllScore = new ArrayList<Double>();
	Count[] _count = new Count[11];
	boolean firsttime = true;

	boolean isValidGrade(double aGrade) {
		if (aGrade <= 110 && aGrade >= 0)
			return true;
		return false;
	}

	public void addGrade(double aGrade) {
		// Good, +2.
		if (firsttime) {
			_count[0] = new Count("A+", 0);
			_count[1] = new Count("A", 0);
			_count[2] = new Count("A-", 0);
			_count[3] = new Count("B+", 0);
			_count[4] = new Count("B", 0);
			_count[5] = new Count("B-", 0);
			_count[6] = new Count("C+", 0);
			_count[7] = new Count("C", 0);
			_count[8] = new Count("C-", 0);
			_count[9] = new Count("D", 0);
			_count[10] = new Count("F", 0);
			firsttime = false;
		}
		if (!isValidGrade(aGrade))
			return;
		input_count++;
		AllScore.add(aGrade);
		sum += aGrade;
		// 分類
		if (aGrade >= 98)
			_count[0].count++;
		if (aGrade >= 92 && aGrade < 98)
			_count[1].count++;
		if (aGrade >= 90 && aGrade < 92)
			_count[2].count++;
		if (aGrade >= 88 && aGrade < 90)
			_count[3].count++;
		if (aGrade >= 82 && aGrade < 88)
			_count[4].count++;
		if (aGrade >= 80 && aGrade < 82)
			_count[5].count++;
		if (aGrade >= 78 && aGrade < 80)
			_count[6].count++;
		if (aGrade >= 72 && aGrade < 78)
			_count[7].count++;
		if (aGrade >= 70 && aGrade < 72)
			_count[8].count++;
		if (aGrade >= 60 && aGrade < 70)
			_count[9].count++;
		if (aGrade < 60)
			_count[10].count++;

		average = sum / input_count;
		sd_all += Math.pow(aGrade - average, 2);// 運算標準差前置作業
	}

	// 算完標準差
	public void analyzeGrades() {
		sd_average = sd_all / input_count;
		sd = Math.sqrt(sd_average);
	}

	public String toString() {
		String grade = "";
		for (int i = 0; i < _count.length; i++) {
			grade += _count[i].name + "=" + _count[i].count + "\n";
		}
		return "The grade distribution is : \n\n" + grade;
	}
}
