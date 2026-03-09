// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Stack;

public class PalindromeCheckerApp {
   public PalindromeCheckerApp() {
   }

   public static void main(String[] var0) {
      Usecase8();
   }


   static void Usecase8() {
      String var0 = "level";
      Node var1 = null;
      Node var2 = null;

      for(char var6 : var0.toCharArray()) {
         Node var7 = new Node(var6);
         if (var1 == null) {
            var2 = var7;
            var1 = var7;
         } else {
            var2.next = var7;
            var2 = var7;
         }
      }

      Node var10 = var1;

      for(Node var11 = var1; var11 != null && var11.next != null; var11 = var11.next.next) {
         var10 = var10.next;
      }

      Node var12 = null;

      Node var14;
      for(Node var13 = var10; var13 != null; var13 = var14) {
         var14 = var13.next;
         var13.next = var12;
         var12 = var13;
      }

      var14 = var1;
      Node var8 = var12;

      boolean var9;
      for(var9 = true; var8 != null; var8 = var8.next) {
         if (var14.data != var8.data) {
            var9 = false;
            break;
         }

         var14 = var14.next;
      }

      if (var9) {
         System.out.println("UC8 Result: \"" + var0 + "\" is a Palindrome (Singly Linked List Method)");
      } else {
         System.out.println("UC8 Result: \"" + var0 + "\" is NOT a Palindrome (Singly Linked List Method)");
      }

      System.out.println("--------------------------------------");
   }

}
