public class Reduce {

    public static void main(String[] args) {

        int intToReduce = 9;
        String binaryInt = Integer.toBinaryString(intToReduce);

        int totalSteps = -1;
        for (char c : binaryInt.toCharArray()) {
            if (c == '1') {totalSteps++;}
            totalSteps++;
        }

        System.out.println(totalSteps);

    }

}
