package business.businessDelegate;

public class JMSService implements BusinessService {

    public void doProcessing() {
        System.out.println("Processing task by invoking JMS Service");
    }
}