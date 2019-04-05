package spring.chap03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MemberMainUsingSpring {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("chap03.xml");
		MemberRegisterService regService = ctx.getBean("memberRegisterService",MemberRegisterService.class);

		RegisterRequest req = new RegisterRequest();
		req.setEmail("gy8978@gmail.com");
		req.setPassword("3270");
		req.setName("young");

		regService.regist(req);
	}
}