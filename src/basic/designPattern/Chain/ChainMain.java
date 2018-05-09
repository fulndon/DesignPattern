package basic.designPattern.Chain;

/**
 * Created by MSI-PC on 2018/5/9.
 */
public class ChainMain {
    //返回一个链的第一个元素 所有的处理者形成一个链
    public static Handler getChainHandlerFirst(){
        Handler handler = new EyeCheckHandler();
        Handler handlerHeavy = new HeavyCheckHandler();
        Handler handlerMouth = new MouthCheckHandler();

        handler.setNextHanler(handlerHeavy);
        handlerHeavy.setNextHanler(handlerMouth);
        return handler;
    }

    public static void main(String[] args) {
        Handler handler = getChainHandlerFirst();
        //用户请求
        Request request = new Request();
        request.setCheckMoudel(Constants.CHECK_TYPE);//体检的类别 请求内容决定了哪些handler可以处理
        handler.handleReport(request);//开始处理请求
        System.out.println("体检报告："+request.getCheckReport());//输出体检报告
    }
}
