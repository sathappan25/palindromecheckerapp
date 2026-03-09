// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Stack;

public class PalindromeCheckerApp {
   public PalindromeCheckerApp() {
   }

   public static void main(String[] var0) {
    
      Usecase12();
   }

   static void Usecase12() {
        PalindromeStrategy strategy = new StackStrategy();
        System.out.println("UC12 Result: " + strategy.check("level"));
        System.out.println("--------------------------------------");
    }
}
