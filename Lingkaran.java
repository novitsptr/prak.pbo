public class Lingkaran{
	double luas;
	double jari;
	double phi = 3.14;

	public Lingkaran(double jari){
		this.jari = jari;
		luas = phi*(jari*jari);
		System.out.println("Luas Lingkaran adalah : "+luas+"cm");
	}
	public Lingkaran(double perempat, double n_luas){
		System.out.println("=====================");
		System.out.println("Mencari 1/4 Lingkaran");
		double l_empat = perempat*n_luas;
		System.out.println("Dikali dengan : "+perempat+ ", Luas Lingkaran :"+n_luas+"");
		System.out.println("Hasil :"+l_empat);

	public Lingkaran(double jari)
	public Lingkaran(double perempat, double n_luas)
	public Lingkaran(double keliling, double phi, double diameter)
	}
}


