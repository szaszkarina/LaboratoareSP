
public class OpenCommand implements Command{

	
	private String s;
	public OpenCommand (String s) {
		this.s = s;
	}
	public void execute() {
		Carte c = new Carte("Nume carte");
		// TODO Auto-generated method stub

	    JsonBuilder jsonBuilder = new JsonBuilder(s);
	    jsonBuilder.build();

	    Element myBook = jsonBuilder.getResult();
	    c.add(myBook);
	   DocumentManager.getInstance().setCarte(c);
	  
	}
	@Override
	public void unexecute() {
		// TODO Auto-generated method stub
		
	}

}
