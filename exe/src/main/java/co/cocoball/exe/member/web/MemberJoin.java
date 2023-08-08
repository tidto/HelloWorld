package co.cocoball.exe.member.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import co.cocoball.exe.common.ViewResolve;
import co.cocoball.exe.member.service.MemberService;
import co.cocoball.exe.member.service.MemberVO;
import co.cocoball.exe.member.serviceImpl.MemberServiceImpl;

@WebServlet("/memberjoin.do")
public class MemberJoin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MemberJoin() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberService dao = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		String saveDir = request.getServletContext().getRealPath("attech/");
		int sizeLimit = 100*1024*1024;
		
		MultipartRequest multi = new MultipartRequest(request, 
												      saveDir, 
													  sizeLimit, 
													  "utf-8", 
													  new DefaultFileRenamePolicy());
		String originalFileName = multi.getOriginalFileName("file");
		if(originalFileName != null) {
			String fileName = multi.getFilesystemName("file");
			vo.setMemberImg(fileName);
		}
		
		vo.setMemberId(multi.getParameter("memberId"));
		vo.setMemberPassword(multi.getParameter("memberPassword"));
		vo.setMemberName(multi.getParameter("memberName"));
		vo.setMemberTel(multi.getParameter("memberTel"));
		vo.setMemberAddress(multi.getParameter("memberAddress"));
		
		int add = dao.memberInsert(vo);
		
		if(add != 0) {
			request.setAttribute("message", vo.getMemberName()+ "님 가입을 축하드립니다.");
		}else {
			request.setAttribute("message", "가입에 실패하셨습니다.");
		}
		String viewName = "member/membermessage";
		ViewResolve.forward(request, response, viewName);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		doGet(request, response);
	}
}
