
public class Imagine extends Element{

		  private String imageName;

		  public Imagine(String imageName) {
		    this.imageName = imageName;
		  }

		  @Override
		  public void print() {
		    System.out.println(imageName);
		  }
}
