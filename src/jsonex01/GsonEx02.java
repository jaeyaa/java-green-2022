package jsonex01;

class SMSDto {
    private String grougld;
    private int successCount;
    private int errorCount;
}

public class GsonEx02 {
    public static void main(String[] args) {
        String smsReturn = "{\"groupId\":\"R2GdEONszq64lNB9\",\"successCount\":1,\"errorCount\":0}";
        System.out.println(smsReturn);
    }

}
