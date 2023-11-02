package arraylist.quiz;

import java.util.ArrayList;

/*
 * 문자열형(String) 리스트를 생성하세요
 * 문자열 5개를 ㅊ가하세요("AA","BB","CC","DD","EE")
 * 반복문을 사용하여 리스트의 요소를 출력하세요
 * 리스트에 저장된 모든 문자열을 삭제하세요
 * 
 * 
 * */
public class qz3 {

	public static void main(String[] args) {
		ArrayList <String> list = new ArrayList<String>();
		list.add("AA");
		list.add("BB");
		list.add("CC");
		list.add("DD");
		list.add("EE");
		
		for( int i = 0;i<list.size();i++) {
			String str = list.get(i);
					System.out.println(str);
		}
		//뒤에서부터 삭제
		list.remove(4);
		list.remove(3);
		list.remove(2);
		list.remove(1);
		list.remove(0);
		System.out.println();
		System.out.println(list);
		
//		//앞에서부터 삭제
//		list.remove(0);
//		list.remove(0);
//		list.remove(0);
//		list.remove(0);
//		list.remove(0);
//		System.out.println();
//		System.out.println(list);
		
		//잘못된 경우
//		list.remove(0);
//		list.remove(1);
//		list.remove(2);
//		list.remove(3);
//		list.remove(4);
		
	}
	


}
