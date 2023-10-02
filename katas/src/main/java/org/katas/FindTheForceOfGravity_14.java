package org.katas;

public class FindTheForceOfGravity_14 {
    public static void main() {
        System.out.println(solution(new double[] {1000, 1000, 100}, new String[] {"g", "kg", "m"}));
        System.out.println(solution(new double[] {1000, 1000, 100}, new String[] {"kg", "kg", "m"}));
    }


    public static double solution(double[] arrVal, String[] arrUnit) {
        double G=6.67e-11;
        double mass1 = convertIntoKg(arrVal[0],arrUnit[0]);
        double mass2 = convertIntoKg(arrVal[1], arrUnit[1]);
        double distance = convertIntoMeters(arrVal[2], arrUnit[2]);
        double formula = (G*mass1*mass2)/Math.pow(distance, 2);
        return formula;
//        return 6.67e-11(arrVal[0]massUnits.get(arrUnit[0])arrVal[1]massUnits.get(arrUnit[1]))/(arrVal[2]arrVal[2]distancenits.get(arrUnit[2])*distancenits.get(arrUnit[2]));
    }

    private static double convertIntoKg(double number, String unit){
        double response = 0.0;
        switch(unit){
            case "kg" ->  response= number;
            case "g" -> response= number/Math.pow(10,3);
            case "mg" -> response= number/Math.pow(10,6);
            case "μg" -> response = number/Math.pow(10,9);
            case "lb" -> response= 0.453592*number;
        }
        System.out.println("converted " + number + " " + unit +" into " +response +" kg" );
        return response;
    }

    private static double convertIntoMeters(double number, String unit){
        double response = 0.0;
        switch(unit){
            case "m" -> response= number;
            case "cm" -> response= number/Math.pow(10,2);
            case "mm" -> response= number/Math.pow(10,4);
            case "μm"-> response = number/Math.pow(10,6);
            case "ft"-> response= 0.3048*number;
        }
        System.out.println("converted " + number + " " + unit +" into " +response +" m" );
        return response;
    }
}
