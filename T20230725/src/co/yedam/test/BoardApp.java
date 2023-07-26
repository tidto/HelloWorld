package co.yedam.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardApp {

	List<Board> site = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	BoardApp(){
		readFile();
	}
	
	
	public boolean register(Board board) {
		return site.add(board);
	}

	public boolean modify(Board board) {
		for (int i=0; i<site.size(); i++) {
			if (site.get(i).getBrdNo() == board.getBrdNo()) {
				site.get(i).setTitle(board.getTitle());
				site.get(i).setContents(board.getContents());
				return true;
			}
		}
		return false;
	}

	public void search(int brdNo) {
		for (int i=0; i<site.size(); i++) {
			if(site.get(i).getBrdNo() == brdNo) {
				site.get(i);
			}
		}
	}

	public void remove(int brdNo) {
		for (int i=0; i<site.size(); i++) {
			if(site.get(i).getBrdNo() == brdNo) {
				site.remove(i);
			}
		}
	}

	public List<Board> list() {
		return site;
	}

	void readFile() {
		try {
			FileReader fr = new FileReader("c:/Temp/boardList.txt");
			BufferedReader br = new BufferedReader(fr);
			
			while (true) {
				String str = br.readLine();
				if (str == null)
					break;
				String[] data = str.split(" ");
				site.add(new Board(Integer.parseInt(data[0]), data[1], data[2], data[3], data[4]));
			}
			br.close();fr.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	void saveFile() {
		try {
			FileWriter fw = new FileWriter("c:/Temp/boardList.txt");
			
			for (Board brd : site) {
				fw.write(brd.getBrdNo() + " " + brd.getTitle() + " " + brd.getContents() + " " + brd.getWriter() + " "
						+ brd.getDate());
			}
			fw.flush();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
