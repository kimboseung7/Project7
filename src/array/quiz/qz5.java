package array.quiz;
/*
 * 5개 크기의 정수형 배열을 생성하세요
 * 값의 목록을 다음과 같이 초기화하세요 {5,20,100,30,77] int[] arr = new int[] {5,20,100,30,77} 사용
 * 배열에서 가장 큰값을 찾으세요 //
 *  찾으세요 = 비교연산자사용
 * 5개가 있음, 5개중에서 가장 큰 값을 구할려면 비교해봐야함 
 * 필요한게 조건문(큰 값을 찾을려면) 비교연산자 반복문
 * */
public class qz5 {

	public static void main(String[] args) {
		int[] arr = new int[] {5,20,100,30,77};
		int max;
		max = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > max) { //부등호가 < 이면 제일 작은 값을 구할 수 있음
				max = arr[i]; //i값이 올라갈 때 마다,  arr[i]가 max 보다 크면 max의 값을 arr[i]로변경해줌
				//조건을 만족하지 않으면 교체를 하지 않는다 
			}
			
		}
		System.out.println(max);
		
	}
 
}
// 5 20 비교 --> 값이 20으로 변경됨
// 20 100 비교 --> 값이 100으로 변경됨
// 100 30 비교 --> 변경x
// 100 77 비교 --> 변경x
