package basic.designPattern.Chain;

/**
 * Created by MSI-PC on 2018/5/9.
 */
public class EyeCheckHandler extends Handler {
    @Override
    protected String checkHealth() {
        System.out.println("视力检测中");
        return "eye is not good ";
    }
    @Override
    protected String currentType() {
        System.out.println("我是眼科的");
        return Constants.EYE_CHECK;
    }
}
class HeavyCheckHandler extends Handler{
    @Override
    protected String checkHealth() {
        System.out.println("体重检测中");
        return "heavy is better";
    }
    @Override
    protected String currentType() {
        System.out.println("我是测体重的");
        return Constants.HEAVY_CHECK;
    }
}
class MouthCheckHandler extends Handler{

    @Override
    protected String checkHealth() {
        System.out.println("口腔检测中");
        return "mouth is ok ";
    }
    @Override
    protected String currentType() {
        System.out.println("我是测口腔的");
        return Constants.MOUTH_CHECK;
    }
}