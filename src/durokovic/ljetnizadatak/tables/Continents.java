
package durokovic.ljetnizadatak.tables;

import java.math.BigInteger;

/**
 * @author Mata
 */
public class Continents {
    //  INIT VARS
    private int id;
    private String name;
    private String recordName;
    private BigInteger latitude;
    private BigInteger longitude;
    private int zoom;
    //  END INIT VARS
    
    //  CONSTRUCTORS
    public Continents(int id, String name, String recordName, BigInteger latitude, BigInteger longitude, int zoom) {
        this.id = id;
        this.name = name;
        this.recordName = recordName;
        this.latitude = latitude;
        this.longitude = longitude;
        this.zoom = zoom;
    }

    public Continents() {
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

    public String getRecordName() {
        return recordName;
    }

    public void setRecordName(String recordName) {
        this.recordName = recordName;
    }

    public BigInteger getLatitude() {
        return latitude;
    }

    public void setLatitude(BigInteger latitude) {
        this.latitude = latitude;
    }

    public BigInteger getLongitude() {
        return longitude;
    }

    public void setLongitude(BigInteger longitude) {
        this.longitude = longitude;
    }

    public int getZoom() {
        return zoom;
    }

    public void setZoom(int zoom) {
        this.zoom = zoom;
    }
    //  END GETTERS SETTERS
    
    @Override
    public String toString() {
        return getName();
    }   
}
