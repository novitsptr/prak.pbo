public class Pegawai {
	private String nama;
	private String jabatan;
	private String gaji;

	private String getJabatan() { return jabatan; }
	public void setJabatan(String jabatan) {	this.jabatan = jabatan; }
	public String getGaji() {	 return gaji; }
	public void setGaji(String gaji)  { this.gaji= gaji; }
	public String getNama()	{ return nama;	}
	public void setNama(String nama)	{ this.nama = nama; }

	public void cetakPegawai(){
		System.out.println("");
		System.out.println("Nama Pegawai		:"+this.nama);
		System.out.println("Jabatan			:"+this.jabatan);
		System.out.println("Gaji Pokok \t	:"+this.gaji);
	}
}
