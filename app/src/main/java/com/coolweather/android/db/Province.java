package com.coolweather.android.db;

public class Province {
    private int id;
    private String provinceName;
    private int provincrCode;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getProvinceName(){
        return provinceName;
    }
    public void setProvinceName(String provinceName){
        this.provinceName=provinceName;
    }

    public int getProvincrCode() {
        return provincrCode;
    }

    public void setProvincrCode(int provincrCode) {
        this.provincrCode = provincrCode;
    }
}
