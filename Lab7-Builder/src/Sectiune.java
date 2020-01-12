import java.awt.List;
import java.util.ArrayList;

public class Sectiune implements Element {
  private String title;
  private ArrayList<Element> content = new ArrayList<Element>();

  public String getName() {
    return title;
  }

  public void setName(String name) {
    this.title = name;
  }

  public Sectiune(String name) {
    this.title = name;
  }

  @Override
  public void add(Element element) {
    this.content.add(element);
  }

  @Override
  public void remove(Element element) {
    this.content.remove(element);
  }

  @Override
  public Element getElement(int index) {
    return this.content.get(index);
  }

  @Override
  public void print() {
    for (Element element : content) {
      element.print();
    }
  }



}