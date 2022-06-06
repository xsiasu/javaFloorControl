public class AuthApp3 {
    public static void main(String[] args) {
        //사용자가 입력하는 데이터
        String[][] users = {
                {"sohui","1111"},
                {"sean","2222"},
                {"hoyeong","3333"}
        };
        //dB 있는 데이터
        String inputId = args[0];
        String inputPass = args[1];
        boolean isLogined = false;

        for (int i=0;users.length>i;i++){

            String[] current = users[i];

            if (current[0].equals(inputId) && current[1].equals(inputPass)) {
                isLogined = true;
                break;
            }
        }
        if (isLogined) {
            System.out.println("hi master");
        } else {
            System.out.println("who are you");
        }
    }
}
