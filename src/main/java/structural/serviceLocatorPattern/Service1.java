package structural.serviceLocatorPattern;

/**
 * Created by tianhai on 27/02/16 for the project DesignPatterns.
 */
public class Service1 implements Service {
    public void execute() {
        System.out.println("Executing Service1");
    }

    public String getName() {
        return "Service1";
    }
}
