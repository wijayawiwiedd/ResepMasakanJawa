package com.example.wijaya.resepmasakanjawa;

/**
 * Created by Wijaya on 04-Oct-17.
 */

public class resep {

    private  String judulresep;
    private  String deskripsimasakan;
    private int Gambar;
    private  String isiresep;
    private String menubar;


    public resep(String judulresep, String deskripsimasakan, int gambar, String isiresep, String menubar) {
        this.judulresep = judulresep;
        this.deskripsimasakan = deskripsimasakan;
        this.Gambar = gambar;
        this.isiresep = isiresep;
        this.menubar = menubar;
    }

    public String getJudulresep() {return judulresep;}

    public String getDeskripsimasakan() {return deskripsimasakan;}

    public int getGambar() {return Gambar;}

    public String getIsiresep() {return  isiresep;}

    public  String getMenubar() {return  menubar;}
}
