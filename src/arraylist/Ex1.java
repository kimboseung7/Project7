package arraylist;

import java.util.ArrayList; //util 패키지에서 끌어왔기 때문에 import 문으로 선언

public class Ex1 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(); //ArrayList는 기본형 사용을 못해서 <Integer> 사용
		//Wrappper 클래스 기본 자료 타입 Ex) int -> interger
		list.add(10); 		//add메소드로 10을 추가(인덱스에 순차적으로 들어감)
		list.add(20);		//add 메소드를 쓸 때 마다 늘어남
		list.add(30);
		System.out.println(list);
		
		list.add(1,40);		//1번 인덱스에 40을 넣겠다는 말
		System.out.println(list);
		
		list.remove(2);		//2번 인덱스  삭제, 뒤에 있던 value가 앞으로 (자리)당겨짐
		System.out.println(list);
		
		int num1 = list.get(0); //0번 인덱스를 꺼내서 num1에다가 저장해줌
		int num2 = list.get(1);
		int num3 = list.get(2);
	}//리스트는 동적이기 때문에 추가 하는 만큼 늘어나고, 줄어드는 만큼 감소된다
	//배열은 인덱스를 만들고 그 인덱스에 값을 삽입하는 구조
}
