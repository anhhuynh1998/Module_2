package exception.unchecked_Exception;

public class Demo_NullPointerException {
    public static void main(String[] args) {
        String string = null;
        try {
            string.length();
        }catch (NullPointerException e){
            System.out.println("tham  chiếu đối tượng Null");
            e.printStackTrace();
        }
    }
}
