import ServiceInjectors.EmailServiceInjector;
import serviceconsumers.ServiceConsumer;

/**
 * Created by jigneshkakkad on 1/07/2016.
 */
public class SampleClient {

    public static void main(String[] args) {
        SampleClient client = new SampleClient();
        client.sendMessage();
    }

    private void sendMessage(){
        ServiceConsumer service = new EmailServiceInjector().getServiceConsumer();
        service.processRequest("TestRequest");
    }
}
