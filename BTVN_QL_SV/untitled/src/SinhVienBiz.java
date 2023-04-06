public class SinhVienBiz extends SinhVienTechMaster{
    private double marketing;
    private double sales;

    public void setMarketing(double marketing) {
        this.marketing = marketing;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    @Override
    public double getDiem() {
        return (2*marketing+sales)/3;
    }
}
