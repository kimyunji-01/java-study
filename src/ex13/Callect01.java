package ex13;

import java.util.ArrayList;

public class Callect01 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList(); //내부적으로 10칸짜리 배열이 만들어짐 => 타입 지정을 안했으니 오브젝트 타입으로 시작
        arr.add(1);
        arr.add(3);
        arr.add(5);
        System.out.println(arr.get(2));
        arr.remove(0);

        System.out.println( arr.size());
        boolean isThree = arr.contains(3);
        System.out.println(isThree);
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
        for (Integer i: arr) {
            System.out.println(i);
        }
    }
    }
