// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Stack;

public class PalindromeCheckerApp {
   public PalindromeCheckerApp() {
   }

   public static void main(String[] var0) {
      Usecase6();
   }


   static void Usecase6() {
      String var0 = "noon";
      Stack var1 = new Stack();
      LinkedList var2 = new LinkedList();

      for(int var3 = 0; var3 < var0.length(); ++var3) {
         var1.push(var0.charAt(var3));
         var2.add(var0.charAt(var3));
      }

      boolean var7 = true;

      for(int var4 = 0; var4 < var0.length(); ++var4) {
         char var5 = (Character)var2.remove();
         char var6 = (Character)var1.pop();
         if (var5 != var6) {
            var7 = false;
            break;
         }
      }

      if (var7) {
         System.out.println("UC6 Result: \"" + var0 + "\" is a Palindrome (Queue + Stack Method)");
      } else {
         System.out.println("UC6 Result: \"" + var0 + "\" is NOT a Palindrome (Queue + Stack Method)");
      }

      System.out.println("--------------------------------------");
   }


   
}
