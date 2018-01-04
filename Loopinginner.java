class Loopinginner{
	public static void main(String[] args){
	for(int i = 0; i < 10; i++){
            for(int j = 0; j < 5; j ++){
                System.out.print("j["+ j + "], ");
            }
            System.out.println("i["+ i + "]"); // menampilakan perulangan nlai variabel 1 sampai 5 dan perulangan 1 sampai 10
        }

		System.out.println("=================================");
		for(int i = 0; i < 10; i++){
            if( i == 5 ){
                System.out.println("Sekarang ada di posisi ke 5");// perulangan variaber i yang bernilai 0 sampai 10 dengan hanya menampilkan yang memiliki nilai 5
            }
        }
        System.out.println("=================================");
          boolean isRepeat = true;
        if(isRepeat) {
            for(int i = 0; i < 10; i ++){
                System.out.println("Sekarang ada di index ke "+ i); // menampikan nilai 0 sampai berjumlah 10
            }
        }
          System.out.println("=================================");// menapilakan perulangan 10 sampai ke angka 1
   for(int i = 10 ; i > 0; i--){
            System.out.println("Indexnya "+ i);
        }

	}
}