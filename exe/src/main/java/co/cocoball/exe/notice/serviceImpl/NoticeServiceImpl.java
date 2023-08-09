package co.cocoball.exe.notice.serviceImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.cocoball.exe.common.DataSources;
import co.cocoball.exe.notice.mapper.NoticeMapper;
import co.cocoball.exe.notice.service.NoticeService;
import co.cocoball.exe.notice.service.NoticeVO;

public class NoticeServiceImpl implements NoticeService {
	private SqlSession sqlSession = DataSources.getInstance().openSession(true);
	private NoticeMapper map = sqlSession.getMapper(NoticeMapper.class);

	@Override
	public List<NoticeVO> noticeSelectList() {
		return map.noticeSelectList();
	}
	
	@Override
	public List<NoticeVO> noticeSelectList(String key, String val) {
		return map.noticeSelectList(key, val);
	}
	
	@Override
	public List<NoticeVO> noticeSearchList(String key, String val) {
		return map.noticeSelectList(key, val);
	}

	@Override
	public NoticeVO noticeSelect(NoticeVO vo) {
		noticeUpdateHit(vo.getNoticeId());
		return map.noticeSelect(vo);
	}

	@Override
	public int noticeInsert(NoticeVO vo) {
		return map.noticeInsert(vo);
	}

	@Override
	public int noticeUpate(NoticeVO vo) {
		return map.noticeUpate(vo);
	}

	@Override
	public int noticeDelete(NoticeVO vo) {
		return map.noticeDelete(vo);
	}
	@Override
	public void noticeUpdateHit(int id) {
		map.noticeUpdateHit(id);
	}

}
