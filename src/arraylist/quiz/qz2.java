package arraylist.quiz;

import java.util.ArrayList;

/*
 * 논리형(Boolean)의 리스트를 생성하세요
 * 
 * 값 3개를 추가하세요(true,true,false)
 * 반복문을 사용하여 리스트의 요소를 출력하세요
 * 리스트의 첫번째 요소와 마지막요소를 출력하세요
 * */
public class qz2 {

	public static void main(String[] args) {
		ArrayList <Boolean> list = new ArrayList<Boolean>();
		list.add(true);
		list.add(true);
		list.add(false);
		for(int i = 0; i <list.size(); i++) {
			Boolean boo= list.get(i);
			System.out.println(boo);
		}
		System.out.println();
		System.out.println(list.get(0)); //첫번째 요소
		int lastIndex = list.size()-1 ; //n-1  마지막 요소 //size는 int형을 받아서 사용함 // 3-1  = 2
		System.out.println(list.get(lastIndex)); 
		//인덱스는 0부터 시작해서, -1을 해줘야지 마지막 요소를 알 수 있고 
		//마지막 요소를 list.get메소드를 이용하여 불러와서 출력 = list.get(2)
		
		//이식을 사용하면 동적인 코드를 만들 수 있음 --> 편리함 
	}

}
