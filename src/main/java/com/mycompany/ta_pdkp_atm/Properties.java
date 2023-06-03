/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ta_pdkp_atm;

/**
 *
 * @author Kenzie Tama
 */
public class Properties {
    private static int saldo = 10000000;
    private static int jenisTransaksi;
    private static int i;
    private static int[] PINS = new int[10];
    private static int jumlahuang;
    private final static String rekbanktujuan = "2112012215000";
    private final static String[] modelbanktujuan =  {"BANK TEKKOM", "BANK ABC", "BANK BIR", "BANK BIN"};
    private final static int[] modelbiayaadmin = {0, 1000, 2000, 3000};
    private final static String[] modelinstitusi = {"UNDIP", "UNNES", "UNS", "UNSOED"};
    private static String NIM;
    private static String institusi;
    private static int biayaadmin;
    private static String banktujuan;
    private static int jumlah50;
    private static int jumlah100;
    
    public Properties() {
        PINS[0] = 123456;
    }
    
    public void setSaldo(int newsaldo) {
        saldo = newsaldo;
    }
    
    public int getSaldo() {
        return saldo;
    }
    
    public void setJenisTransaksi(int mode) {
        jenisTransaksi = mode;
    }
    
    public int getJenisTransaksi() {
        return jenisTransaksi;
    }
    
    public int getPIN() {
        return PINS[i];
    }
    
    public void setPIN(int newpin) {
        i++;
        PINS[i] = newpin;
    }
    
    public void setJmlPenarikan(int uang) {
        jumlahuang = uang;
    }
    
    public int getJmlPenarikan() {
        return jumlahuang;
    }
    
    public String[] getModelBank() {
        return modelbanktujuan;
    }
    
    public int[] getModelBiayaAdmin() {
        return modelbiayaadmin;
    }
    
    public String getRekBankTujuan() {
        return rekbanktujuan;
    }
    
    public int getBiayaAdmin() {
        return biayaadmin;
    }
    
    public void setBiayaAdmin(int i) {
        biayaadmin = modelbiayaadmin[i];
    }
    
    public void setBankTujuan(int j) {
        banktujuan = modelbanktujuan[j];
    }
    
    public String getBankTujuan() {
        return banktujuan;
    }
    
    public void setJumlah50(int jumlah) {
        jumlah50 = jumlah;
    }
    
    public int getJumlah50() {
        return jumlah50;
    }
    
    public void setJumlah100(int jumlah) {
        jumlah100 = jumlah;
    }
    
    public int getJumlah100() {
        return jumlah100;
    }
    
    public String[] getModelInstitusi() {
        return modelinstitusi;
    }
    
    public void setInstitusi(int k) {
        institusi = modelinstitusi[k]; 
    }
    
    public String getInstitusi() {
        return institusi;
    }
    
    public void setNIM(String N) {
        NIM = N;
    }
    
    public String getNIM() {
        return NIM;
    }
}
