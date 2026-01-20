package ex08;

import javax.swing.*;

class Service {
    //1이 리턴되면 잘된거야. -1이 리턴되면 잘못된거야

    static void loginProcess(String username, String password) {
        if (username.length() < 5) {
            throw new RuntimeException("username의 길이가 짧아요");
        }
        if (!password.equals("1234")) {
            throw new RuntimeException("password가 틀렸어요");
        }

    }


    //SRP 잘못된 경우 처리를 하는 곳 (약속한거임)
    class Controller {
        static void login(String username, String Password) {

            try {
                Service.loginProcess(username, Password);
            } catch (RuntimeException e) {
                System.out.println();

            }
        }
    }

    public class Try03 {
        public static void main(String[] args) {
            Controller.login("ssar", "1234");
        }
    }
}
