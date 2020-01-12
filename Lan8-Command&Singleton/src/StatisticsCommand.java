
public class StatisticsCommand implements Command{

	@Override
	public void execute() {
		BookStatistics stats = new BookStatistics();
	   Element e= DocumentManager.getInstance().getCarte().getElement(0);
	   e.accept(stats);
	    stats.printStatistics();

	}

	@Override
	public void unexecute() {
		// TODO Auto-generated method stub
		
	}

}
