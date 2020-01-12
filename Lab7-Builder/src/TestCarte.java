
public class TestCarte {
	public static void main(String[] args) throws Exception {
		Builder jsonBuilder = new JSONBuilder("/Users/szaszkarina/Downloads/book.json");
		jsonBuilder.build();
		Element myBook = jsonBuilder.getResult();
		myBook.print();
		}
}
