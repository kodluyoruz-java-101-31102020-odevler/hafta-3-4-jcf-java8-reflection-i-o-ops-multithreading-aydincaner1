package soru3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {
	
	public static void main(String[] args) {
		
	    Scanner scan = new Scanner(System.in);
	    Map<Integer,Ogrenci> ogrenciler = new HashMap<>();
	     
		System.out.println("Ögrenci no girin :");
		int ogr_no = scan.nextInt();
		System.out.println("Ögrenci adý girin :");
		String ogr_name = scan.next();
		System.out.println("enter a department");
		String bolum =scan.next();
		System.out.println("enter a student age");
		String ogr_yas =scan.next();

		ogrenciler.put(ogr_no, new Ogrenci(ogr_name, ogr_name, ogr_yas, bolum));
		System.out.println(ogrenciler);
		scan.close();
												}
}
