package algo;

// ChangeData3 {7,4,2,3,1,5,6}
public class ChangeData3 {
    public static void main(String[] args) {
        // Sort 정렬 (오름차순 1,2,3,4)
        int[] arr = {4, 2, 3, 1};
        int temp;
        //1회전, 4가 제일 끝쪽으로

        if (arr[0] > arr[1]) {
            temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
            System.out.println();
        }

        if (arr[1] > arr[2]) {
            temp = arr[1];
            arr[1] = arr[2];
            arr[2] = temp;
            System.out.println();

        }

        if (arr[2] > arr[3]) {
            temp = arr[2];
            arr[2] = arr[3];
            arr[3] = temp;
            System.out.println();

        }

        // 2차전 (3이 맨끝자리 4의 바로 앞으로 오도록)

        if (arr[0] > arr[1]) {
            temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
            System.out.println();
        }

        if (arr[1] > arr[2]) {
            temp = arr[1];
            arr[1] = arr[2];
            arr[2] = temp;
            System.out.println();

        }
        if (arr[2] > arr[3]) {
            temp = arr[2];
            arr[2] = arr[3];
            arr[3] = temp;
            System.out.println();

        }

    }
}