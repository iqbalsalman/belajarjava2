class Swichcase{

	public static void main(String[] args){ // menapilkan nilai 4 dari kondisi statemen yang terpenuhi
		Integer ip=4;
		switch (ip){
		case  4 :
		System.out.println("A"); 
		break;
		case  3 :
		System.out.println("B"); 
		break;	
		case  2 :
		System.out.println("c"); 
		break;
		case  1 :
		System.out.println("D"); 
		break;
		default : System.out.println("E"); 
	}

    System.out.println("======================================");
     Integer ips=2;
		switch (ips){
		case  4 :
		System.out.println("A"); 
		// break;
		case  3 :
		System.out.println("B");     // menapilakan kondisi case yang terpenuhi dan menapilakan statemen yang memberik break dibawah nilai kondisi yang terpenuhi
		break;	 
		case  2 :
		System.out.println("c"); 
		// break;
		case  1 :
		System.out.println("D"); 
		break;
		default : System.out.println("E"); 
	}

	}
	
}