class Loopbreak{
	public static void main(String[] args){
		for(int i = 0; i < 100; i++){
		if(i==5)  break;
		System.out.println("Saya berada di index ke "+i);  // menapilakan perulangan 0 sampai 100 dan akan berhenti di anggka 4 karena di break di jumlah ke 5
	}
	System.out.println("======================================");

	for(int x = 0 ; x < 3 ; x++){
            if(x == 2) continue;
            System.out.println("Saya berada di index ke " + x); //menampilkan perulangan 0 sampai ke jumalah 3 tapi melewakan nilai 2 dengan continue
        }

 }
}