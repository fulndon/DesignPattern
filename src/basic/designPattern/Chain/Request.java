package basic.designPattern.Chain;

/**
 * Created by MSI-PC on 2018/5/8.
 */
public class Request {
    private String checkMoudel;//体检模式
    private StringBuilder checkReport = new StringBuilder();//体检报告


    public StringBuilder getCheckReport() {
        return checkReport;
    }

    public String getCheckMoudel() {
        return checkMoudel;
    }

    public void setCheckMoudel(String checkMoudel) {
        this.checkMoudel = checkMoudel;
    }
}
