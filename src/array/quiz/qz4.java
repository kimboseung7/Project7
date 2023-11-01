package array.quiz;
/*
 * 배열의 길이가 5인 정수형 배열을 선언하고, 1~10 중 짝수만 배열에 저장하세요
 * int[] arr = new int[5]    ,   []를 사용하여 1~10 짝수 배열 저장
 * */
import java.util.Arrays;

public class qz4 {

	public static void main(String[] args) { //2,4,6,8,10을 저장하고 싶음
		int[] arr = new int[5];
		int v = 0;

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				arr[v] = i; // arr[v] = i;                   //대입하는 코드가 필요함 arr[인덱스] = i(짝수)
				v++; 		// System.out.println(arr[v]);   //v를 1씩 증가시킨 다음에 판별 (2의 배수인지) 짝수가 되는 순간이 5번
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
