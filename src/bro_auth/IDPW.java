package bro_auth;

import java.util.HashMap;

public class IDPW {

    HashMap<String,String> logininfo = new HashMap<String,String>();

    public IDPW(){
        logininfo.put("Bro","123456");
        logininfo.put("Pakaya","123456");
        logininfo.put("Navindu","123456");
    }

    protected HashMap getLoginInfo(){
        return logininfo;
    }

}
