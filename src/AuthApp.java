public class AuthApp {
    public static void main(String[] args) {
        System.out.println(args[0]);


        String id = "going";
        String pass = "1234";

        String inputId = args[0];
        String inputPass = args[1];

        System.out.println("Hi");

        if(inputId.equals(id) && inputPass.equals(pass)) {
            System.out.println("Master");

        } else {
            System.out.println("Who are you");
        }
    }




}
