//// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
//// then press Enter. You can now see whitespace characters in your code.
//import java.time.*;
//import java.time.format.DateTimeFormatter;
//import java.util.Locale;
//
//public class Main {
//    public static void main(String[] args) {
//        // Press Alt+Entrée with your caret at the highlighted text to see how
//        // IntelliJ IDEA suggests fixing it.
////        System.out.printf("Hello and welcome!");
////
////        // Press Maj+F10 or click the green arrow button in the gutter to run the code.
////        for (int i = 1; i <= 5; i++) {
////
////            // Press Maj+F9 to start debugging your code. We have set one breakpoint
////            // for you, but you can always add more by pressing Ctrl+F8.
////            System.out.println("i = " + i);
////        }
//
////        ecrire un programme java qui affiche:
//        //a- la date du jour sous format jj/mm/aaaa
//        LocalDate date = LocalDate.now();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        String formattedDate = date.format(formatter);
//        System.out.println(formattedDate);
//        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.FRANCE);
//        String formattedDate2 = date.format(formatter2);
//        System.out.println(formattedDate2);
////        printRectangle("abcde");
//        printRectangle1("abcde");
//
//
//    }
//
//
//
////        public static void printRectangle(String s) {
////            int n = s.length();
////            for (int i = 0; i < n + 4; i++) {
////                System.out.print(s.charAt(i % n));
////            }
////            System.out.println();
////            for (int i = 0; i < n; i++) {
////                System.out.print(s.charAt(i) + " ");
////                System.out.println(s.charAt(i));
////            }
////            for (int i = 0; i < n + 4; i++) {
////                System.out.print(s.charAt(i % n));
////            }
////            System.out.println();
////    }
////    public static void printRectangle(String s) {
////    int n = s.length();
////    for (int i = 0; i < n -1; i++) {
////        System.out.print(s.charAt(i));
////    }
////    System.out.println();
////    System.out.print(s.charAt(0));
//////    for (int i = 0; i < n; i++) {
//////        System.out.print(s.charAt(i));
//////    }
////    System.out.println("  "+s.charAt(0));
////    for (int i = 0; i < n -1; i++) {
////        System.out.print(s.charAt(i));
////    }
////    System.out.println();
////}
//    /// a b c d e
//    public static void printRectangle1(String s) {
//    int n = s.length();
//    for (int i = 0; i < n; i++) {
//        System.out.print(s.charAt(i));
//        System.out.print(" ");
//    }
//    System.out.println();
//    for (int i = 0; i < n ; i++) {
//        System.out.print(s.charAt(i));
//        for (int j = 0; j < n+2 ; j++) {
//            System.out.print(" ");
//        }
//        System.out.println(s.charAt(i));
//    }
//    for (int i = 0; i < n; i++) {
//        System.out.print(s.charAt(i));
//        System.out.print(" ");
//    }
//    System.out.println();
//}
//
//}