import java.util.ArrayList;

public class SubCapitol {
  private String nume;
  ArrayList<Element> elements = new ArrayList<>();

  public SubCapitol(String subChapterName) {
    nume = subChapterName;
  }

  public void createNewParagraph(String text) {
    elements.add(new Paragraf(text));
  }

  public void createNewImage(String imageName) {
    elements.add(new Imagine(imageName));
  }

  public void createNewTable(String title) {
    elements.add(new Tabel(title));
  }

  public void print() {
    System.out.println("Subchapter: " + nume);
    for (Element element : elements) {
      element.print();
    }
  }

}