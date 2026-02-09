public class Loopinarray {
    public static void main(String[] args) {

        // String[] cars = {"volvo","force","honda","bmw","audi"};
        // for(int i = 0; i<cars.length;i++){

        // System.out.println(cars[i]);
        // }
        // System.out.println(cars.length);

        // int[] num = {2,3,4,2,4,2,3,4};

        // int sum = 0;
        // for (int i = 0 ;i< num.length;i++){
        // sum = sum +num[i];

        // }

        // System.out.println(sum);

        int[] numbers = { 45, 12, 98, 33, 27 };

        int max = numbers[0];
        int min = numbers[0];

        for (int n : numbers) {
            if (n > max) {
                max = n;
            }
            if (n < min) {
                min = n;
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

    }
}
