// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Stack;

public class PalindromeCheckerApp {
   public PalindromeCheckerApp() {
   }

   public static void main(String[] var0) {
      Usecase7();
   }


   static void Usecase7() {
      String var0 = "civic";
      ArrayDeque var1 = new ArrayDeque();

      for(int var2 = 0; var2 < var0.length(); ++var2) {
         var1.addLast(var0.charAt(var2));
      }

      boolean var5 = true;

      while(var1.size() > 1) {
         char var3 = (Character)var1.removeFirst();
         char var4 = (Character)var1.removeLast();
         if (var3 != var4) {
            var5 = false;
            break;
         }
      }

      if (var5) {
         System.out.println("UC7 Result: \"" + var0 + "\" is a Palindrome (Deque Method)");
      } else {
         System.out.println("UC7 Result: \"" + var0 + "\" is NOT a Palindrome (Deque Method)");
      }

      System.out.println("--------------------------------------");
   }


}
