
public class TestCarte {
	public static void main(String[] args) throws Exception {
		Carte noapteBuna = new Carte("Noapte buna, copii!");
		Autor rpGheo = new Autor("Radu Pavel Gheo");
		noapteBuna.addAuthor(rpGheo);
		Sectiune cap1 = new Sectiune("Capitolul 1");
		Sectiune cap11 = new Sectiune("Capitolul 1.1");
		Sectiune cap111 = new Sectiune("Capitolul 1.1.1");
		Sectiune cap1111 = new Sectiune("Subchapter 1.1.1.1");
		noapteBuna.add(new Paragraf("Multumesc celor care au facut posibila......"));
		noapteBuna.add(cap1);
		cap1.add(new Paragraf("Moto capitol"));
		cap1.add(cap11);
		cap11.add(new Paragraf("Text from subchapter 1.1"));
		cap11.add(cap111);
		cap111.add(new Paragraf("Text from subchapter 1.1.1"));
		cap111.add(cap1111);
		cap1111.add(new Imagine("Imagine subchapter 1.1.1.1"));
		noapteBuna.print();
		}
}
