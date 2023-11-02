package arraylist;

import java.util.ArrayList;

public class Ex4 {

	public static void main(String[] args) {
		Student student1 = new Student("둘리");
		student1.subjectList.add(new Subject("국어", 100)); 
		student1.subjectList.add(new Subject("수학", 50));
		student1.showInfo(); 
		
		Student student2 = new Student("도우너");
		student2.subjectList.add(new Subject("국어", 100)); 
		student2.subjectList.add(new Subject("영어", 85));
		student2.subjectList.add(new Subject("수학", 50));
		student2.subjectList.add(new Subject("사회", 85));
		student2.showInfo(); 
		
		
	}

}
class Subject{
	String name;
	int score;
	public Subject(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	
}
class Student{
	String studentName;
	ArrayList<Subject> subjectList; //수강과목을 저장할 리스트
	public Student(String studentName) {
		super();
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>(); //인스턴스 만들어줌 --> subjectList에 삭제하고 추가하는 작업을 해줄 수 있음
	}
	public void showInfo() {
		int total = 0;
		
		for(Subject s : subjectList) {
			total = total + s.score;
		}
		System.out.println(studentName + "학생의 총점은" + total +"입니다");
		}
	}
	