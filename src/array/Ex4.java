package array;

public class Ex4 {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int i = 0; i < 10; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) { //객체 맴버변수 가질 수 있음, length 배열의 길이를 나타낸다
			System.out.println(arr[i] + " ");
		}
		System.out.println("배열의 길이:" + arr.length);
	}

}
