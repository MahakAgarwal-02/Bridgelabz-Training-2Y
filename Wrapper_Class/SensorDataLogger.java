package Wrapper_Class;

class SensorDataLogger {

    public static void logTemperature(double temp) {
        Double tempObject = temp;
        System.out.println("Logged (auto-boxed) temperature: " + tempObject);
    }

    public static void readTemperature(Double tempObject) {
        double tempValue = tempObject;
        System.out.println("Read (auto-unboxed) temperature: " + tempValue);
    }

    public static void main(String[] args) {
        double primitiveTemp = 36.7;

        Double wrapperTemp = 40.2;

        logTemperature(primitiveTemp);

        readTemperature(wrapperTemp);
    }
}
