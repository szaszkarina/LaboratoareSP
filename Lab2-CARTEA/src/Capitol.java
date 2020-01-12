import java.util.ArrayList;

public class Capitol {
  private String nume;
  private ArrayList<SubCapitol> subChapters = new ArrayList<>();

  public Capitol(String chapterName) {
    nume = chapterName;
  }

  public int createSubChapter(String subChapterName) {
    subChapters.add(new SubCapitol(subChapterName));
    return subChapters.size() - 1;
  }

  public SubCapitol getSubChapter(int indexOfSubChapter) {
    return subChapters.get(indexOfSubChapter);
  }

  public void print() {
    System.out.println("Capitol: " + nume);
    for (SubCapitol subChapter : subChapters) {
      subChapter.print();
    }
  }

}