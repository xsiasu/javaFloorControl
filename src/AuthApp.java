public class AuthApp {
    public static void main(String[] args) {
        System.out.println(args[0]);


        String id = "egoing";
        String inputId = args[0];

        System.out.println("Hi");

        if(inputId.equals(id)) {
            System.out.println("Master");
        } else {
            System.out.println("Who are you");
        }
    }


}
