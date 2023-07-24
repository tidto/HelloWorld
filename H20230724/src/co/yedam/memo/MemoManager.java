package co.yedam.memo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemoManager {
	
	Scanner scn = new Scanner(System.in);
	List<Memo> memoStorage = new ArrayList<>();
	
	public MemoManager() {
		readFromFile();
	}
	
	// 메뉴출력
	public void printMemu(){	
		System.out.println("1.등록 2.검색 3.삭제 4.종료");
		System.out.print("선택>> ");
	}
	
	private int getNextNo() {
		int no = 0;
		for(int i=0; i<memoStorage.size(); i++) {
			if(memoStorage.get(i).getNo() > no) {
				no = memoStorage.get(i).getNo();
			}
		}
		return no + 1;
	}
	
	//등록
	public void inpoutDate() {
		int no = getNextNo();
		System.out.print("날짜>> ");
		String date = scn.nextLine();
		System.out.print("내용>> ");
		String content = scn.nextLine();
		
		Memo memo = null;
		if(date.isEmpty()) {
			memo = new Memo(no, content);
		}else {
			memo = new Memo(no, date, content);
		}	
		
		if(memoStorage.add(memo)) {
			System.out.println("등록 완");
		}else {
			System.out.println("오류");
		}
	}// end of inputData();
	
	// 검색
	public void searchData() {
		System.out.print("날짜>> ");
		String date = scn.nextLine();
		// 입력된 날짜의 메모를 출력
		for(int i=0; i<memoStorage.size(); i++) {
//			System.out.println(memoStorage.get(i));
			if(date.equals(memoStorage.get(i).getDate())) {
				System.out.println(memoStorage.get(i));		
			}else {
				System.out.println("존재하지 않는 메모...");
				continue;
			}
		}
		
	}
	
	// 삭제
	public void deleteData() {
		System.out.println("번호>> ");
		int num = Integer.parseInt(scn.nextLine());
		for(int i=0; i<memoStorage.size(); i++) {
			if(num == memoStorage.get(i).getNo()) {
				memoStorage.remove(i);
				System.out.println("삭제 완료");
			}else {
				System.out.println("존재하지 않는 메모...");
				continue;
			}
		}
	
			
	}
	
	
	public void stareToFile() {
		//출력스트림 객체
		FileOutputStream fos;
		try {
			fos = new FileOutputStream("c:/Temp/memo.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			fos.flush();fos.close();
			oos.flush();oos.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void readFromFile() {
		// 입력스트림.
		FileInputStream fis;
		try {
			fis = new FileInputStream("c:/Temp/memo.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			ois.close();
			fis.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
