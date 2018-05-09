package basic.designPattern.Chain;

/**
 * Created by MSI-PC on 2018/5/8.
 */
public abstract class Handler {
    private Handler nextHanler;//需要继续将报告单传给下一个科室填写

    protected abstract String checkHealth();//当前科室进行诊治
    protected abstract String currentType();//当前科室是负责哪一块的

    public final String handleReport(Request request){
        StringBuilder report = request.getCheckReport();
        String requestContent = request.getCheckMoudel();
        if(requestContent.contains(currentType())){
            report.append(checkHealth()).append("\n");//可以处理者可以处理该请求
        }
        if(nextHanler != null){//将请求交给下一个处理者
            nextHanler.handleReport(request);
        }
        return  report.toString();
    }
    public final void setNextHanler(Handler nextHanler){
        this.nextHanler = nextHanler;
    }
}

