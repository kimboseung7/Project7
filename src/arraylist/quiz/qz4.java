package arraylist.quiz;

import java.util.ArrayList;

/*
 * 학생(Student)을 정의하는 클래스를 만드세요
 * 속성: 학번, 이름
 * 
 * Student형 리스트를 생성하고, 학생 3명을 추가하세요
 * 
 * 반복문을 사용하여 리스트의 요소를 출력하세요
 * */
public class qz4 {

	public static void main(String[] args) {
		ArrayList<Student> student = new ArrayList<Student>();
		student.add(new Student(1, "루피"));
		student.add(new Student(2, "짱구"));
		student.add(new Student(3, "땡구"));

		for (int i = 0; i < student.size(); i++) {
			Student studentlist = student.get(i);
			System.out.println(student);
			studentlist.showInfo();
		}

	}

}

class Student {
	int studentNo;
	String studentName;

	public Student(int studentNo, String studentName) {
		super();
		this.studentNo = studentNo;
		this.studentName = studentName;
	}

	public void showInfo() {
		System.out.println(studentName + studentNo + "번");
	}
}