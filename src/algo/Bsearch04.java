package algo;

import java.util.Arrays;

// 11 찾기
public class Bsearch04 {
    public static void main(String[] args) {
        int[] arr = {10, 4, 1, 2, 3, 0, 11};

        // 1. 정렬
        Arrays.sort(arr); // 0, 1, 2, 3, 4, 10, 11

        int target = 11;
        int mid = arr.length/2; // 배열의 반을 쪼개는 함수

        // 2. 검색
        if(target == arr[mid]){  // 0, 1, 2, [3], 4, 10, 11
            System.out.println(target+"를 찾았습니다.");
            return;  //  =>나를 종료한 코드로 다시 돌아가라는 의미
        }
        if(target > arr[mid]){
            mid = 5;
        }
        if (target < arr[mid]){
            mid = 1;
        }
        if(target == arr[mid]){  // 0, 1, 2, 3, 4, [10], 11
            System.out.println(target+"를 찾았습니다.");
            return;  //  =>나를 종료한 코드로 다시 돌아가라는 의미
        }
        if(target > arr[mid]){
            mid = 6;
        }
        if (target < arr[mid]){
            mid = 4;
        }
        if(target == arr[mid]){  // 0, 1, 2, 3, 4, 10, [11]
            System.out.println(target+"를 찾았습니다.");
            return;  //  =>나를 종료한 코드로 다시 돌아가라는 의미
        }

        System.out.println("main끝");
    }
}