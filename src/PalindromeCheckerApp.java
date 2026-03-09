// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Stack;

public class PalindromeCheckerApp {
   public PalindromeCheckerApp() {
   }

   public static void main(String[] var0) {
      Usecase2();
   }

   static void Usecase2() {
      String var0 = "madam";
      char[] var1 = var0.toCharArray();
      int var2 = var0.length() - 1;
      boolean var3 = true;

      for(int var4 = 0; var4 < var0.length() / 2; ++var4) {
         if (var1[var4] != var1[var2]) {
            var3 = false;
            break;
         }

         --var2;
      }

      if (var3) {
         System.out.println("The String is palindrome");
      } else {
         System.out.println("The String is not palindrome");
      }

   

   }
}
