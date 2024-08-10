package max.bank;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import max.SessionUtility;

public class BankDAO {

	public String getBankDetail(String acc)
	{
		Session s = SessionUtility.getSession();
		Transaction tx = s.beginTransaction();
		Criteria cr = s.createCriteria(BankBean.class);
		  cr.add(Restrictions.eq("acc", acc));
		  List<BankBean> list= cr.list();
		  tx.commit();
		  return list.get(0).getName();
	}
}
