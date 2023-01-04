import java.util.Scanner;

public class pegawai {

public String nama;
public String jabatan;
public double pajak;
private double gajipokok;
private double gajibersih;

    
    public  pegawai(String jabaString,double pajak){
        this.nama = nama;
        this.jabatan = jabatan;
        this.pajak = pajak;

    }
    public void setGajipokok(double gajipokok){
        this.gajipokok =gajipokok;
    }
    public double getGajipokok(){
        return gajibersih;
    }
    void display(){
        gajibersih =(gajipokok*pajak) - gajipokok;
        System.out.print("nama :" + nama);
        System.out.print("jabatan :" + jabatan);
        System.out.print("gaji bersih :" + gajibersih);
    }
    public static void main(String[]args){
        pegawai pegawai = new pegawai("Adam","direktur", 7565);
        pegawai.setGajipokok(67.00000000);
        pegawai.display();
    }
}
