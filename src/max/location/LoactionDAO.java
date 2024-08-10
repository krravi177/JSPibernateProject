package max.location;

import java.util.List;

import max.SessionUtility;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class LoactionDAO {
	public List<State> getStateList() {
		Session s = SessionUtility.getSession();
		Transaction tx = s.beginTransaction();
		Criteria cr = s.createCriteria(State.class);
		cr.addOrder(Order.asc("stName"));
		tx.commit();
		List<State> list = cr.list();
		return list;
	}

	public String getStateNameByCode(int stCode) {
		Session s = SessionUtility.getSession();
		Transaction tx = s.beginTransaction();
		Criteria cr = s.createCriteria(State.class);
		cr.add(Restrictions.eq("stCode", stCode));
		tx.commit();
		List<State> list = cr.list();
		return list.get(0).getStName();
	}

}
