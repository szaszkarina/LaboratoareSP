
public class TestCarte {
	public static void main(String[] args) throws Exception {
		Sectiune cap1 = new Sectiune("Capitolul 1");
		cap1.addElement(new Paragraf("Moto capitol"));
		cap1.addElement(new Paragraf("Another One"));
		cap1.addElement(new Paragraf("Another Two"));
		cap1.addElement(new Paragraf("Another Three"));
		DocumentManager.getInstance().setSectiune(cap1);
		System.out.println("Book Content: ");
		DocumentManager.getInstance().getSectiune().print();

		new DeleteCommand().execute();
		System.out.println("Book Content after the first delete: ");
		DocumentManager.getInstance().getSectiune().print();
		new DeleteCommand().execute();
		System.out.println("Book Content after the second delete: ");
		DocumentManager.getInstance().getSectiune().print();

		Command undoCommand = new UndoCommand();
		undoCommand.execute();
		System.out.println("Book Content after first undo: ");
		DocumentManager.getInstance().getSectiune().print();
		undoCommand.execute();
		System.out.println("Book Content after second undo: ");
		DocumentManager.getInstance().getSectiune().print();
		Command redoCommand = new RedoCommand();
		redoCommand.execute();
		System.out.println("Book Content after first REDO: ");
		DocumentManager.getInstance().getSectiune().print();
		redoCommand.execute();
		System.out.println("Book Content after second REDO: ");
		DocumentManager.getInstance().getSectiune().print();
}
