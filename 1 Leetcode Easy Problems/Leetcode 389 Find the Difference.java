
/**
 * You are given two strings s and t.
 *
 * String t is generated by random shuffling string
 * s and then add one more letter at a random position.
 *
 * Return the letter that was added to t.
 *
 * Example 1:
 * Input: s = "abcde", t = "abcdee"
 * Output: "e"
 * Explanation: 'e' is the letter that was added.
 *
 * Example 2:
 * Input: s = "", t = "y"
 * Output: "y"
 *
 * Constraints:
 * 0 <= s.length <= 1000
 * t.length == s.length + 1
 * s and t consist of lowercase English letters.
 */
class FindTheDifference {
  public static void main(String[] args) {
    FindTheDifference diff = new FindTheDifference();
    System.out.println("Output is:" +
        diff.findTheDifference("abcde", "abcdee"));
  }

  public char findTheDifference(String s, String t) {
    char c = t.charAt(t.length() - 1);
    for (int i = 0; i < s.length(); i++) {
      c ^= s.charAt(i) ^ t.charAt(i);
    }
    return c;
  }
}
