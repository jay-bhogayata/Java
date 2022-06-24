public class Switch {
    public static void main(String[] args) {
        int i = 10;

        switch (i) {
            case 5:
                System.out.println("this is 5 ..");
                break;

            case 10:
                System.out.println("this is 10 ..");
                break;

            case 15:
                System.out.println("this is 15 ..");
                break;

            default:
                System.out.println("no match found...");
                break;
        }
    }
}
