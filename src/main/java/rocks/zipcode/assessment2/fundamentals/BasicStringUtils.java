package rocks.zipcode.assessment2.fundamentals;

public class BasicStringUtils {
    /**
     * @param string1 - Base string to be added to
     * @param string2 - String to add to `string1`
     * @return concatenation of `string1` and `string2`
     */
    public static String concatentate(String string1, String string2) {
        return string1 + string2;
    }

    /**
     * @param string1 - String to be reversed
     * @return an identical string with characters in reverse order
     */
    public static String reverse(String string1) {
        String reverse = "";
        for (int i = string1.length() - 1; i >= 0; i--) {
            reverse = reverse + string1.charAt(i);
        }

        return reverse;
    }

    /**
     * @param string1 - first string to be reversed
     * @param string2 - second string to be reversed
     * @return concatenation of the reverse of `string1` and reverse of `string2`
     */
    public static String reverseThenConcatenate(String string1, String string2) {
        String answer = reverse(string1);
        String answer2 = reverse(string2);

        return answer + answer2;
    }

    /**
     * @param string             - the string to be manipulated
     * @param charactersToRemove - Characters that should be removed from `string`
     * @return `string` with `charactersToRemove` removed
     */
    public static String removeCharacters(String string, String charactersToRemove) {

        String[] temp = charactersToRemove.split("");
        for (int i = 0; i < temp.length; i++) {


            string = string.replace(temp[i], "");
        }
        return string;
    }




    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - characters to be removed from the string
     * @return reverse of `string` with `charactersToRemove` removed
     */
    public static String removeCharactersThenReverse(String string, String charactersToRemove) {
        String answer = removeCharacters(string,charactersToRemove);
        answer = reverse(answer);

        return answer;
    }
}
