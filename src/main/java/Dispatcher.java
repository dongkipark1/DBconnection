import controller.BankController;
import lombok.AllArgsConstructor;


/**
 * 책임: 라우팅
 */

@AllArgsConstructor
public class Dispatcher {

    private BankController con;

    public void route(String url) {


        // 라우터: 주소가 들어올 때 라우팅 하는 것(주소가 들어오면 방향 안내를 해줌), 디스패처(추적하는 것)
        // 라우터 or 디스패처라고 함
        // spring: 라우터를 만들어준

        if (url.equals("insert")){
            con.insert();
        }else if (url.equals("delete")) {
            con.delete();
        }else if (url.equals("update")) {
            con.update();
        }else if (url.equals("selectOne")) {
            con.selectOne();
        }else if (url.equals("selectAll")) {
            con.selectAll();
        }
    }
}
