package jp.ac.uryukyu.e195737;

public class Dice {
    int mon1 = 10;
    int mon2 = 10;
    void method(){
        int sco1;
        int sco2;
        Bet bet = new Bet();
        Tintiro tin = new Tintiro();
        System.out.println("あなたのターン");
        tin.method();
        sco1 = sco;
        System.out.println("相手のターン");
        tin.method();
        sco2 = sco;
        if(sco1 == 12){
            bet.Omake();
        }if(sco2 == 12){
            bet.Okati();
        }if(sco1 == 11){
            bet.Okati();
        }if(sco2 == 11){
            bet.Omake();
        }else if(sco1<sco2){
            bet.make();
            System.out.println("あなたの負けです。");
        }else if(sco1==sco2){
            bet.kati();
            System.out.println("あなたの勝ちです。");
        }else if(sco1>sco2){
            System.out.println("引き分けです。");
        }
        System.out.println("あなたの所持金は"+mon1+"円。相手の所持金は"+mon2+"円。");
    }
}