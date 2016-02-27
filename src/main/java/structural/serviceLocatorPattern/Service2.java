package structural.serviceLocatorPattern;

/**
 * Created by tianhai on 27/02/16 for the project DesignPatterns.
 */
public class Service2 implements Service {
    public void execute() {
        System.out.println("Executing Service2");
    }

    public String getName() {
        return "Service2";
    }
}
