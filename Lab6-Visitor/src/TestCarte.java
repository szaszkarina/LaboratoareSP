
public class TestCarte {

	public static void main(String[] args) throws Exception {
		Sectiune cap1 = new Sectiune("Capitolul 1");
		Paragraf p1 = new Paragraf("Paragaf 1");
		cap1.add(p1);
		Paragraf p2 = new Paragraf("Paragaf 2");
		cap1.add(p2);
		Paragraf p3 = new Paragraf("Paragaf 3");
		cap1.add(p3);
		Paragraf p4 = new Paragraf("Paragaf 4");
		cap1.add(p4);
		cap1.add(new ImagineProxy("ImageOne"));
		cap1.add(new Imagine("ImageTwo"));
		cap1.add(new Paragraf("Some text"));
		cap1.add(new Tabel("Table 1"));
		BookStatistics stats = new BookStatistics();
		cap1.accept(stats);
		stats.printStatistics();
		}
}
