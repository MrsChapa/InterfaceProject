
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/

public class Main
{
    public static void main(String[] args) {
        Metric a = new Metric();
        Imperial b = new Imperial();
        
        a.inputCurrentUnits("millimeters");
        a.inputConversionUnits("centimeters");
        
        System.out.println(a.millimeterToCentimeter(20));
        System.out.println(a.conversionWithUnits());
        
        b.inputCurrentUnits("inches");
        b.inputConversionUnits("Feet");
        
        System.out.println(b.inchToFeet(26));
        System.out.println(b.conversionWithUnits());
        
        
    }
}
