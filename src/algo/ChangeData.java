package algo;
//스왚코드
public class ChangeData {
    public static void main(String[] args) {
        // {1,2,3} =>{3,2,1} reverse
        int[] arr ={1,2,3};//임시변수를 하나 만들어서 옮겨두고 시작

        int temp = arr[2]; // temp=3, {1,2,3}
        arr[2] = arr[0]; // temp=3, {1,2,1}
        arr [0] =temp; // temp=3, {3,2,1}

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

//중요한 함수들 따로 메모하기
//sum = sum+1
//int temp => 스왚할라면 무조건 필요