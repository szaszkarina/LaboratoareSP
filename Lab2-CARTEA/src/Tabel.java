
public class Tabel extends Element{
	  private String title;

	  public Tabel(String title) {
	    this.title = title;
	  }

	  @Override
	  public void print() {
	    System.out.println(title);
	  }

}
