import java.util.Scanner;

public class Teacher extends Person {
    private String[] danhSachLopGiangDay;
    private double luong;
    private int soMonGiangDay;
    private String monHocGiangDay;

    public Teacher() {
    }

    public Teacher(String ten, String gioiTinh, String ngaySinh, String diaChi, String[] danhSachLopGiangDay,
                   double luong, int soMonGiangDay) {
        super(ten, gioiTinh, ngaySinh, diaChi);
        this.danhSachLopGiangDay = danhSachLopGiangDay;
        this.luong = luong;
        this.soMonGiangDay = soMonGiangDay;
        this.monHocGiangDay = monHocGiangDay;
    }

    public String[] getDanhSachLopGiangDay() {
        return danhSachLopGiangDay;
    }

    public void setDanhSachLopGiangDay(String[] danhSachLopGiangDay) {
        this.danhSachLopGiangDay = danhSachLopGiangDay;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public int getSoMonGiangDay() {
        return soMonGiangDay;
    }

    public void setSoMonGiangDay(int soMonGiangDay) {
        this.soMonGiangDay = soMonGiangDay;
    }

    public String getMonHocGiangDay() {
        return monHocGiangDay;
    }

    public void setMonHocGiangDay(String monHocGiangDay) {
        this.monHocGiangDay = monHocGiangDay;
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong lop giang day: ");
        int soLuongLopGiangDay = scanner.nextInt();
        scanner.nextLine(); // Đọc ký tự mới sau khi nhập soLuongLopGiangDay
        danhSachLopGiangDay = new String[soLuongLopGiangDay];
        for (int i = 0; i < soLuongLopGiangDay; i++) {
            System.out.print("Nhap lop giang day thu " + (i + 1) + ": ");
            danhSachLopGiangDay[i] = scanner.nextLine();
        }
        System.out.print("Nhap luong: ");
        luong = scanner.nextDouble();
        scanner.nextLine(); // Đọc ký tự mới sau khi nhập luong
        System.out.print("Nhap so mon giang day: ");
        soMonGiangDay = scanner.nextInt();
        scanner.nextLine(); // Đọc ký tự mới sau khi nhập soMonGiangDay
        System.out.print("Nhap mon hoc giang day: ");
        monHocGiangDay = scanner.nextLine();
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Danh sach lop giang day:");
        for (String lop : danhSachLopGiangDay) {
            System.out.println(lop);
        }
        System.out.println("Luong: " + luong);
        System.out.println("So mon giang day: " + soMonGiangDay);
        System.out.println("Mon hoc giang day: " + monHocGiangDay);
    }
}