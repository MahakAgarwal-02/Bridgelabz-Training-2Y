package Wrapper_Class;

class StudentMarksReport {

    public static void main(String[] args) {
        Object[] marks = { "85", 95, Integer.valueOf(88), "null", "abc", null, "76" };

        int total = 0;
        int count = 0;

        for (Object mark : marks) {
            Integer value = convertToInteger(mark);

            if (value != null) { 
                total += value;
                count++;
            }
        }

        if (count > 0) {
            double average = (double) total / count;
            System.out.println("Average Marks = " + average);
        } else {
            System.out.println("No valid marks found.");
        }
    }

    public static Integer convertToInteger(Object input) {
        if (input == null) return null;

        try {
            if (input instanceof Integer) {
                return (Integer) input; 
            } else if (input instanceof String) {
                String str = (String) input;
                if (str.equalsIgnoreCase("null")) return null;
                return Integer.parseInt(str); 
            } else if (input instanceof Number) {
                return ((Number) input).intValue(); 
            }
        } catch (NumberFormatException e) {
        }

        return null; 
        }
}

