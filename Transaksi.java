class Transaksi{

  String barang;
  int harga;
  int jumlah;
  int diskon;

  public void setTransaksi(String barang, int harga, int jumlah, int diskon){
    this.barang = barang;
    this.harga = harga;
    this.jumlah = jumlah;
    this.diskon = diskon;
  }
  public void tampil(){
	  System.out.println("	MASUKKAN DATA BERIKUT");
	System.out.println("Nama Pembeli	:Novit Saputri");
    System.out.println("Nama Barang 	:"+barang);
    System.out.println("Harga Barang	:"+harga);
    System.out.println("Jumlah Barang	:"+jumlah);
    System.out.println("Diskon Toko%	:"+diskon);
    System.out.println(" ");
    System.out.println("	NOTA BELANJA");
    System.out.println("Nama Barang	: Sabun Cuci");
    System.out.println("Total Harga	: RP.128.000");
    System.out.println("Total Bayar	: Rp.122.880");

  }

}

