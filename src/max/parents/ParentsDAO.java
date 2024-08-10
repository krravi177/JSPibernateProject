package max.parents;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import max.SessionUtility;

public class ParentsDAO {
public List<SHGBean> viewDetail(int shgCode)
{
	  try {
		  Session s = SessionUtility.getSession();
			Transaction tx = s.beginTransaction();
			Criteria cr = s.createCriteria(SHGBean.class);
		   cr.add(Restrictions.eq("shgCode", shgCode));
		     tx.commit();
		     List<SHGBean> list= cr.list();
		      return list;
	} catch (Exception e) {
		e.printStackTrace();
	}
	return null;
}
	
	
	
	public boolean insertData(SHGBean shgBean)
	{
		try {
			Session s = SessionUtility.getSession();
			Transaction tx = s.beginTransaction();
			Integer i = (Integer)s.save(shgBean);
			tx.commit();
			 
			 if(i>0)
				 return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
}
