class Bayar{

  String transfer;
  int kredit;


  public void setBayar(String transfer, int kredit){
    this.transfer = transfer;
    this.kredit = kredit;

  }
  public void tampil(){
	System.out.println("Bayar Cash");
    System.out.println("Bayar Transfer	:"+transfer);
    System.out.println("Bayar Kredit	:"+kredit);


  }

}

