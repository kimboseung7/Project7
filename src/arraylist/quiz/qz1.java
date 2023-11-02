package arraylist.quiz;

import java.util.ArrayList;

/*
 * 문자형(character) 리스트를 생성하세요
 * 문자 3개를 추가하세요('A','B','C')
 * 리스트의 모든 요소를 출력하세요
 * */
public class qz1 {

	public static void main(String[] args) {
		ArrayList <Character> list  = new ArrayList<Character>(); //ArrayList이므로 char -> character 
		list.add('A');	//인덱스에 순차적으로 A - B - C 추가
		list.add('B');
		list.add('C');
		System.out.println(list); //list 출력
		
		char ch1 = list.get(0); //get 메소드를 이용하여, 인덱스를 지정해주면 해당(인자) 인덱스 value 값이 나오고, 그값을 ch1에 저장해서 출력
		System.out.println(ch1 + " ");
		char ch2 = list.get(1);
		System.out.println(ch2 + " ");
		char ch3 = list.get(2);
		System.out.println(ch3 + " ");

	}

}
