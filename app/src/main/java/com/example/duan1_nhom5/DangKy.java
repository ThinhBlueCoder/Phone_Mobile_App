package com.example.duan1_nhom5;

import java.util.HashMap;
import java.util.Map;

public class DangKy {
    private String Id;
    private String HoTen;
    private String Email;
    private String DiaChi;
    private int SDT;
    private String Password;
    private String PhanQuyen;
    private DangKy() {
    }

    public DangKy(String id, String hoTen, String email, String diaChi, int SDT, String password, String phanQuyen) {
        Id = id;
        HoTen = hoTen;
        Email = email;
        DiaChi = diaChi;
        this.SDT = SDT;
        Password = password;
        PhanQuyen = phanQuyen;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public int getSDT() {
        return SDT;
    }

    public void setSDT(int SDT) {
        this.SDT = SDT;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getPhanQuyen() {
        return PhanQuyen;
    }

    public void setPhanQuyen(String phanQuyen) {
        PhanQuyen = phanQuyen;
    }

    public Map<String,Object> toMap(){
        HashMap<String,Object> result = new HashMap<>();
        result.put("email",Email);
        result.put("hoTen",HoTen);
        result.put("password",Password);
        result.put("phanQuyen",PhanQuyen);

        return result;
    }
}
