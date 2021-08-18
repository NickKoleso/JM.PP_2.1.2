import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld secondBean = (HelloWorld) applicationContext.getBean("helloworld");

        boolean firstComparison = bean == secondBean;
        System.out.println(firstComparison);

        Cat one = (Cat) applicationContext.getBean("cat");
        Cat two = (Cat) applicationContext.getBean("cat");
        boolean secondComparison = one == two;
        System.out.println(secondComparison);


    }
}