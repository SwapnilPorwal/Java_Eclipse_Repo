package FileHandlingInJava;

import java.io.File;

public class Program_006_CheckDrive {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File[] roots = File.listRoots();
		  System.out.println("Found " + roots.length + " roots " );
		  for( int i = 0 ; i < roots.length ; i++ ){
		    System.out.println( roots[i].toString() + " exists= " + roots[i].exists() +" Size : "+roots[i].getTotalSpace());
		    
		  }
		  System.out.println("Done" );
	}
}
