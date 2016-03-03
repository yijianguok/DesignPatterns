package business.businessDelegate;

public class EJBService implements BusinessService {

    public void doProcessing() {
        System.out.println("Processing task by invoking EJB Service");
    }
}