package max.parents;

import java.util.List;

public class SHGBean {
	 private int shgCode;
private String stCode;
private String gname;
private String acc;
private String ifsc;
List<MemberBean> mlist;

public int getShgCode() {
	return shgCode;
}
public void setShgCode(int shgCode) {
	this.shgCode = shgCode;
}

public List<MemberBean> getMlist() {
	return mlist;
}
public void setMlist(List<MemberBean> mlist) {
	this.mlist = mlist;
}
public String getStCode() {
	return stCode;
}
public void setStCode(String stCode) {
	this.stCode = stCode;
}
public String getGname() {
	return gname;
}
public void setGname(String gname) {
	this.gname = gname;
}
public String getAcc() {
	return acc;
}
public void setAcc(String acc) {
	this.acc = acc;
}
public String getIfsc() {
	return ifsc;
}
public void setIfsc(String ifsc) {
	this.ifsc = ifsc;
}


}
