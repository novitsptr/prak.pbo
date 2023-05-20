package tugas;

public class SetengahLingkaran extends Lingkaran implements Geometri{

public SetengahLingkaran (double r) { super(r); }
public SetengahLingkaran (SetengahLingkaran r){
	super(r.jari);
}
public SetengahLingkaran() { this(r: 0); }

public double luas() { return 0.5*super.luas(); }

public double keliling() { return 0.5*super.keliling(); }

public void cetak() {
	System.out.println("Luas Setengah Lingkaran : "+luas());
	System.out.println("Keliling Setengah Lingkaran: "+keliling());
	}
}