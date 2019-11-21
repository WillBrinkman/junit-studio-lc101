package main;


public class BalancedBrackets {
    /**
     * The function BalancedBrackets should return true if and only if
     * the input string has a set of "balanced" brackets.
     *
     * That is, whether it consists entirely of pairs of opening/closing
     * brackets (in that order), none of which mis-nest. We consider a bracket
     * to be square-brackets: [ or ].
     *
     * The string may contain non-bracket characters as well.
     *
     * These strings have balanced brackets:
     *  "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
     *
     * While these do not:
     *   Code[", "[", "]["
     *"[LaunchCode", "Launch]
     * @param str - to be validated
     * @return true if balanced, false otherwise
     */

    // Nested brackets?  two variables? can't equal 0?


    public static boolean hasBalancedBrackets(String str) {
        int bracketOpen = 0;
        int bracketClose = 0;
        for (char ch : str.toCharArray()) {
            if (ch == '[') {
                bracketOpen++;
            } else if (ch == ']') {
                bracketClose++;
                if (bracketClose > bracketOpen) {
                    break;
                }
            }
        }
        if (bracketOpen >= 1) {
            return (bracketOpen == bracketClose);
        }
        return false;
    }
}
