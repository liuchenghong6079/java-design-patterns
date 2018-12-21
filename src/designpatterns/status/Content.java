package designpatterns.status;

/**
 * 环境
 * @author lch
 */
public class Content {

    private Statu statu;

    public Content(Statu statu) {
        this.statu = statu;
    }

    public void setStatu(Statu statu) {
        this.statu = statu;
    }

    public void handle(){
        statu.handle();
    }
}
