public class ImagineProxy implements Element {
  private String imageName;
  Imagine image = null;

  public ImagineProxy(String imageName) {
    this.imageName = imageName;
  }

  @Override
  public void print() {
    if (this.image == null) {
      this.image = new Imagine(this.imageName);
    }
    this.image.print();
  }

  @Override
  public void add(Element element) {
    System.out.println("ERORR - IMG PROXY");
  }

  @Override
  public void remove(Element element) {
    System.out.println("ERORR - IMG PROXY");
  }

  @Override
  public Element getElement(int index) {
    System.out.println("ERORR - IMG PROXY");
    return null;
  }

@Override
public void accept(Visitor v) {
	// TODO Auto-generated method stub
	
}
}