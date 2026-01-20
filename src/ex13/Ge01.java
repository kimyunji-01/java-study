package ex13;

class Box{
   Object data;
}


public class Ge01 {
    public static void main(String[] args) {
        Box box = new Box(); //힙에 띄움
        box.data = "안녕";

        String castData= (String)box.data;
        int len = castData.length();
        System.out.println(len);

    }
}
