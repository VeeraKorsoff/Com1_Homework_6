public class Main {
    public static void main(String[] args) {

        //HW 1
        for (int k = 0; k <= 10; k++) {
            double result = (k * (Math.PI / 5));
            System.out.println("Alpha: " + result + " Sin alpha: " + Math.sin(result) + " Cos alpha: " + Math.cos(result));
            

            //HW 2
        import static ibio.Helpers.*;
        public class Main {
            public static void main(String[] args) {

                boolean RUNNING = true;

                while (RUNNING) {
                    String Operation = input("give operation");
                    if (Operation.equals("end"))
                        RUNNING = false;
                    else {
                        int A = inputInt("give first integer operand");
                        int B = inputInt("give second integer operand");
                        if (Operation.equals("add"))
                            output(A + B);
                        else if (Operation.equals("sub"))
                            output(A - B);
                        else
                            output("unknown operation");
                    }
                }
            }
        }
    }
}

