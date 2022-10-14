public class Main {
    public static void main(String[] args) {



        int derece = 56;

        if(derece<=5){
            System.out.println("Kayak yapabilirsiniz.");
        }
        else if (derece>5&&derece<=15){
            System.out.println("Sinemaya gidebilirsiniz.");
        } else if (derece>15&&derece<=25) {
            System.out.println("Piknige gidebilirsiniz.");
        }
        else if(derece>25){
            System.out.println("Yuzmeye gidebilirsiniz.");
        }


    }
}