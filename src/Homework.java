public class Homework {
    public static void main(String[] args) {

        //1. Հայտարարել զանգված և տպել այն։

        int[] b = new int[]{2, 5, 8, 10};
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }


        //2. Հայտարարել int -երի զանգված և լցնել 2-երով։

        int[] x = new int[]{2, 2, 2, 2};


        //3. Հայտարարել int -երի զանգված և լցնել 1- 1000 թվերով։

        int[] y = new int[1000];
        for (int a = 0; a < y.length; a++) {
            y[a] = a + 1;
        }

        //  4. Հայտարարել byte-երի զանգված և լցնել [-30;30] միջակայքի զույգ թվերով։

        byte[] tt = new byte[30];
        for (int i = 0, cc = -30; i < tt.length; i++, cc = cc + 2) {
            tt[i] = (byte) cc;
        }

        // 5. Հայտարարել short-երի զանգված և լցնել [1;300] միջակայքի կենտ թվերով։

        short[] bb = new short[150];
        for (int i = 0, ss = 1; bb.length > i; i++, ss = ss + 2) {
            bb[i] = (short) ss;

        }


        // 6. Հայտարարել int -երի զանգված և լցնել այն։ Տպել այն էլեմենտները որոնք բաժանվում են 5-ի։

        int[] d = {3, 1, 4, 5, 8, 15, 18};
        for (int i = 0; i < d.length; i++) {
            if (d[i] % 5 == 0)
                System.out.println(d[i]);

        }

        // 7. Հայտարարել double-երի զանգված և լցնել այն։ Տպել այն էլեմենտները որոնք մեծ են 24.56-ից։

        double[] dd = {1.4, 25.78, 12.4, 54.12};
        for (int i = 0; i < dd.length; i++) {
            if (dd[i] > 24.56)
                System.out.println(dd[i]);

        }

        // 8. Հայտարարել float-երի զանգված և լցնել այն։ Տպել այն էլեմենտները որոնք մեծ են 35.56-ից կամ փոքր են -34.655-ից։

        float[] f = {-38.44f, 20.2f, 40.3f, 25, 14f, 54.12f};
        for (int i = 0; i < f.length; i++) {
            if (f[i] > 35.36 || f[i] < -34.655)
                System.out.println(f[i]);

        }


        // 9. Հայտարարել int -երի զանգված և լցնել այն։ Տպել 2-ի բաժանվող էլեմենտների քանակը։։

        int[] aa = {4, 5, 7, 8, 10};
        int countOfEven = 0;
        for (int i = 0; i < aa.length; i++) {
            if (aa[i] % 2 == 0) {
                countOfEven++;
            }
        }

        System.out.println(countOfEven);


    }
}
