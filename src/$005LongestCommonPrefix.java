public class $005LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {

        // Longest common prefix string
       StringBuilder longestCommonPrefix = new StringBuilder();

        // Base condition
       if(strs == null || strs.length == 0) {
           return longestCommonPrefix.toString();
       }

        // Find the minimum length string from the array
       int minumumLength = strs[0].length();
       for(int i = 0; i < strs.length; i++) {
           minumumLength = Math.min(minumumLength, strs[i].length());
       }

        // Loop for the minimum length
       for(int i = 0; i < minumumLength; i++) {

           char current = strs[0].charAt(i);

           for(String str : strs) {
               if(str.charAt(i) != current) {
                   return longestCommonPrefix.toString();
               }

           }
           longestCommonPrefix.append(current);

       }
        return longestCommonPrefix.toString();
    }

    public static void main(String[] args) {

        String[] arg = {"floewer", "flower", "flightwer"};

        System.out.println(longestCommonPrefix(arg));


    }
}
