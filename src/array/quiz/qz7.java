package array.quiz;

/*
 * System.arrycopy 메소드를 사용하여 배열을 복사하세요
 * 원본배려 {'a','b','c','d','e'}
 * 새배열 {'d', 'e'}
 * */
public class qz7 {

	public static void main(String[] args) {
		char[] srcArr = {'a', 'b', 'c', 'd', 'e'};
		char[] newArr = new char[2];
		
		System.arraycopy(srcArr, 3, newArr, 0, 2);

		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + " ");
		}
		
	}

}
