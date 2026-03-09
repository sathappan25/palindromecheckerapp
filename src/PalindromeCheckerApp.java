// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Stack;

public class PalindromeCheckerApp {
   public PalindromeCheckerApp() {
   }

   public static void main(String[] var0) {

      Usecase5();

   }

  

   static void Usecase5() {
      String var0 = "refer";
      Stack var1 = new Stack();

      for(int var2 = 0; var2 < var0.length(); ++var2) {
         var1.push(var0.charAt(var2));
      }

      boolean var5 = true;

      for(int var3 = 0; var3 < var0.length(); ++var3) {
         char var4 = (Character)var1.pop();
         if (var0.charAt(var3) != var4) {
            var5 = false;
            break;
         }
      }

      if (var5) {
         System.out.println("UC5 Result: \"" + var0 + "\" is a Palindrome (Stack Method)");
      } else {
         System.out.println("UC5 Result: \"" + var0 + "\" is NOT a Palindrome (Stack Method)");
      }

      System.out.println("--------------------------------------");
   }


   
}
