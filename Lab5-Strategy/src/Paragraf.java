
public class Paragraf implements Element{
	
	  private String text;
	  private AlignStrategy al;

	  public AlignStrategy getAlignStrategy() {
	    return al;
	  }

	  public void setAlignStrategy(AlignStrategy alignStrategy) {
	    this.al = alignStrategy;
	  }

	  public Paragraf(String text) {
	    this.text = text;
	  }

	  @Override
	  public void print() {
		  if (al != null) {
		      al.print(text);
		    } else {
		      System.out.println(text);
		    }
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