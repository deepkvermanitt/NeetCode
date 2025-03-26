package arrays;

/**
 * Valid Anagram Solved Given two strings s and t, return true if the two
 * strings are anagrams of each other, otherwise return false.
 * 
 * An anagram is a string that contains the exact same characters as another
 * string, but the order of the characters can be different.
 * 
 * Example 1:
 * 
 * Input: s = "racecar", t = "carrace"
 * 
 * Output: true Example 2:
 * 
 * Input: s = "jar", t = "jam"
 * 
 * Output: false
 * 
 * @author deepverma
 *
 */
public class ValidAnagram {

	public static void main(String[] args) {
		System.err.println(isAnagram( "racecar", "carrace"));
	}

	public static boolean isAnagram(String s, String t) {
		char[] sChar = s.toCharArray();
		char[] tChar = t.toCharArray();
		int[] alphArr = new int[26];
 		if (s.length() != t.length()) {
			return false;
		}
		for (int i = 0; i < s.length(); i++) {
			alphArr[sChar[i] - 'a']++;
			alphArr[tChar[i] - 'a']--;
		}
		for (int j = 0; j < 26; j++) {
			if (alphArr[j] > 0) {
				return false;
			}
		}
		return true;
	}
}
