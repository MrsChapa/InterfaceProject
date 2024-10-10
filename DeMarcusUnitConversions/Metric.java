public class Metric {
    
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
    
    // Convert millimeters to centimeters
    public double millimeterToCentimeter(double num) {
        double centimeters = num / 10.0;
        numberValue = centimeters;
        currentUnit = "centimeters";
        return centimeters;
    }

    // Convert millimeters to meters
    public double millimeterToMeter(double num) {
        double meters = num / 1000.0;
        numberValue = meters;
        currentUnit = "meters";
        return meters;
    }

    // Convert millimeters to kilometers
    public double millimeterToKilometer(double num) {
        double kilometers = num / 1000000.0;
        numberValue = kilometers;
        currentUnit = "kilometers";
        return kilometers;
    }

    // Convert centimeters to millimeters
    public double centimeterToMillimeter(double num) {
        double millimeters = num * 10.0;
        numberValue = millimeters;
        currentUnit = "millimeters";
        return millimeters;
    }

    // Convert centimeters to meters
    public double centimeterToMeter(double num) {
        double meters = num / 100.0;
        numberValue = meters;
        currentUnit = "meters";
        return meters;
    }
    
   // Convert centimeters to kilometers
    public double centimeterToKilometer(double num) {
        double kilometers = num / 100000.0;
        numberValue = kilometers;
        currentUnit = "kilometers";
        return kilometers;
    }

    // Convert meters to millimeters
    public double meterToMillimeter(double num) {
        double millimeters = num * 1000.0;
        numberValue = millimeters;
        currentUnit = "millimeters";
        return millimeters;
    }

    // Convert meters to centimeters
    public double meterToCentimeter(double num) {
        double centimeters = num * 100.0;
        numberValue = centimeters;
        currentUnit = "centimeters";
        return centimeters;
    }

    // Convert meters to kilometers
    public double meterToKilometer(double num) {
        double kilometers = num / 1000.0;
        numberValue = kilometers;
        currentUnit = "kilometers";
        return kilometers;
    }

    // Convert kilometers to millimeters
    public double kilometerToMillimeter(double num) {
        double millimeters = num * 1000000.0;
        numberValue = millimeters;
        currentUnit = "millimeters";
        return millimeters;
    }

    // Convert kilometers to centimeters
    public double kilometerToCentimeter(double num) {
        double centimeters = num * 100000.0;
        numberValue = centimeters;
        currentUnit = "centimeters";
        return centimeters;
    }

    // Convert kilometers to meters
    public double kilometerToMeter(double num) {
        double meters = num * 1000.0;
        numberValue = meters;
        currentUnit = "meters";
        return meters;
    }


}