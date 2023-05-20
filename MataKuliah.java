class MataKuliah{

  String prodi;
  int nip;
  String angkatan;
  int nim;
  int semester;
  String matakuliah;

  public void setMataKuliah(String prodi, int nip, String angkatan, int nim, int semester, String matakuliah){
    this.prodi = prodi;
    this.nip = nip;
    this.angkatan = angkatan;
	this.nim = nim;
	this.semester = semester;
	this.matakuliah = matakuliah;
  }
  public void tampil(){
    System.out.println("=============================================");
	    System.out.println("	KELAS DOSEN");
	    System.out.println("Nama Dosen	:WAGITO");
	    System.out.println("NIP Dosen 	:"+nip);
	    System.out.println("Angkatan	:"+angkatan);
	    System.out.println("=============================================");
	    System.out.println("	KELAS MAHASISWA");
	    System.out.println("Nama Mahasiswa	:Novit Saputri");
		System.out.println("NIM Mahasiswa 	:"+nim);
		System.out.println("Semester	:"+semester);
		System.out.println("Prodi Jurusan 	:"+prodi);
	System.out.println("=============================================");
	System.out.println("	KELAS MATAKULIAH");
		System.out.println("Mata Kuliah	:"+matakuliah);

  }

}