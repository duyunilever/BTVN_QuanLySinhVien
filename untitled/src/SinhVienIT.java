public class SinhVienIT extends SinhVienTechMaster{
    private double java;
    private double html;
    private double css;

    public void setJava(double java) {
        this.java = java;
    }

    public void setHtml(double html) {
        this.html = html;
    }

    public void setCss(double css) {
        this.css = css;
    }

    @Override
    public double getDiem() {
        return (2*java+html+css)/4;
    }
}
