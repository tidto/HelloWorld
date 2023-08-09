package co.cocoball.exe.notice.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import co.cocoball.exe.notice.service.NoticeVO;

public interface NoticeMapper {
	List<NoticeVO> noticeSelectList();
	List<NoticeVO> noticeSelectList(@Param("key") String key, @Param("val") String val);
	List<NoticeVO> noticeSearchList(@Param("key") String key, @Param("val") String val);

	NoticeVO noticeSelect(NoticeVO vo);
	int noticeInsert(NoticeVO vo);
	int noticeUpate(NoticeVO vo);
	int noticeDelete(NoticeVO vo);
	void noticeUpdateHit(int id);
}
