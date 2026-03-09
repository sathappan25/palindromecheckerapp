// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Stack;

public class PalindromeCheckerApp {
   public PalindromeCheckerApp() {
   }

   public static void main(String[] var0) {
      Usecase9();

   }


   static void Usecase9() {
      String var0 = "madam";
      boolean var1 = check(var0, 0, var0.length() - 1);
      System.out.println("UC9 Input: " + var0);
      System.out.println("Is Palindrome? : " + var1);
      System.out.println("--------------------------------------");
   }

   private static boolean check(String var0, int var1, int var2) {
      if (var1 >= var2) {
         return true;
      } else {
         return var0.charAt(var1) != var0.charAt(var2) ? false : check(var0, var1 + 1, var2 - 1);
      }
   }

}
