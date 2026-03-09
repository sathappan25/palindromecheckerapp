// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Stack;

public class PalindromeCheckerApp {
   public PalindromeCheckerApp() {
   }

   public static void main(String[] var0) {
   
      Usecase11();
   }


   static void Usecase11() {
      String var0 = "racecar";
      PalindromeService var1 = new PalindromeService();
      boolean var2 = var1.checkPalindrome(var0);
      System.out.println("UC11 Input: " + var0);
      System.out.println("Is Palindrome? : " + var2);
      System.out.println("--------------------------------------");
   }

   static class Node {
      char data;
      Node next;

      Node(char var1) {
         this.data = var1;
         this.next = null;
      }
   }

   static class PalindromeService {
      PalindromeService() {
      }

      public boolean checkPalindrome(String var1) {
         int var2 = 0;

         for(int var3 = var1.length() - 1; var2 < var3; --var3) {
            if (var1.charAt(var2) != var1.charAt(var3)) {
               return false;
            }

            ++var2;
         }

         return true;
      }
   }
}
