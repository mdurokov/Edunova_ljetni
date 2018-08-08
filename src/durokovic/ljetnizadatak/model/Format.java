
package durokovic.ljetnizadatak.model;

/**
 * @author Mata
 */
public class Format {
    // INIT VARS
    private int id;
    private String name;
    
    // CONSTRUCTORS
    public Format(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Format() {
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
    public String toString() {
        return String.format
            ("Format [id=%s, name=%s]",  id, name);
    
    } 
}
