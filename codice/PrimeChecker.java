public class PrimeChecker {

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        if (number == 2 || number == 3) {
            return true;
        }

        if (number % 2 == 0) {
            return false;
        }

        int sqrt = (int) Math.sqrt(number) + 1;
        for (int i = 3; i < sqrt; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 17; // Il numero che vuoi verificare
        if (isPrime(num)) {
            System.out.println(num + " è un numero primo.");
        } else {
            System.out.println(num + " non è un numero primo.");
        }
    }
}
