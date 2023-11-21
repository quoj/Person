import java.util.Scanner;

class Person {
    private String ten;
    private String gioiTinh;
    private String ngaySinh;
    private String diaChi;

    public Person() {
    }

    public Person(String ten, String gioiTinh, String ngaySinh, String diaChi) {
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        ten = scanner.nextLine();
        System.out.print("Nhap gioi tinh: ");
        gioiTinh = scanner.nextLine();
        System.out.print("Nhap ngay sinh: ");
        ngaySinh = scanner.nextLine();
        System.out.print("Nhap dia chi: ");
        diaChi = scanner.nextLine();
    }

    public void inThongTin() {
        System.out.println("Ten: " + ten);
        System.out.println("Gioi tinh: " + gioiTinh);
        System.out.println("Ngay sinh: " + ngaySinh);
        System.out.println("Dia chi: " + diaChi);
    }
}

class SinhVien extends Person {
    private String maSV;
    private double diemThi;
    private String email;

    public SinhVien() {
    }

    public SinhVien(String ten, String gioiTinh, String ngaySinh, String diaChi,
                    String maSV, double diemThi, String email) {
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

class GiaoVien extends Person {
    private String[] danhSachLopGiangDay;
    private double luong;
    private int soMonGiangDay;
    private String monHocGiangDay;

    public GiaoVien() {
    }

    public GiaoVien(String ten, String gioiTinh, String ngaySinh, String diaChi,
                    String[] danhSachLopGiangDay, double luong, int soMonGiangDay, String monHocGiangDay) {
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
            System.out.println("- " + lop);
        }
        System.out.println("Luong: " + luong);
        System.out.println("So mon giang day: " + soMonGiangDay);
        System.out.println("Mon hoc giang day: " + monHocGiangDay);
    }
}

