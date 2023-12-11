
public class SemesterAverage {

	public static void main(String[] args) {
		 int sem1, sem2,sem3, sem4,sem5, sem6,sem7, sem8;
	double a	= semesterMarks(85,79,91,76,88,95,80,85);
	System.out.println(a);
	}
		 public static double semesterMarks (int sem1,int sem2,int sem3,int sem4,int sem5,int  sem6,int sem7,int sem8)
		 {
			int res = (sem1+sem2+sem3+sem4+sem5+sem6+sem7+sem8)/8;
			return res;
		 }

	}


