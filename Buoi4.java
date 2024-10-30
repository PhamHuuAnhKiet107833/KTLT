package it24a;

import java.util.Scanner;

public class Buoi4 {
    public static void bai4_1() {
        int arr[] = { 3, 5, 8, 10, 14, 25 };
        System.out.print("\nDanh sách phần tử của mảng arr là: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("\narr[%d] = %d", i, arr[i]);
        }
    }

    public static void bai4_2() {
        String nguHanh[] = { "kim", "moc", "thuy", "hoa", "tho" };
        System.out.print("\nDanh sach phan tu cua mang nguHanh la: ");
        for (int i = 0; i < nguHanh.length; i++) {
            System.out.printf("\nnguHanh[%d] = %s", i, nguHanh[i]);
        }
    }

    public static void bai4_3() {
        int arr1[][] = new int[2][3];
        System.out.println("\nDanh sách phần tử của mảng arr1 là: ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.printf("\narr1[%d][%d]", i, j);
            }
            System.out.println();
        }
    }

    public static void bai4_4() {
        int arr2[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7 } };
        System.out.println("\nDanh sách phần tử của mảng arr2 là: ");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.printf("\narr2[%d][%d] = %d\t", i, j, arr2[i][j]);
            }
            System.out.println();
        }
    }

    public static void bai4_2NC(int n) {
        System.out.printf("Danh sach cac gia tri tu 1 den n = %d la: ", n);
        for (int i = 1; i <= n; i++) {
            System.out.print("\t" + i);
        }
    }

    public static void bai4_3NC(int n) {
        System.out.printf("\nDanh sach cac gia tri le nho hon hoac bang n = %d la: ", n);
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print("\t" + i);
            }

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        bai4_1();
        bai4_2();
        bai4_3();
        bai4_4();
        System.out.print("\nNhap gia tri: ");
        num = sc.nextInt();
        bai4_2NC(num);
        bai4_3NC(num);
    }
}
