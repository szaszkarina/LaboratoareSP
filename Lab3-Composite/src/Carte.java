import java.lang.reflect.Array;
import java.util.ArrayList;

public class Carte {

	
	private String nume;
	private Autor autor;
	private ArrayList<Element> content = new ArrayList<Element>();
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}

	public Carte(String x)
	{
		this.nume = x;
	}
	
	public void add(Element element) {
	    this.content.add(element);
	  }

	  
	  public void remove(Element element) {
	    this.content.remove(element);
	  }

	  
	  public Element getElement(int index) {
	    return this.content.get(index);
	  }

	 public void addAuthor(Autor autor) {
		 
		    this.autor = autor;
		  }

	 public void print() {
		    System.out.println("Cartea: " + nume);
		   
			
		    
		    for (Element elem : content) {
		      elem.print();
		    }
		  }
}

