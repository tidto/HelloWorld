package co.yedam.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharacterConvertStreamExe {
	public static void main(String[] args) {
		try {
			write("문자열보조 스트림 테스트");
			String str = read();
			System.out.println(str);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void write(String str) throws Exception {
		// 바이트 기반 스트림. -> 문자열 기반 스트림 변경보조 스트림.
		FileOutputStream fos = new FileOutputStream("c:/Temp/test.txt"); 
		Writer writer = new OutputStreamWriter(fos); // 보조스트림
		writer.write(str);
		writer.flush();
		writer.close();
	}
	
	public static String read() throws Exception {
		FileInputStream fis = new FileInputStream("c:/Temp/test.txt");
		Reader reader = new InputStreamReader(fis); // 보조스트림
		char[] buf = new char[100]; // 문자:34개
		int chrNum = reader.read(buf); // 파일의 끝: -1 , 읽어들인 문자크기.
		System.out.println("chaNum: " + chrNum);
		String data = new String(buf, 0, chrNum);
		fis.close();
		reader.close();
		return data;
	}
}
