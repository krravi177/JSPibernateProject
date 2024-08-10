package max.parents;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ParentsServlet")
public class ParentsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	 PrintWriter out = response.getWriter();
    	   String stCode = request.getParameter("stCode");
    	  String gname = request.getParameter("gname");
    	  String acc = request.getParameter("acc");
    	  String ifsc = request.getParameter("ifsc");
    	  SHGBean shgBean=new SHGBean();
    	  shgBean.setAcc(acc);
    	  shgBean.setGname(gname);
    	  shgBean.setIfsc(ifsc);
    	  shgBean.setStCode(stCode);
    	  String[] cname = request.getParameterValues("cname");
    	  String[] age = request.getParameterValues("age");
       String[] cadhar = request.getParameterValues("cadhar");
   
   List<MemberBean> l= new  ArrayList<MemberBean>();
    for(int i=0; i<cadhar.length;i++)
    {
    	 MemberBean mbean = new MemberBean();
    	 mbean.setAge(age[i]);
    	 mbean.setCadhar(cadhar[i]);
    	 mbean.setCname(cname[i]);
    	 l.add(mbean);
    	
    }
    
    shgBean.setMlist(l);
    
    if(new ParentsDAO().insertData(shgBean))
    {
    	out.println("Successfulll");
    }
    else
    {
    	out.println("un Successfulll");
    }
	}
      
}
