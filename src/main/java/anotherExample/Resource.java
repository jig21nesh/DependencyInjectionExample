package anotherExample;

/**
 * Created by jigneshkakkad on 6/07/2016.
 */
public class Resource {
    private Integer id;
    private String name;

    public Resource(Integer id, String name){
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("ID  ").append(this.getId()).append(" Name ").append(this.getName());
        return sb.toString();
    }

}
