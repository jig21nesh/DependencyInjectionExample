package ServiceInjectors;

import serviceconsumers.ServiceConsumer;

/**
 * Created by jigneshkakkad on 1/07/2016.
 */
public interface ServiceInjector {
    ServiceConsumer getServiceConsumer();
}
