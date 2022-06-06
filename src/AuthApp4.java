public class AuthApp4 {
    public static void main(String[] args) {


        //아이디
        //passoword


        String[][] users = {
                {"sean","1111"},
                {"sohui","2222"},
                {"hoyeong","3333"},
        };

        String inputId = args[0];
        String inputPass = args[1];
        boolean isLoinged = false;

        for (int i =0;users.length > i;i++){
            String[] current = users[i];
            if (current[0].equals(inputId) && current[1].equals(inputPass)) {
                isLoinged = true;
                break;
            }
        }

        if(isLoinged) {
            System.out.println("success");
        }else {
            System.out.println("fail");
        }

    }
}


