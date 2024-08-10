package max.parents;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MS")
public class ModifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String shgCode = request.getParameter("shgCode");
		ParentsDAO parentsDAO=new ParentsDAO();
		List<SHGBean> list = parentsDAO.viewDetail(Integer.parseInt(shgCode));
		request.setAttribute("lst", list);
		request.getRequestDispatcher("modifyDetail.jsp").forward(request, response);
	}

}
