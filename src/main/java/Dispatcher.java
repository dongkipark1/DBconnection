import controller.BankController;
import controller.RequestMapping;
import lombok.AllArgsConstructor;

import java.lang.reflect.Method;


/**
 * 책임: uri 받아서 라우팅
 */

@AllArgsConstructor
public class Dispatcher {

    private BankController con;

    public void route(String path) {
        // 라우터: 주소가 들어올 때 라우팅 하는 것(주소가 들어오면 방향 안내를 해줌), 디스패처(추적하는 것)
        // 라우터 or 디스패처라고 함

        Method[] methods = con.getClass().getDeclaredMethods(); //유저 컨트롤러 객체에 선언된 메서드 전체를 들고와!
        //System.out.println(methods.length);

        for(Method method : methods){
            //System.out.println(method.getName());
            RequestMapping rm = method.getDeclaredAnnotation(RequestMapping.class);

            if (rm == null) continue;
            if (rm.uri().equals(path)){
                try {
                    method.invoke(con); // con.login();
                    break;
                }  catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
