package basic.designPattern.Chain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MSI-PC on 2018/5/8.
 */
public class HandleVo {
    enum checkType{
        eye,heavy,mouth
    }
    private StringBuilder checkReport = new StringBuilder();
    private List<checkType> checkTypes = new ArrayList<checkType>();

    public StringBuilder getCheckReport() {
        return checkReport;
    }

    public void setCheckReport(StringBuilder checkReport) {
        this.checkReport = checkReport;
    }

    public List<checkType> getCheckTypes() {
        return checkTypes;
    }

    public void setCheckTypes(List<checkType> checkTypes) {
        this.checkTypes = checkTypes;
    }
}
