// package Week12;

// import java.util.Scanner;

// public class Year {
//     public static void main(String[] args) {
//         System.out.println("โปรแกรมแปลงปี");
//         Scanner kb = new Scanner(System.in);
        
//         while (true) {
//             System.out.println("กด 1 เพื่อแปลงจาก พ.ศ เป็น ค.ศ");
//             System.out.println("กด 0 เพิ่อจบการทำงาน");
//             System.out.println("โปลดเลือกเลข : ");
//             int number = kb.nextInt();
//             if (number == 1) {
//                 while (true) {
//                     System.out.println("ยินดีต้อนรับสู่การแปลงจาก พ.ศ เป็น ค.ศ");
//                     System.out.println("กด 0 เพิ่อจบการทำงาน");
//                     System.out.println("กรุณากรอกปี พุทธศักราช");
//                     int ps = kb.nextInt();
//                     if (ps < 0) {
//                         System.out.println("พุทธศักราชติดลบหรือเป็นศูนย์");
//                     }
//                     if (ps == 0) {
//                         System.out.println("จบการทำงาน");
//                         break;
//                     } else {
//                         System.out.println("ปีคริสต์ศักราช คือ " + (ps - 543));
//                     }
//                 }
//                 kb.close();
//             }
//         }
//     }
// }