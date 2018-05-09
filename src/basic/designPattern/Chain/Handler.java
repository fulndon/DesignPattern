package basic.designPattern.Chain;

import java.util.List;

/**
 * Created by MSI-PC on 2018/5/8.
 */
public abstract class Handler {
    private Handler nextHanler;//需要继续将报告单传给下一个科室填写

    protected abstract String checkHealth();//当前科室进行诊治
    protected abstract HandleVo.checkType currentType();//当前科室是负责哪一块的

    public final String handleReport(HandleVo.checkType currentType){
        String result = "end";
        if(currentType.equals(currentType)){
            result = checkHealth();
        }else if(nextHanler != null){
            result = nextHanler.handleReport(currentType);
        }
        return  result;
    }
    public final void setNextHanler(Handler nextHanler){
        this.nextHanler = nextHanler;
    }
}

