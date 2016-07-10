import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.ShapeService;

/**
 * Created by Tomek on 2016-06-06.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        ShapeService shapeService = applicationContext.getBean("shapeService", ShapeService.class);
        shapeService.getCircle().setName("Big circle");
        System.out.println(shapeService.getCircle().getName());

    }
}
