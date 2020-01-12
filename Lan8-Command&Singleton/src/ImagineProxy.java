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
public void accept(Visitor v) {
	// TODO Auto-generated method stub
	
}

@Override
public Element copy() {
	// TODO Auto-generated method stub
	return null;
}




}