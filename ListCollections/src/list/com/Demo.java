package list.com;

public class Demo<CitationList, Vehicle> {
    
    private CitationList citaions;
    private Vehicle vehicleRecords;

    public CitationList getCitaions() {
        return citaions;
    }

    public void setCitaions(CitationList citaion) {
        this.citaions = citaion;
    }

    public Vehicle getVehicleRecords() {
        return vehicleRecords;
    }

    public void setVehicleRecords(Vehicle vehicleRecords) {
        this.vehicleRecords = vehicleRecords;
    }

}
