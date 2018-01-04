class Deepifelse {
	public static void main(String[] args){
   
    String word  = "Halo";
    if (word.equals("halo")){  //statemen if untuk memriksa word memiliki data sama atau tidak dengan yg dibutuhkan dengan penggunaan equalse else akan menapilkan kondisi yang tidak terpenuhi
    	System.out.println("data sama");
    }else{
    	System.out.println("data beda!");
    }


     System.out.println("================================================");

      Integer bil =10;
      if(bil==10){
      	System.out.println("yang ini dieksekusi (==)");
      }else if((bil%2)== 0){
      	System.out.println("yang ini dieksekusi (%)");// Menapikan nilai bilangan yang memiliki nilai 10 sesuai kondi yang terpenuhi
      }else{
      System.out.println("Lain-lain");	
      }

	}
}

