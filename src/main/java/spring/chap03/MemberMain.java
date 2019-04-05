package spring.chap03;

public class MemberMain {

	public static void main(String[] args) {
		MemberDao memberDao = new MemberDao();
		MemberRegisterService regService = new MemberRegisterService(memberDao);

		RegisterRequest req = new RegisterRequest();
		req.setEmail("gy8978@gmail.com");
		req.setPassword("3270");
		req.setName("young");

		regService.regist(req);
	}
}