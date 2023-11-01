package array.quiz;

public class qz8 {

	public static void main(String[] args) {
		Student[] student = new Student[3]; //학생 3명을 저장할 배열 생성
		student[0] = new Student(1, "둘리"); //인스턴스를 생성하고 배열에 저장
		student[1] = new Student(2, "또치");
		student[2] = new Student(3, "짱구");

		for (int i = 0; i < student.length; i++) { //for문을 사용해서 배열의 모든 요소 출력
			System.out.println(student[i] + " ");
		}
		for (int i = 0; i < student.length; i++) {
			student[1].showInfo();
		}

	}

}

class Student {
	int no;
	String name;

	public Student(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}

	public void showInfo() {
		System.out.println(no + "," + name);
	}

}