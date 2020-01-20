package jp.ac.uryukyu.e195737

class TintiroTest extends GroovyTestCase {
    int[] dices = new int[3];
    for (int i = 0; i < dices.length; i++) {
        dices[i] = (int) (Math.random() * 6) + 1;
    }
    String list = Arrays.toString(dices);
    System.out.println(list);
}
