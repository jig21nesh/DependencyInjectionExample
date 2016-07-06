package ServiceInjectors;

import serviceconsumers.ServiceConsumerImpl;
import serviceconsumers.ServiceConsumer;
import services.EmailService;

/**
 * Created by jigneshkakkad on 1/07/2016.
 */
public class EmailServiceInjector implements ServiceInjector {

    public ServiceConsumer getServiceConsumer() {
        return new ServiceConsumerImpl(new EmailService());
    }
}
