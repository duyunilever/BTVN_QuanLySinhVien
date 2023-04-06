
public abstract class SinhVienTechMaster{
    private String fullName;
    private String major;

    public void setMajor(String major) {
        this.major = major;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public abstract double getDiem();
    public void getHocLuc(double mark) {
        if (mark < 5) {
            System.out.println("Học lực Yếu");
        } else if (5 <= mark & mark < 6.5) {
            System.out.println("Học lực Trung Bình");
        } else if (6.5 <= mark & mark < 7.5) {
            System.out.println("Học lực Khá");
        } else if (7.5 <= mark & mark <= 10) {
            System.out.println("Học lực Giỏi");
        }
    }
    public void xuat() {
        System.out.print("Họ tên: " + fullName + " - Ngành: " + major.toUpperCase() + " - Điểm: " + getDiem() + " - ");
        getHocLuc(getDiem());
    }
}
