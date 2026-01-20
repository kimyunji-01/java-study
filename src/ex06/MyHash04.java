package ex06;

import java.util.HashMap;

public class MyHash04 {
    public static void main(String[] args) {
        HashMap<String,String> arr= new HashMap<>();
        arr.put("age","1"); // 키값을 통해 밸류가 나옴
        arr.put("name","임꺽정");

        System.out.println(arr.get("name")); //name을 해쉬해서 번지를 찾는다
    }
}
