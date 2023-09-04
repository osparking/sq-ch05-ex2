import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import beans.service.CommentService;
import beans.service.UserService;
import config.ProjectConfig;

public class Main {

	public static void main(String[] args) {
		var c = new AnnotationConfigApplicationContext(ProjectConfig.class);
		var serv1 = c.getBean("commentService", CommentService.class);
		var serv2 = c.getBean("userService", UserService.class);
		System.out.println(
				"two repo same : " + (serv1.getRepository() == serv2.getRepository()));
	}

}
