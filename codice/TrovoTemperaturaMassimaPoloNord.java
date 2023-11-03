//https://en.climate-data.org/north-america/united-states-of-america/alaska/north-pole-15898/t/december-12/
public class TrovoTemperaturaMassimaPoloNord {
    public static void main(String[] args) {
        int[] temperatures = {-17, -17, -18, -16, -17, -16, -17, -16, -16, -15, -16, -17, -18, -19, -20, -20, -21, -20, -17, -17, -17, -18, -18, -19, -20, -18, -18, -19, -18, -18, -17};

        int maxTemperature = temperatures[0];

        for (int i = 1; i < temperatures.length; i++) {
            if (temperatures[i] > maxTemperature) {
                maxTemperature = temperatures[i];
            }
        }

        System.out.println("La temperatura massima nel mese di dicembre al Polo Nord è: " + maxTemperature);
    }
}