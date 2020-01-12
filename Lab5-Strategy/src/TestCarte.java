
public class TestCarte {
	public static void main(String[] args) throws Exception {
		Sectiune cap1 = new Sectiune("Capitolul 1");
		Paragraf p1 = new Paragraf("Paragraf 1");
		cap1.add(p1);
		Paragraf p2 = new Paragraf("Paragraf 2");
		cap1.add(p2);
		Paragraf p3 = new Paragraf("Paragraf 3");
		cap1.add(p3);
		Paragraf p4 = new Paragraf("Paragraf 4");
		cap1.add(p4);
		System.out.println("Printing without Alignment");
		System.out.println();
		cap1.print();
		p1.setAlignStrategy(new AlignCenter());
		p2.setAlignStrategy(new AlignRight());
		p3.setAlignStrategy(new AlignLeft());
		System.out.println();
		System.out.println("Printing with Alignment");
		System.out.println();
		cap1.print();
		}
}
