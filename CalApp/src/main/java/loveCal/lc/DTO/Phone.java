package loveCal.lc.DTO;

public class Phone {
    
    private String dialNumber;
    private String zipCodeNumbers;
    private String firstThreeNumbers;
    private String lastFourNumbers;
    
    public String getDialNumber() {
        return dialNumber;
    }
    public void setDialNumber(String dialNumber) {
        this.dialNumber = dialNumber;
    }
    public String getZipCodeNumbers() {
        return zipCodeNumbers;
    }
    public void setZipCodeNumbers(String zipCodeNumbers) {
        this.zipCodeNumbers = zipCodeNumbers;
    }
    public String getFirstThreeNumbers() {
        return firstThreeNumbers;
    }
    public void setFirstThreeNumbers(String firstThreeNumbers) {
        this.firstThreeNumbers = firstThreeNumbers;
    }
    public String getLastFourNumbers() {
        return lastFourNumbers;
    }
    public void setLastFourNumbers(String lastFourNumbers) {
        this.lastFourNumbers = lastFourNumbers;
    }
    
    @Override
    public String toString() {
        return  getDialNumber()+"-"+ getZipCodeNumbers()+ 
                "-"+getFirstThreeNumbers()+"-"+ getLastFourNumbers(); 
    }
    
    
    
    

}
