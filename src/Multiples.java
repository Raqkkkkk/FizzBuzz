public class Multiples {

    public static void main(String[] args) {

        int val = 999;
        int div3 = Math.floorDiv(val, 3);
        int div5 = Math.floorDiv(val, 5);
        int div15 = Math.floorDiv(val, 15);

        System.out.println(div3 + div5 - div15);
    }

}
