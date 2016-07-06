package anotherExample;

/**
 * Created by jigneshkakkad on 6/07/2016.
 */
public interface ResourceStore {
    boolean exists(Integer id);
    void save(Resource resource);
    Resource get(Integer id);
}
