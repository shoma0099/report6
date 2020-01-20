package jp.ac.uryukyu.e195737;

public class Bet {
    int mon1 = 10;
    int mon2 = 10;
    void method() {
    }
    void kati(){
        mon1 = mon1 + 1;
        mon2 = mon2 - 1;
    }
    void make(){
        mon1 = mon1 - 1;
        mon2 = mon2 + 1;
    }
    void Okati(){
        mon1 = mon1 + 2;
        mon2 = mon2 - 2;
    }
    void Omake(){
        mon1 = mon1 - 2;
        mon2 = mon2 + 2;
    }
}
