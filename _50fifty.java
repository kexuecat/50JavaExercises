import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;

public class _50fifty {
	public static void main(String[] args) throws IOException {
		Student[] student = new Student[5];
		for (int i=0; i<student.length; i++) {
			student[i] = input();
		}

		File file = new File("e:" + File.separator + "test.txt");
		FileWriter fileWriter = new FileWriter(file);
		for (int j=0; j<student.length; j++) {
			fileWriter.write(student[j].toString() + "\r\n");
		}
		fileWriter.write("\r\n");
		fileWriter.close();
	}

	static Student input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入姓名：");
		String sname = sc.nextLine();
		System.out.println("输入学号：");
		String sno = sc.nextLine();
		System.out.println("输入第一门成绩：");
		double score1 = sc.nextDouble();
		System.out.println("输入第二门成绩：");
		double score2 = sc.nextDouble();
		System.out.println("输入第三门成绩：");
		double score3 = sc.nextDouble();

		return new Student(sname, sno, score1, score2, score3);
	}

	static class Student {
		private String sname;
		private String sno;
		private double score1;
		private double score2;
		private double score3;
		public double aveScore() {
			return (score1+score2+score3) / 3;
		}

		public String getSname() {
			return sname;
		}

		public void setSname(String sname) {
			this.sname = sname;
		}

		public String getSno() {
			return sno;
		}

		public void setSno(String sno) {
			this.sno = sno;
		}

		public double getScore1() {
			return score1;
		}

		public void setScore1(double score1) {
			this.score1 = score1;
		}

		public double getScore2() {
			return score2;
		}

		public void setScore2(double score2) {
			this.score2 = score2;
		}

		public double getScore3() {
			return score3;
		}

		public void setScore3(double score3) {
			this.score3 = score3;
		}

		public Student(String sname,String sno,double score1,double score2,double score3) {
			super();
			this.sname = sname;
			this.sno = sno;
			this.score1 = score1;
			this.score2 = score2;
			this.score3 = score3;
		}

		@Override
		public String toString() {
			return  "姓名："+this.sname+
					" 学号 "+this.sno+
					"\r\n第一科目："+this.score1+
					"\r\n第二科目："+this.score2+
					"\r\n第三科目："+this.score3+
					"\r\n平均成绩："+this.aveScore()+
					"\r\n";
		}


	}
}
