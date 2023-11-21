import java.util.Scanner;

public class Student extends Person {
    private String maSV;
    private double diemThi;
    private String email;

    public Student() {
    }

    public Student(String ten, String gioiTinh, String ngaySinh, String diaChi, String maSV, double diemThi, String email) {
        super(ten, gioiTinh, ngaySinh, diaChi);
        this.maSV = maSV;
        this.diemThi = diemThi;
        this.email = email;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public double getDiemThi() {
        return diemThi;
    }

    public void setDiemThi(double diemThi) {
        this.diemThi = diemThi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma sinh vien: ");
        maSV = scanner.nextLine();
        System.out.print("Nhap diem thi: ");
        diemThi = scanner.nextDouble();
        scanner.nextLine(); // Đọc ký tự mới sau khi nhập diemThi
        System.out.print("Nhap email: ");
        email = scanner.nextLine();
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Ma sinh vien: " + maSV);
        System.out.println("Diem thi: " + diemThi);
        System.out.println("Email: " + email);
    }

    public boolean coDuocHocBong() {
        return diemThi > 8.0;
    }
}