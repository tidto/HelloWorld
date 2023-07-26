package co.yedam.boardpkg;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import oracle.net.aso.l;

public class BoardApp implements BoardService {
	List<Board> boardList = new ArrayList<>();
	List<User> userList = new ArrayList<>();
	Scanner scn = new Scanner(System.in);

	Board brd = new Board();

	BoardApp() {
		readFromFile();
	}

	void readFromFile() {
		try {
			FileReader fr1 = new FileReader("c:/Temp/userList.txt");
			FileReader fr2 = new FileReader("c:/Temp/boardList.txt");

			BufferedReader br = new BufferedReader(fr1);
			while (true) {
				String str = br.readLine();
				if (str == null)
					break;
				String[] data = str.split(" ");
				userList.add(new User(data[0], data[1], data[2]));
			}
			br = new BufferedReader(fr2);
			while (true) {
				String str = br.readLine();
				if (str == null)
					break;
				String[] data = str.split(" ");
				boardList.add(new Board(Integer.parseInt(data[0]), data[1], data[2], data[3], data[4]));
			}
			br.close();
			fr2.close();
			fr1.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	void saveToFile() {
		try {
			FileWriter fw1 = new FileWriter("c:/Temp/userList.txt");
			FileWriter fw2 = new FileWriter("c:/Temp/boardList.txt");
			for (User user : userList) {
				fw1.write(user.getUserId() + " " + user.getUserName() + " " + user.getUserPw());
			}
			for (Board brd : boardList) {
				fw2.write(brd.getBrdNo() + " " + brd.getTitle() + " " + brd.getContent() + " " + brd.getWriter() + " "
						+ brd.getWriteDate());
			}
			fw1.flush();
			fw1.close();
			fw2.flush();
			fw2.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 로그인 기능.
	public boolean login(String id, String pw) {
		for (int i = 0; i < userList.size(); i++) {
			if (userList.get(i).getUserId().equals(id)//
					&& userList.get(i).getUserPw().equals(pw)) {
				return true;
			}
		}
		return false;
	}

	// 글등록.
	public boolean addBoard(Board board) {
		
		return boardList.add(board);
		
	}

	// 글수정.
	public boolean editBoard(Board board) {
		for (int i=0; i<userList.size(); i++) {
			if (boardList.get(i).getBrdNo() == board.getBrdNo()) {
				boardList.get(i).setTitle(board.getTitle());
				boardList.get(i).setContent(board.getContent());
				boardList.get(i).setWriteDate(board.getWriteDate());
				return true;
			}
		}
		return false;
	}

	// 글삭제.
	public boolean delBoard(int brdNo) {
		for (int i=0; i<userList.size(); i++) {
			if(boardList.get(i).getBrdNo() == brdNo) {
				boardList.remove(i);
				return true;
			}
		}
		return false;
	}

	// 글목록.
	public List<Board> boardList() {
		
		return boardList;
	}

	// 개인정보수정.
	public boolean modInfo(User user) {
		for(int i=0; i<userList.size(); i++) {
			if(userList.get(i).getUserId().equals(user.getUserId())//
				&& userList.get(i).getUserPw().equals(user.getUserPw())	) {
				userList.get(i).setUserPw(user.getUserPw());
				return true;
			}
		}
		return false;
	}

}
