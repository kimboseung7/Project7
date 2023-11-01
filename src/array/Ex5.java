package array;

import java.util.Arrays;

/*
 * 람다식 포문 사용하기
 * */
public class Ex5 {

	public static void main(String[] args) {
		int [] arr = new int[] {1,2,3,4,5,6,7,8,9,10};
		// (배열에서 꺼낸 값을 저장할 변수:배열)
		for(int value : arr) { //증감식이 없고, 조건이 없음 
			System.out.println(value+" ");
		}
		for(int i = 0; i < 10; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println(arr);
		System.out.println(Arrays.toString(arr)); //value 하고 인덱스를 사용한게 같은 값이 나옴
	}

}
