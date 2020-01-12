
public class Tabel implements Element{
	  private String title;

	  public Tabel(String title) {
	    this.title = title;
	  }

	  @Override
	  public void print() {
	    System.out.println(title);
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
