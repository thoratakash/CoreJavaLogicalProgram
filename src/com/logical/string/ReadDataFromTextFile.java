package com.logical.string;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromTextFile {

	public static void main(String[] args) throws IOException {
		
		//Approach01 (Using FileReader BufferReader)
		/*FileReader fr=new FileReader("C:\\Software\\KeyboardSymbol.txt");
		BufferedReader br=new BufferedReader(fr);
		String str;
		while( (str = br.readLine())!= null) {
			System.out.println(str);
		}
		br.close();
		*/
		
		//Approach02 : Using File & Scanner
		
		/*File file =new File("C:\\Software\\KeyboardSymbol.txt");
		
		Scanner sc=new Scanner(file);
		
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		sc.close();
		
		*/
		//Approach03
		File file =new File("C:\\Software\\KeyboardSymbol.txt");
		Scanner sc=new Scanner(file);
		sc.useDelimiter("\\Z");    
		System.out.println(sc.next());
		sc.close();

	}//main

}//class
