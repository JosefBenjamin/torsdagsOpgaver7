public class Flows {

    public void methodA(String input) {
        System.out.println("J");
        if (!input.equals("start")) {
            System.out.println("b");
            methodB("start");
        } else {
            System.out.println("a");
            methodC(input);
        }
        System.out.println("F");
    }

    public void methodB(String start) {
        System.out.println("u");
        if (start.length()%2 == 0){
            System.out.println("n");
        } else {
            System.out.println("uu");
        }
    }

    public int methodC(String input) {
        System.out.println("v");
        methodD(input.length());
        methodE(input.length());
        return input.length() * 2;
    }

    public void methodD(int number) {
        System.out.println("a");
        if (number > 5) {
            System.out.println("d");
        }
        System.out.println("I");
    }

    public boolean methodE(int number) {
        if (number == 5) {
            System.out.println("s");
            return true;
        }else {
            System.out.println("d");
            return false;
        }
    }

    // methodF(methodE)

    public boolean methodF(boolean choose) {

        return true;
    }
}
