package basic.designPattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MSI-PC on 2018/4/11.
 */
public abstract class Move {
    private List<String> sequence = new ArrayList<String>();
    //电影中的各种剧情
    protected abstract void insertPreStory();//前言
    protected abstract void insertKillPeople();//杀人
    protected abstract void funStory();
    protected abstract void fightEveryOne();
    final public void playMove(){
        for (int i = 0; i < sequence.size(); i++) {
            String value = sequence.get(i);
            if("1".equals(value)){
                insertPreStory();
            }else if("2".equals(value)){
                insertKillPeople();
            } else if ("3".equals(value)) {
                funStory();
            }
        }
    }
    final public void setSequence(List<String> sequence){
        this.sequence = sequence;
    }
}
