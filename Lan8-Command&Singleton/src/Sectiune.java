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
  public void print() {
    for (Element element : content) {
      element.print();
    }
  }

@Override
public void accept(Visitor v) {
	// TODO Auto-generated method stub
	
}

@Override
public Element copy() {
	// TODO Auto-generated method stub
	return null;
}



}