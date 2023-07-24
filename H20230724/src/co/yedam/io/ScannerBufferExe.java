package co.yedam.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;
//import java.io.BufferedReader;
//import java.io.FileInputStream;
//import java.io.InputStreamReader;

// 이름/주소/연락처 - > 3건 입렵 c:/Temp/address2.txt 저장
public class ScannerBufferExe {
	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		
		FileWriter fw = new FileWriter("c:/Temp/address2.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		while(true) {
			System.out.print("이름 주소 연락처 입력 >>");
			String str = scn.nextLine();
			if(str.equals("-1")) {
				break;
			}
			bw.write(str + "\n");
		}
		bw.flush();bw.close();
		fw.close();scn.close();
//		
//		FileInputStream fis = new FileInputStream("c:/Temp/address2.txt");
//		InputStreamReader isr = new InputStreamReader(fis);
//		BufferedReader br = new BufferedReader(isr);
		
	}
}
