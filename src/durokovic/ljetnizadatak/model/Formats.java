
package durokovic.ljetnizadatak.model;

/**
 * @author Mata
 */
public class Formats {
    // INIT VARS
    private int id;
    private String name;
    
    // CONSTRUCTORS
    public Formats(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Formats() {
    }
    //  END CONSTRUCTORS
    
    //  GETTERS SETTERS

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //  END GETTERS SETTERS
    
    @Override
    public String toString(){
        return name;
    }
}
