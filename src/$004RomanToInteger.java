import java.util.HashMap;

public class $004RomanToInteger {

    public static int romanToInt(String s) {
        HashMap<Character, Integer> helper = new HashMap<Character, Integer>();
        initHelper(helper);
        int result = 0;
        for (int i = 0; i < s.length(); i ++){
            if ( i > 0 && helper.get(s.charAt(i)) > helper.get(s.charAt(i-1))) {
                result = result - 2 * helper.get(s.charAt(i-1));
            }
            result = result + helper.get(s.charAt(i));
        }
        return result;
    }
    private static void initHelper(HashMap<Character, Integer> helper) {
        helper.put('M', 1000);
        helper.put('D', 500);
        helper.put('C', 100);
        helper.put('L', 50);
        helper.put('X', 10);
        helper.put('V', 5);
        helper.put('I', 1);

    }

    public static void main(String[] args) {

        System.out.println(romanToInt("MCMXCIV"));
    }
}
