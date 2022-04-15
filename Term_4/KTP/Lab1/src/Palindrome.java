public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String str = args[i];
            System.out.println(str + " : " + Boolean.toString(isPalindrome(str)));
        }
    }

    // Возвращает строку в обратном порядке
    public static String reverseString(String str) {
        String reverse = "";
        for (int i = str.length()-1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }

    // Проверяет является ли str палиндромом
    public static boolean isPalindrome(String str) {
        String res = "";
        for (int i = str.length()-1; i >= 0; i--) {
            res += str.charAt(i);
        }
        if (res.equals(reverseString(res))) {
            return true;
        } else {
            return false;
        }
    }
}
