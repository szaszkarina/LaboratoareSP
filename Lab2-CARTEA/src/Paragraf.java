
public class Paragraf extends Element{
	
	  private String text;

	  public Paragraf(String text) {
	    this.text = text;
	  }

	  @Override
	  public void print() {
	    System.out.println(text);
	  }
	

}
