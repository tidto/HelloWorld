package co.yedam.collect.board;

import java.util.ArrayList;
import java.util.List;

public class BoardApp {
	
	List<Board> boards = new ArrayList<>();
	
	BoardApp (){
		boards.add(new Board(1,"제목1","내용1","user1"));
		boards.add(new Board(2,"제목2","내용2","user2"));
		boards.add(new Board(3,"제목3","내용3","admin"));
		boards.add(new Board(4,"제목4","내용4","user1"));

	}
	
	// 게시글 저장
	boolean addBoard(Board board) {
		
		return boards.add(board);
	}
	
	// 목록
	List<Board> boardList(){
		
		return boards;
	}
	
	// 조회
	Board getBoard(int boardNo) { //★★★★★★★★
		for(int i=0; i<boards.size(); i++) {
			if(boards.get(i).getBoardNo() == boardNo) {
				return boards.get(i);
			}
		}
		return null;
	}
	// 삭제
	boolean delBoard(int boardNo) {
		for(int i=0; i<boards.size(); i++) {
			if(boards.get(i) != null || boards.get(i).equals(boardNo) ) {
				boards.remove(i);
				return false;
			}
		}return true;
	}
}