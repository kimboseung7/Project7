package array.quiz;
/*
 * 10개 크기의 정수형 배열을 생성하세요
 * 값의 목록을 다음과 같이 초기화하세요{1,2,3,4,5,6,7,8,9,10}
 * 첫번째 요소와 마지막 요소를 출력하세요
 * 단, 값의 목록이 바뀌었을때도 첫번째요소와 마지막 요소가 출력되어야합니다
 * 
 * */
public class qz2 {

	public static void main(String[] args) {
		int[] intArray = new int[]{1,2,3,4,5,6,7,8,9,10}; //접근 하고 싶은 요소에 인덱스(배열의 위치) 사용
		//인덱스 0 인덱스 9
		System.out.println(intArray[0]);
		int lastIndex = intArray.length -1; //n-1 
		System.out.println(intArray[0]);
	}

}
