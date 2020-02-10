
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        
        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        String concat;
        concat = baseValue + valueToBeAdded ;
        return concat;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        String reverse = "";
        
        for (int i = valueToBeReversed.length()-1; i >= 0 ; i--)
        {
            reverse += valueToBeReversed.charAt(i);
        }
        return reverse;
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        
        int mid = word.length();
        int midnum = (mid / 2);
        
        char midchar = word.charAt(midnum);
        
        return midchar;
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        String newValue;
        String s = String.valueOf(charToRemove);
        for (int i = 0; i <= value.length(); i++)
        {
            
              newValue = value.replace(s,"");
            
        }
        
        
        return null;
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        return null;
    }
}
