public class $003PalindromeNumber {

    public static boolean isPalindrome(int x) {

      if(x < 0) {
          return false;
      }

      int number = x;

      int reverse = 0;

      while (number > 0) {
          reverse = reverse * 10 + number % 10;
          number /= 10;
      }
      return x == reverse;


    }

    public static boolean isPalindromee(int x) {
        if (x < 0) {
            return false;
        }
        int left = 1;
        while (x / left >= 10) {
            left = left * 10;
        }
        int right = 1;
        while (left > right) {
            if ((x / left) % 10 != (x / right) % 10 ) {
                return false;
            }
            left = left / 10;
            right = right * 10;
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(isPalindromee(123321));
    }
}
