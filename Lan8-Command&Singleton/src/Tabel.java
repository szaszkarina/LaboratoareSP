
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
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Element copy() {
		// TODO Auto-generated method stub
		return null;
	}



}
