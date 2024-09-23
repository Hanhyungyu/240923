package assembler;

import chap03.ChangepasswordService;
import chap03.MemberDao;
import chap03.MemberRegisterService;

public class Assembler {
	private MemberDao memberDao;
	private MemberRegisterService regSvc;
	private ChangepasswordService pwdSvc;
	
	public Assembler() {
		memberDao=new MemberDao();
		regSvc=new MemberRegisterService(memberDao);
		pwdSvc=new ChangepasswordService();
		pwdSvc.setMemberDao(memberDao);
	}
	public MemberDao getMemberDao() {
		return memberDao;
	}
	public MemberRegisterService getMemberRegisterService() {
		return regSvc;
	}
	public ChangepasswordService getChangepasswordService() {
		return pwdSvc;
	}
}
