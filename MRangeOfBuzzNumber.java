// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
class MRangeOfBuzzNumber {
   public static void main(String[] var0) {
      buzzNumber(1, 30);
   }

   public static void buzzNumber(int var0, int var1) {
      for(; var0 <= var1; ++var0) {
         if (Buzz(var0)) {
            System.out.println(var0);
         }
      }

   }

   public static boolean Buzz(int var0) {
      return var0 % 7 == 0 || var0 % 10 == 7;
   }
}
