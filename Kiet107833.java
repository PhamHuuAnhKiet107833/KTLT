package buoi3;

public class Kiet107833 {
    public static String gioiTinh(boolean gt) {
        return gt ? "Nam" : "Nữ";
    }

    public static void main(String[] args) {
        System.out.println("---Thông tin sinh viên---");
        String A = "107833";
        String B = "Phạm Hữu Anh Kiệt";
        String C = "23/08/2006";
        int D = 18;
        boolean gt = true;
        String E = "IT24A";
        String F = "Công nghệ thông tin";
        String G = "Đà Nẵng";
        System.out.println("Mã sinh viên: " + A);
        System.out.println("Họ và tên:" + B);
        System.out.println("Ngày sinh: " + C);
        System.out.println("Tuổi: " + D);
        System.out.println("Giới tính: " + gioiTinh(gt));
        System.out.println("Lớp: " + E);
        System.out.println("Khoa: " + F);
        System.out.println("Địa chỉ: " + G);
        System.out.println("--Hết--");
    }
}
