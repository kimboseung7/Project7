package array.quiz;
/*
 * 5개의 크기의 정수형 배열을 생성하세요
 * 값의 목록을 다음과 같이 초기화 하세요{5,20,100,30,77}
 * 20이 저장되어있는 요소의 인덱스를 찾아서 출력하세요
 * 
 * 예시)20을 가지는 요소의 인덱스는 1입니다
 * 
 *요소 인덱스를 찾아야함 1이 출력되야됨
 *
 * */
public class qz6 {

	public static void main(String[] args) {
		int[] arr = new int[]{5,20,100,30,77};
		int find = 0; // 저장해야됨
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] == 20 ) { // 배열의 값이 20이라면
				find = i;
				
				// i가 1이면 20이므로 find에 i값을 저장 후 find 출력하면 i 값이 나옴
			}
		}
		System.out.println(find);
	}

}
