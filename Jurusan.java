class Jurusan{

  String prodi;
  int nim;
  int semester;

  public void setJurusan(String prodi, int nim, int semester){
    this.prodi = prodi;
    this.nim = nim;
    this.semester = semester;
  }
  public void tampil(){
	System.out.println("Nama Mahasiswa	:Novit Saputri");
    System.out.println("Prodi Jurusan 	:"+prodi);
    System.out.println("NIM Mahasiswa 	:"+nim);
    System.out.println("Semester	:"+semester);

  }

}

