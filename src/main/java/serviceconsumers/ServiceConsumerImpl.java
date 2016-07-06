package serviceconsumers;

import services.BackendService;

/**
 * Created by jigneshkakkad on 1/07/2016.
 */
public class ServiceConsumerImpl implements ServiceConsumer {
    private BackendService service;
    public ServiceConsumerImpl(BackendService service){
        this.service = service;
    }
    public void processRequest(String request) {
        System.out.println("This is a test");
        System.out.println("Response - "+service.getResponse(""));
    }
}
