package array;

public class Ex7 {

	public static void main(String[] args) {
		Book[] library = new Book[5];

//		for (int i = 0; i < library.length; i++) { // 주소 값이 없으면 빈값을 나타냄
//			System.out.println(library[i] + " ");
//		}
		// library[0].showInfo();

		library[0] = new Book("태백산맥", "조정래");
		library[1] = new Book("데미안", "헤르만 헤세");
		library[2] = new Book("어떻게 살 것인가", "유시민");
		library[3] = new Book("토지", "박경리");
		library[4] = new Book("어린왕자", "생택쥐페리");

		for (int i = 0; i < library.length; i++) { // 주소 값이 없으면 빈값을 나타냄
			System.out.println(library[i] + " ");
		}
		for (int i = 0; i < library.length; i++) { // 주소 값이 없으면 빈값을 나타냄
			library[1].showInfo();
		}

	}
}
	class Book {
		String bookName;
		String author;

		public Book(String bookName, String author) {
			this.bookName = bookName;
			this.author = author;
		}

		public void showInfo() {
			System.out.println(bookName + "," + author);
		}

	}
