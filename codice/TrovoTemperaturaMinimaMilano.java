//https://www.ilmeteo.it/portale/archivio-meteo/Milano/2023/Agosto
public class TrovoTemperaturaMinimaMilano {
    public static void main(String[] args) {
        int[] temperatures = {26, 25, 27, 23, 22, 23, 23, 22, 23, 24, 26, 26, 28, 28, 28, 28, 27, 28, 30, 30, 30, 30, 31, 30, 30, 27, 23, 20, 19, 21, 21};

        int minTemperature = temperatures[0];

        for (int i = 1; i < temperatures.length; i++) {
            if (temperatures[i] < minTemperature) {
                minTemperature = temperatures[i];
            }
        }

        System.out.println("La temperatura minima a Milano nel mese di agosto è: " + minTemperature + " °C");
    }
}