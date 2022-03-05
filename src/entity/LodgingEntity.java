package entity;

public abstract class LodgingEntity {
    
    protected String lodgingName;
    protected String lodgingAdress;
    protected String lodgingCity;
    protected String lodgingManager;

    public LodgingEntity() {
    }

    public LodgingEntity(String lodgingName, String lodgingAdress, String lodgingCity, String lodgingManager) {
        this.lodgingName = lodgingName;
        this.lodgingAdress = lodgingAdress;
        this.lodgingCity = lodgingCity;
        this.lodgingManager = lodgingManager;
    }

    public String getLodgingName() {
        return lodgingName;
    }

    public void setLodgingName(String lodgingName) {
        this.lodgingName = lodgingName;
    }

    public String getLodgingAdress() {
        return lodgingAdress;
    }

    public void setLodgingAdress(String lodgingAdress) {
        this.lodgingAdress = lodgingAdress;
    }

    public String getLodgingCity() {
        return lodgingCity;
    }

    public void setLodgingCity(String lodgingCity) {
        this.lodgingCity = lodgingCity;
    }

    public String getLodgingManager() {
        return lodgingManager;
    }

    public void setLodgingManager(String lodgingManager) {
        this.lodgingManager = lodgingManager;
    }

    @Override
    public String toString() {
        return "LodgingEntity{" + "lodgingName=" + lodgingName + ", lodgingAdress=" + lodgingAdress + ", lodgingCity=" + lodgingCity + ", lodgingManager=" + lodgingManager + '}';
    }
    
    

}
