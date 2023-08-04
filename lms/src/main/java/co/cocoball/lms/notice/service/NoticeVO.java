package co.cocoball.lms.notice.service;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class NoticeVO {
	private int boardId;
	private String boardWriter;
	private String memberName;
	private String boardSubject;
	private Date boardDate;
	private int boardHit;
	
}
