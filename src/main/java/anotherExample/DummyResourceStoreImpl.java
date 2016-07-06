package anotherExample;

import com.google.inject.Singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jigneshkakkad on 6/07/2016.
 */

@Singleton
public class DummyResourceStoreImpl implements ResourceStore {

    private final Map<Integer,Resource> dummyStorage;

    public DummyResourceStoreImpl(){
        dummyStorage = new HashMap<Integer, Resource>();
    }

    public boolean exists(Integer id) {
        return dummyStorage.containsKey( id );
    }

    public void save(Resource resource) {
        if(resource.getId() != null){
            dummyStorage.put(resource.getId(), resource);
        }
    }

    public Resource get(Integer id) {
        return dummyStorage.get(id);
    }
}
