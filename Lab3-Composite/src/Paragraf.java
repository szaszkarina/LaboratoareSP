
public class Paragraf implements Element{
	
	  private String text;

	  public Paragraf(String text) {
	    this.text = text;
	  }

	  @Override
	  public void print() {
	    System.out.println(text);
	  }

	@Override
	public void add(Element element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Element element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Element getElement(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	

}