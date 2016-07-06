package anotherExample;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Created by jigneshkakkad on 6/07/2016.
 */
public class ResourceManagmentClient {
    public static void main(String[] args) {

        Injector injector = Guice.createInjector(new ModuleConfig());
        ResourceStore resourceStore = injector.getInstance(ResourceStore.class);

        Resource resource = new Resource(5, "Test");

        resourceStore.save(resource);

        System.out.println((resourceStore.get(5)).toString());

        System.out.println(resourceStore.exists(5));

    }
}
