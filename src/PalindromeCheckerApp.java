// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Stack;

public class PalindromeCheckerApp {
   public PalindromeCheckerApp() {
   }

   public static void main(String[] var0) {
      Usecase4();
   }


   static void Usecase4() {
      String var0 = "radar";
      char[] var1 = var0.toCharArray();
      int var2 = 0;
      int var3 = var1.length - 1;

      boolean var4;
      for(var4 = true; var2 < var3; --var3) {
         if (var1[var2] != var1[var3]) {
            var4 = false;
            break;
         }

         ++var2;
      }

      if (var4) {
         System.out.println("UC4 Result: \"" + var0 + "\" is a Palindrome (Two Pointer Method)");
      } else {
         System.out.println("UC4 Result: \"" + var0 + "\" is NOT a Palindrome (Two Pointer Method)");
      }

      System.out.println("--------------------------------------");
   }
   
}
