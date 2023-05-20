class Garis //tinggal melengkapi konstruktor
{
	Titik t1;
	Titik t2;

public Garis() //default milik garis
{
	t1=new Titik();
	t2=new Titk();
}

public Garis(Titik t10, Titik t20) //copy milik garis
{
	t1=new Titik(t10.x, t10.y);
	t2=new Titik(t20.x, t20.y);
}

public void info()
{
	System.out.println("Koordinat garisnya adalah");
	System.out.prinltn("titik 1 ("+t1.x+" , "+t1.y+")");
	System.out.println("titik 2 ("+t2.x+" , "+t2.y+")");
}
}