package com.example.tangtang.boot.launch;

import lombok.Data;

@Data
public class AjaxResponse {

    private boolean isok;
    private int code;//200,400,50
    private String message;
    private Object data;

    public static AjaxResponse success(){

        AjaxResponse ajaxResponse=new AjaxResponse();
        ajaxResponse.setIsok(true);
        ajaxResponse.setCode(200);
        ajaxResponse.setMessage("success");

        return ajaxResponse;
    }


    public static AjaxResponse success(Object obj){

        AjaxResponse ajaxResponse=new AjaxResponse();
        ajaxResponse.setIsok(true);
        ajaxResponse.setCode(200);
        ajaxResponse.setMessage("success");
        ajaxResponse.setData(obj);

        return ajaxResponse;
    }




}
