
public class TestCarte {
	public static void main(String[] args) throws Exception {
		long startTime = System.currentTimeMillis();
		ImagineProxy img1 = new ImagineProxy("Pamela Anderson");
		ImagineProxy img2 = new ImagineProxy("Kim Kardashian");
		ImagineProxy img3 = new ImagineProxy("Kirby Griffin");
		Sectiune playboyS1 = new Sectiune("Front Cover");
		playboyS1.add(img1);
		Sectiune playboyS2 = new Sectiune("Summer Girls");
		playboyS2.add(img2);
		playboyS2.add(img3);
		Carte playboy = new Carte("Playboy");
		playboy.add(playboyS1);
		playboy.add(playboyS2);
		long endTime = System.currentTimeMillis();
		System.out.println("Creation of the content took " + (endTime -
		startTime) + " milliseconds");
		startTime = System.currentTimeMillis();
		playboyS1.print();
		endTime = System.currentTimeMillis();
		System.out.println("Printing of the Sectiune 1 took " + (endTime -
		startTime) + " milliseconds");
		startTime = System.currentTimeMillis();
		playboyS1.print();
		endTime = System.currentTimeMillis();
		System.out.println("Printing again the Sectiune 1 took " + (endTime -
		startTime) + " milliseconds");
		}
}
