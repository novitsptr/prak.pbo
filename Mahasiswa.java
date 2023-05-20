class Mahasiswa{

  String prodi;
  int nip;
  String angkatan;
  int nim;
  int semester;
  String jadwal;

  public void setMahasiswa(String prodi, int nip, String angkatan, int nim, int semester,String jadwal){
    this.prodi = prodi;
    this.nip = nip;
    this.angkatan = angkatan;
	this.nim = nim;
	this.semester = semester;
	this.jadwal = jadwal;
  }
  public void tampil(){
	System.out.println("	KELAS DOSEN");
	System.out.println("Nama Dosen	:WAGITO");
    System.out.println("Prodi Jurusan 	:"+prodi);
    System.out.println("NIP Dosen 	:"+nip);
    System.out.println("Angkatan	:"+angkatan);
    System.out.println("==============================================================");
    System.out.println("	KELAS MAHASISWA");
    System.out.println("Nama Mahasiswa	:Novit Saputri");
	System.out.println("NIM Mahasiswa 	:"+nim);
	System.out.println("Prodi		:Sistem Informasi-02");
	System.out.println("Semester	:"+semester);
	System.out.println("==============================================================");
	System.out.println("	KELAS JADWAL MATAKULIAH");
	System.out.println("Jadwal		:"+jadwal);
	System.out.println("		:Pemrograman Web Server Side");
	System.out.println("		:Sistem Manajemen Basis Data");
	System.out.println("		:Praktikum Statistika Induktif");
	System.out.println("		:Bahasa Inggris 3");
	System.out.println("		:Metodologi Pengembangan Sistem Informasi");
	System.out.println("		:Digipreneur");
	System.out.println("		:Manajemen Konten");
	System.out.println("		:Manajemen Organisasi");

  }

}