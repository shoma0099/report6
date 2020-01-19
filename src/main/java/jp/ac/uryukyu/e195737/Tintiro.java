package jp.ac.uryukyu.e195737;

public class Tintiro {
    void method(int[] dices){
        /**
         * チンチロリンを作る
         *
         * 今回の役は以下の４つ
         *
         * ３個中２個同じ目が出た時残りの一個の目が大きければ勝ち
         *
         * 三個のサイコロの目が全て同じだと無条件で勝ち
         *
         * サイコロの目が４・５・６だと２倍の配当をもらって勝ち
         *
         * サイコロの目が１・２・３だと２倍払って負け
         *
         * また１vs１の勝負とする
         *
         */
        int a = dices[0];
        int b = dices[1];
        int c = dices[2];
        int score;

        if(a == b){
            if(a == c) {
                System.out.println("あなたの勝ちです。");
            }else {
                score = c;
                System.out.println("あなたなのスコアは" + score + "です。");}
        }if(b == c){
            score = a;
            System.out.println("あなたなのスコアは"+score+"です。");
        }if(a == c){
            score = b;
            System.out.println("あなたなのスコアは"+score+"です。");
        }if(a+b+c == 15){
            System.out.println("あなたの勝ちです。配当が２倍になります。");
        }if(a+b+c == 6){
            System.out.println("あなたの負けです。配当を２倍支払います。");
        }else{
            System.out.println("役ができませんでした。");
        }
    }
}
