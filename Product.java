class Product{

  String barang;
  int harga;
  int ukuran;

  public void setProduct(String barang, int harga, int ukuran){
    this.barang = barang;
    this.harga = harga;
    this.ukuran = ukuran;
  }
  public void tampil(){
	System.out.println("Nama Pembeli	:Novit Saputri");
    System.out.println("Nama Barang 	:"+barang);
    System.out.println("Harga Barang	:"+harga);
    System.out.println("Ukuran Barang	:"+ukuran);

  }

}

