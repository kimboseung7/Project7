package array;

public class Ex1 {

	public static void main(String[] args) {
		//변수 3개를 사용해서 숫자 3개 저장하기
		int num1;
		int num2;
		int num3;
		num1 = 10;
		num2 = 20;
		num3 = 30;
		//배열을 사용해서 숫자 3개 저장하기
		int [] arr = new int[3];
		arr[0] = 10; //인덱스는 0번 부터 시작
		arr[1] = 20;
		arr[2] = 30;
		//arr[3] = 40; //에러남 new int에서 3개 까지만 저장으로 설정
		
		int value = arr[1]; // 1번 값이 꺼내짐
		System.out.println(value);
	}

}
