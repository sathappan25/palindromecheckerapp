// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Stack;

public class PalindromeCheckerApp {
   public PalindromeCheckerApp() {
   }

   public static void main(String[] var0) {
      Usecase1();
      Usecase2();
      Usecase3();
      Usecase4();
      Usecase5();
      Usecase6();
      Usecase7();
      Usecase8();
      Usecase9();
      Usecase10();
      Usecase11();
   }

   static void Usecase1() {
      System.out.println("Welcome to Palindrome Checker Management System");
      System.out.println("Version 1.0");
      System.out.println("System initialized Successfully");
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
