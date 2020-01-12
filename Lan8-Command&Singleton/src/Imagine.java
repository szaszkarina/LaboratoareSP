import java.util.concurrent.TimeUnit;

public class Imagine implements Element{

		  private String imageName;

		  public Imagine(String imageName) {
		    this.imageName = imageName;
		    try {
		    	TimeUnit.SECONDS.sleep(5);
		    	} catch (InterruptedException e) {
		    	e.printStackTrace();
		    	}
		  }


		@Override
		  public void print() {
		    System.out.println(imageName);
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