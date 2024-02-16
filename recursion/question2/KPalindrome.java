import uk.ac.soton.ecs.comp1206.labtestlibrary.interfaces.recursion.PalindromeChecker;

public class KPalindrome implements PalindromeChecker {

    @Override
    public boolean isKPalindrome(String a, int t) {

        if (a.length() <= 1) {return true;}
        if (a.charAt(0) == a.charAt(a.length() - 1)) {
            return isKPalindrome(a.substring(1, a.length() - 1), t);
        } else {
            if (t == 0) {return false;}
            return isKPalindrome(a.substring(1), t - 1) || isKPalindrome(a.substring(0, a.length() - 1), t - 1);
        }
    }

    public static void main(String[] args) {
        KPalindrome checker = new KPalindrome();
    }
}
