public class LoopWorld {

    public static void main(String[] args) {
        LoopWorld loops = new LoopWorld();
    }

    public LoopWorld() {
        pattern1();
        pattern2();
        pattern3();
        pattern4();
        pattern5();
        pattern6();
        pattern7();
        pattern8();
        pattern10();

    }

    public void pattern1() {
        System.out.println("*************** Pattern 1:");
        for (int i = 0; i < 26; i = i + 5) {
            System.out.println(i);
        }
    }

    public void pattern2() {
        System.out.println("*************** Pattern 2:");
        for (int i = 2; i < 28; i = i + 5) {
            System.out.println(i);
        }
    }

    public void pattern3() {
        System.out.println("*************** Pattern 3:");
        for (int x = 21; x > 0; x = x - 4) {
            System.out.print(x + "  ");
        }
        System.out.println();
    }

    public void pattern4() {
        System.out.println("*************** Pattern 4:");
        for (int q = 1; q < 7; q++) {
            System.out.print(q * q + "  ");
        }
        System.out.println();
    }

    public void pattern5() {
        System.out.println("*************** Pattern 5:");
        for (int row = 0; row < 4; row++) {
            for (int col = 1; col < 5; col++) {
                System.out.print(col + "  ");
            }
            System.out.println();
        }
    }

    public void pattern6() {
        System.out.println("*************** Pattern 6:");
        for (int line = 1; line < 6; line++) {
            for (int s = 0; s < line - 1; s++) {
                System.out.print(" ");
            }
            System.out.println(line);
        }
    }

    public void pattern7() {
        System.out.println("*************** Pattern 7:");
        for (int i = 1; i <= 5; i++) {
            for (int y = 0; y < 6 - i; y++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }

    public void pattern8() {
        System.out.println("*************** Pattern 8:");
        for (int i = 1; i < 6; i++) {
            for (int s = 0; s < i-1; s++)
                System.out.print(" ");
            {
            for (int a = 0; a < 6-i; a++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }


    public void pattern10() {
        System.out.println("*************** Pattern 10:");
        for (int i = 1; i < 6; i++) {
            for (int y = 0; y < i; y++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }

}
