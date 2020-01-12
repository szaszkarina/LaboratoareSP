
public class BookStatistics {

	protected int numarImg=0;
	protected int numarProxy=0;
	protected int numarPrgf=0;
	protected int numarTabel=0;
	
	
	
	
	public int getNumarImg() {
		return numarImg;
	}

	public void setNumarImg(int numarImg) {
		this.numarImg = numarImg;
	}

	public int getNumarProxy() {
		return numarProxy;
	}

	public void setNumarProxy(int numarProxy) {
		this.numarProxy = numarProxy;
	}

	public int getNumarPrgf() {
		return numarPrgf;
	}

	public void setNumarPrgf(int numarPrgf) {
		this.numarPrgf = numarPrgf;
	}

	public int getNumarTabel() {
		return numarTabel;
	}

	public void setNumarTabel(int numarTabel) {
		this.numarTabel = numarTabel;
	}

	public void printStatistics() {
		System.out.println("Book statistics : ");
		System.out.println("Numarul Imaginilor: "+numarImg );
		System.out.println("Numarul Paragrafelor: "+numarPrgf );
		System.out.println("Numarul Tabelelor: "+numarTabel);
		
		
		
	}
}