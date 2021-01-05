public class main {
    public static void main (String[] args) {

getDurationString(193, 33);

    }
    public static String getDurationString(int minutes, int seconds){
     if (minutes >= 0 && (seconds >= 0 && seconds <= 59)){
         int hours = minutes / 60;
         int newMin = minutes % 60;
         System.out.println(hours + "h" + newMin + "m" + seconds + "s");
         return (hours + "h" + newMin + "m" + seconds + "s");


        }

    return "Invalid Value";

    }

    public static String getDurationString(int seconds){
        if (seconds >= 0){
            int min = seconds / 60;
            int newSec = seconds % 60;
            int hours = min /60;
            int newMin = min % 60;
            System.out.println();
    return (hours + "h" + newMin + "m" + seconds + "s");
        }


        return "Invalid Value";

    }


}
