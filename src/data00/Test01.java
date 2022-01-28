package data00;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.http.HttpClient;

public class Test01 {
    public static void main(String[] args) {
        URL url = new URL(
                "http://openapi.tago.go.kr/openapi/service/DmstcFlightNvgInfoService/getFlightOpratInfoList?serviceKey=wJmmW29e3AEUjwLioQR22CpmqS645ep4S8TSlqtSbEsxvnkZFoNe7YG1weEWQHYZ229eNLidnI2Yt5EZ3Stv7g%3D%3D&numOfRows=10&pageNo=1&depAirportId=NAARKPK&arrAirportId=NAARKPC&depPlandTime=20220125&airlineId=ABL&_type=json")
                
            }catch(

    MalformedURLException e)
    {
        System.out.println("주소 입력이 잘못되었습니다.");
    }

}
