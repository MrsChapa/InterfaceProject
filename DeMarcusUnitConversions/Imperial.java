public class Imperial{
    
    private String currentUnit;
    private String conversionUnit;
    private double numberValue;
    
    public void inputCurrentUnits(String currentUnit2){
        currentUnit = currentUnit2;
    }
    
    
    public void inputConversionUnits(String conversionUnit2){
        conversionUnit = conversionUnit2;
    }
    public String getCurrentUnit(){
        return currentUnit;
    }
    
    public String getConversionUnit(){
        return conversionUnit;
    }
    
    public String conversionWithUnits(){
        return numberValue + " " + currentUnit;
    }
    
    public double inchToFeet(double num){
        double feet = num/12;
        numberValue = feet;
        currentUnit = "feet";
        return feet;
    }
   // Convert inches to yards
    public double inchToYard(double num) {
        double yards = num / 36.0;
        numberValue = yards;
        currentUnit = "yards";
        return yards;
    }

    // Convert inches to miles
    public double inchToMile(double num) {
        double miles = num / 63360.0;
        numberValue = miles;
        currentUnit = "miles";
        return miles;
    }

    // Convert feet to inches
    public double feetToInch(double num) {
        double inches = num * 12.0;
        numberValue = inches;
        currentUnit = "inches";
        return inches;
    }

    // Convert feet to yards
    public double feetToYard(double num) {
        double yards = num / 3.0;
        numberValue = yards;
        currentUnit = "yards";
        return yards;
    }

    // Convert feet to miles
    public double feetToMile(double num) {
        double miles = num / 5280.0;
        numberValue = miles;
        currentUnit = "miles";
        return miles;
    }

    // Convert yards to inches
    public double yardToInch(double num) {
        double inches = num * 36.0;
        numberValue = inches;
        currentUnit = "inches";
        return inches;
    }

    // Convert yards to feet
    public double yardToFeet(double num) {
        double feet = num * 3.0;
        numberValue = feet;
        currentUnit = "feet";
        return feet;
    }

    // Convert yards to miles
    public double yardToMile(double num) {
        double miles = num / 1760.0;
        numberValue = miles;
        currentUnit = "miles";
        return miles;
    }

    // Convert miles to inches
    public double mileToInch(double num) {
        double inches = num * 63360.0;
        numberValue = inches;
        currentUnit = "inches";
        return inches;
    }

    // Convert miles to feet
    public double mileToFeet(double num) {
        double feet = num * 5280.0;
        numberValue = feet;
        currentUnit = "feet";
        return feet;
    }

    // Convert miles to yards
    public double mileToYard(double num) {
        double yards = num * 1760.0;
        numberValue = yards;
        currentUnit = "yards";
        return yards;
    }
}
