/**
 * This interface calculates unit conversions
 * @author Isabella Garza
 */
 


interface unitConversions{
    /**
 * This method makes the current unit to the unit provided
 * @param currentUnit represents the starting unit
 * @author Isabella Garza
 */
void inputCurrentUnits(String currentUnit);
/**
 * This method makes the conversion unit to the unit provided
 * @param conversionUnit represents the unit you want to convert to
 * @author Isabella Garza
 */
void InputConversionUnits(String conversionUnit);
/**
 * This interface calculates unit conversions
 * @param num is the amount of the current unit
 * @return the amount of the converted unit
 * @author Isabella Garza
 */
double calculateConversion(double num);
/**
 * This interface calculates unit conversions
 * @return writes the amount of the converted unit with the converted unit
 * @author Isabella Garza
 */
String conversionWithUnits();
/**
 * This interface calculates unit conversions
 * @return the current unit
 * @author Isabella Garza
 */
String getCurrentUnit();
/**
 * This interface calculates unit conversions
 * @return the conversion unit 
 * @author Isabella Garza
 */
String getConversionUnit();
}