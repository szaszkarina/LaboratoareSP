import java.lang.reflect.Array;
import java.util.ArrayList;

public class Carte {

	
	private String nume;
	private Autor autor;
	private ArrayList<Capitol> capit = new ArrayList<Capitol>();
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
	 public void addAuthor(Autor autor) {
		 
		    this.autor = autor;
		  }
	 public int createChapter(String chapterName) {
		    capit.add(new Capitol(chapterName));
		    return capit.size() - 1;
		  }
	 public Capitol getChapter(int indexOfChapter) {
		    return capit.get(indexOfChapter);
		  }
	 public void print() {
		    System.out.println("Cartea: " + nume);
		   
		    	autor.print();	
		    
		    for (Capitol chapter : capit) {
		      chapter.print();
		    }
		  }
}
