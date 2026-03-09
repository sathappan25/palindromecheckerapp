// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Stack;

public class PalindromeCheckerApp {
   public PalindromeCheckerApp() {
   }

   public static void main(String[] var0) {
      Usecase3();
   }


   static void Usecase3() {
      String var0 = "level";
      String var1 = "";

      for(int var2 = var0.length() - 1; var2 >= 0; --var2) {
         var1 = var1 + var0.charAt(var2);
      }

      if (var0.equals(var1)) {
         System.out.println("UC3 Result: \"" + var0 + "\" is a Palindrome (Reverse Method)");
      } else {
         System.out.println("UC3 Result: \"" + var0 + "\" is NOT a Palindrome (Reverse Method)");
      }

   }
}
