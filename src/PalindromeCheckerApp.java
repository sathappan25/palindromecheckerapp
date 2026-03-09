// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Stack;

public class PalindromeCheckerApp {
   public PalindromeCheckerApp() {
   }

   public static void main(String[] var0) {
      Usecase10();
 
   }

   
   static void Usecase10() {
      String var0 = "A man a plan a canal Panama";
      String var1 = var0.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
      boolean var2 = true;

      for(int var3 = 0; var3 < var1.length() / 2; ++var3) {
         if (var1.charAt(var3) != var1.charAt(var1.length() - 1 - var3)) {
            var2 = false;
            break;
         }
      }

      System.out.println("UC10 Input: " + var0);
      System.out.println("Normalized: " + var1);
      System.out.println("Is Palindrome? : " + var2);
      System.out.println("--------------------------------------");
   }


}
