package co.cocoball.exe.notice.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.cocoball.exe.common.ViewResolve;
import co.cocoball.exe.notice.service.NoticeService;
import co.cocoball.exe.notice.service.NoticeVO;
import co.cocoball.exe.notice.serviceImpl.NoticeServiceImpl;

@WebServlet("/noticepage.do")
public class NoticePage extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    public NoticePage() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		NoticeService dao = new NoticeServiceImpl();
		List<NoticeVO> notices = new ArrayList<NoticeVO>();
		
		notices = dao.noticeSelectList();
		request.setAttribute("notices", notices);

		String viewname = "notice/noticepage";
		ViewResolve.forward(request, response, viewname);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
