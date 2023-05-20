public class Perusahaan {
	private String nmPerush;
	private String alamat;
	private Pegawai peg; //komposisi dengan relasi has-a
	public Perusahaan(){
		this.nmPerush="PT. Lancar Jaya";
		this.alamat="Yogyakarta";
		this.peg=new Pegawai();
		peg.setNama("Novit");
		peg.setJabatan("Manger");
		peg.setGaji("7500000");
}
public void cetakPerush(){
		System.out.println("Nama Perusahaan		:"+this.nmPerush);
		System.out.println("Alamat			:"+this.alamat);
		peg.cetakPegawai();
	}
}
