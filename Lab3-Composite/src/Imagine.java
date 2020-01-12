
public class Imagine implements Element{

		  private String imageName;

		  public Imagine(String imageName) {
		    this.imageName = imageName;
		  }

		  @Override
		  public void print() {
		    System.out.println(imageName);
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
