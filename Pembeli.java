class Pembeli{

  String barang;
  int harga;
  int jumlah;

  public void setPembeli(String barang, int harga, int jumlah){
    this.barang = barang;
    this.harga = harga;
    this.jumlah = jumlah;
  }
  public void tampil(){
	System.out.println("Nama Pembeli	:Novit Saputri");
    System.out.println("Nama Barang 	:"+barang);
    System.out.println("Harga Barang	:"+harga);
    System.out.println("Jumlah Barang	:"+jumlah);

  }

}

