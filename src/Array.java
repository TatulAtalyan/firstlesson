public class Array {
    public static void main(String[] args) {
        int x = 1;
        x = x + 2;
        x += 2;
        System.out.println(x);

        int y = 4;
        y *= 5;

        int[] array = new int[5];
        array[0] = 4;
        array[1] = -5;
        System.out.println(array[0]);
        System.out.println(array[2]);

        double[] dd = {4.2, 121.2, 1.11};
        double[] ddd = new double[]{4.2, 121.2, 1.11};

        System.out.println(dd.length);

        System.out.println(dd[dd.length - 1]);

        int z = 45;
        if (z % 2 == 0) {
            System.out.println("zuig");
            System.out.println("barev");
        } else
            System.out.println("kent");

        if (z > 0) {
            System.out.println("drakan");
        } else {
            if (z < 0) {
                System.out.println("bacasakan");
            } else {
                System.out.println("zero");
            }
        }

        int m = z > 0 ? 1 : 0;
        if (z > 0) {
            m = 1;
        } else {
            m = 0;
        }

        //   z > 0 ? System.out.println("ayo") : System.out.println("voch");
        System.out.println(z > 0 ? "ayo" : "voch");

        z = 2;
        if (z == 1) {
            System.out.println("mek");
        } else {
            if (z == 2) {
                System.out.println("erku");
            } else {
                if (z == 3) {
                    System.out.println("erek");
                } else {
                    System.out.println("meca");
                }
            }
        }

        z = 1;
        switch (z) {
            case 1:
                System.out.println("mek");
                break;
            case 3:
                System.out.println("erek");
                break;
            case 2:
                System.out.println("erku");
                break;
            case 4:
            case 5:
                System.out.println("Barev");
                break;
            default:
                System.out.println("meca");
                break;
        }

        int n = 1;
        while (n <= 10) {
            System.out.println(n++);
        }

        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }

        for (int i = 1; i < 5; i++) {
            System.out.println(i);
        }


        System.out.println("--------------------------");
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }

        System.out.println("[1-30] tpel bajanvum en 2 kam 3");
        for (int i = 1; i <= 30; i++) {
            if (i % 2 == 0 || i % 3 == 0)
                System.out.println(i);
        }

        System.out.println("print array");
        int[] numbers = {1, 32, 45, 4564, 6, 5, 1, 312, 6};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("print elements between 10 - 100");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= 10 && numbers[i] <= 100)
                System.out.println(numbers[i]);
        }


        for (int i = 0; i <numbers.length ; i++) {

        }


        System.out.println("sarkel zangvac 1-30 tveri zuigerov");

        int[] zz = new int[15];
        for (int i = 0, cc = 2; i < zz.length; i++, cc = cc + 2) {
            zz[i] = cc;
        }

        System.out.println("count of negatives");
        int[] v = {12, -56, 1, -2, -555};
        int countOfNegatives = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] < 0){
                countOfNegatives++;
            }
        }

        System.out.println(countOfNegatives);

    }
}