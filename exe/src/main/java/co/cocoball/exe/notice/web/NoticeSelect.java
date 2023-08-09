package co.cocoball.exe.notice.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.cocoball.exe.common.ViewResolve;
import co.cocoball.exe.notice.service.NoticeService;
import co.cocoball.exe.notice.service.NoticeVO;
import co.cocoball.exe.notice.serviceImpl.NoticeServiceImpl;

@WebServlet("/noticepost.do")
public class NoticeSelect extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public NoticeSelect() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		NoticeService dao = new NoticeServiceImpl();
		NoticeVO vo = new NoticeVO();
		vo.setNoticeId(Integer.valueOf(request.getParameter("noticeId")));
		 
		vo=dao.noticeSelect(vo);
		request.setAttribute("n", vo);
		String viewName = "notice/noticepost";
		ViewResolve.forward(request, response, viewName);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
