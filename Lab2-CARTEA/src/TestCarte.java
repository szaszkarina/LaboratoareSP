
public class TestCarte {
	public static void main(String[] args) {
		Carte discoTitanic = new Carte("Disco Titanic");
		Autor rpGheo = new Autor("Radu Pavel Gheo");
		discoTitanic.addAuthor(rpGheo);
		int indexChapterOne = discoTitanic.createChapter("Capitolul 1");
		Capitol chp1 = discoTitanic.getChapter(indexChapterOne);
		int indexSubChapterOneOne = chp1.createSubChapter("Subcapitolul 1.1");

		SubCapitol scOneOne = chp1.getSubChapter(indexSubChapterOneOne);
		scOneOne.createNewParagraph("Paragraph 1");
		scOneOne.createNewParagraph("Paragraph 2");
		scOneOne.createNewParagraph("Paragraph 3");
		scOneOne.createNewImage("Image 1");
		scOneOne.createNewParagraph("Paragraph 4");
		scOneOne.createNewTable("Table 1");
		scOneOne.createNewParagraph("Paragraph 5");
		scOneOne.print();
		}
}
