package arraylist;

import java.util.ArrayList;
/*
 * ArrayList 클래스 사용하기
 * */
public class Ex3 {

	public static void main(String[] args) {
		ArrayList<Book> list = new ArrayList<Book>();

		list.add(new Book("태백산맥", "조정래"));
		list.add(new Book("데미안", "헤르만 헤세"));
		list.add(new Book("어떻게 살 것인가", "유시민"));

		System.out.println("=== 일반 for문 사용 ===");
		for (int i = 0; i < list.size(); i++) {
			Book book = list.get(i);//인덱스를 이용해 꺼내는게 있음
			book.showBookInfo();
		}
		System.out.println();
		System.out.println("=== 람다식 for문 사용 ===");
		for (Book book : list) {//괄호안에서 꺼내서 꺼낼 필요가 없음
			book.showBookInfo();
//람다식 for문 같은 경우는 리스트가 있으면 처음 인덱스부터 마지막 인덱스까지 순회를 함, 순차적으로
		}

	}
}
class Book {
		String bookName; // 제목
		String author; // 저자

		public Book(String bookName, String author) {
			super();
			this.bookName = bookName;
			this.author = author;
		}

		public void showBookInfo() {
			System.out.println(bookName + "," + author);
		}
	}

