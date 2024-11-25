public class prime {
    
    public static void main(String[] args) {
        
        // Hardcoded number to check
        int num = 30;  // You can change this number to check different values
        
        // Check if the number is prime
        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        // 0 and 1 are not prime numbers
        if (num <= 1) {
            return false;
        }
        
        // Check divisibility from 2 to square root of num
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;  // num is divisible by i, so it's not prime
            }
        }
        
        return true;  // num is prime
    }
}
