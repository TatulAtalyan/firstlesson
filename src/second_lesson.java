public class second_lesson {
    public static void main(String[] args) {
        String firstNameOfStudent = "Hayk";
        String first_name_of_student = "Hayk";
        int x = 5;
        System.out.println("barev " + x);
        int y = 4;
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        int z = x + y;
        x = 7;
        y = 4;
        System.out.println(x / y);
        System.out.println(x % y);
        System.out.println(5 % 6);
        x = x + 1;
        System.out.println(x);
        x++;
        System.out.println(x);
        ++x;
        System.out.println(x);
        int a = ++x;
        System.out.println("a = " + a);
        System.out.println("x = " + x);

        x = 1;
        y = 5;
        z = ++x - y--;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        System.out.println(x > y);
        System.out.println(x <= y);
        System.out.println(x != y);
        System.out.println(x == y);

        System.out.println(x % 2 == 0);
        x = 46;
        boolean b = (x % 10) % 3 == 0;
        System.out.println(b);
        boolean c = x > 4 && x < 10;
        System.out.println(x % 2 == 0 || x % 3 == 0);
        System.out.println(!c);

        x = 12;
        System.out.println(x % 2 == 0 && x % 3 == 0);
        System.out.println(x % 6 == 0);
        // true- x bajanvuma 4 i kam verjanuma 7 ov
        //ev y > 10 kam bajanvuma 9 i
        boolean aa = x % 4 == 0 || x % 10 == 7;
        boolean bb = y > 10 || y % 9 == 0;
        System.out.println(aa && bb);
        System.out.println(6 ^ 13);


        int n = 512;
        System.out.println((n & (n-1)) == 0);
    }
}