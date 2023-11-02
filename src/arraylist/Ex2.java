package arraylist;

import java.util.ArrayList;

public class Ex2 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(); 
		list.add(10);//Integer를 사용했으므로 인자 안에는 숫자를 저장해야함
		list.add(20);
		list.add(30);
		
		for (int i = 0; i<list.size(); i++) { // list 사이즈가 커질 수록 i의 값이 커짐, i는 인덱스 (번호)[ i용도 1, 반복횟수 2,리스트의 인덱스]
			int num = list.get(i);			//따라서 출력될수록 커짐
			System.out.println(num+ " ");
		}
	}

}
