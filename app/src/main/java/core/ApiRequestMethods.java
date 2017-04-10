package core;

import android.content.Context;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by suhu on 2017/4/8.
 */

public class ApiRequestMethods {

    /**
     *@method 请求方法
     *@author suhu
     *@time 2017/4/8 15:09
     *
    */
    public static void getData(Context context, String url, String name , String passWd, String uniqueCode , final ApiRequestFactory.HttpCallBackListener httpCallBackListener, boolean isShowDialog){
        Map<String ,String> map = new HashMap<>();
        map.put("name",name);
        map.put("passwd",passWd);
        map.put("uniquecode",uniqueCode);
        ApiRequestFactory.postJson(context,url,map,httpCallBackListener,true);
    }


}
