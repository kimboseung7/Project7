package array;

public class Ex6 {

	public static void main(String[] args) {
		char[] srcArr = { 'a', 'b', 'c', 'd', 'e' };
		char[] newArr = new char[3];
		// 원본배열, 시작위치, 새배열, 시작위치, 개수
		System.arraycopy(srcArr, 0, newArr, 0, 3);

		System.out.println("원본배열: ");  // 원본 값이 출력되엇음
		for (int i = 0; i < srcArr.length; i++) { 
			System.out.print(srcArr[i] + " ");
		}
		System.out.println("새로운 배열");
		for (int i = 0; i < newArr.length; i++) { // new char[3] 이니까 3개 크기의 abc가 출력됨
			System.out.print(newArr[i] + "");
		}
	}

}
