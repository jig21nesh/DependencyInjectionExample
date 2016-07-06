package anotherExample;

import com.google.inject.AbstractModule;

/**
 * Created by jigneshkakkad on 6/07/2016.
 */
public class ModuleConfig extends AbstractModule {

    protected void configure() {
        bind(ResourceStore.class).to(DummyResourceStoreImpl.class);
    }
}
