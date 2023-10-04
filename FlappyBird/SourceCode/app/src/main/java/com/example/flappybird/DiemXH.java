package com.example.flappybird;

public class DiemXH {
    private int IdDiem;
    private String Diem;

    public DiemXH(){}
    public DiemXH(int idDiem, String diem){
        IdDiem = idDiem;
        Diem = diem;
    }

    public int getIdDiem() {
        return IdDiem;
    }

    public void setIdDiem(int idDiem) {
        IdDiem = idDiem;
    }

    public String getDiem() {
        return Diem;
    }

    public void setDiem(String diem) {
        Diem = diem;
    }
}
