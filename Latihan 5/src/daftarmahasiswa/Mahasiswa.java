/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daftarmahasiswa;

/**
 *
 * @author LENOVO
 */
public class Mahasiswa {
    private String nim;
    private String nama;
    private String jurusan;
    private String nilai;
    
    public Mahasiswa(String n1, String n2, String n3, String n4){
        nim = n1;
        nama = n2;
        jurusan = n3;
        nilai = n4;
    }
    
    public void setNim(String n) {
        nim = n;
    }
    
    public void setNama(String n) {
        nama = n;
    }
    
    public void setJurusan(String n){
        jurusan = n;
    }
    
    public void setNilai(String n) {
        nilai = n;
    }
    
    
    public String getNim() {
        return nim;
    }
    
    public String getNama() {
        return nama;
    }
    
    public String getJurusan(){
        return jurusan;
    }
    
    public String getNilai() {
        return nilai;
    }
    
    
}
