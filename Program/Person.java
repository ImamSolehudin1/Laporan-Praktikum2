public class Person{
    private String Nama, JenisKelamin;
    private int Umur;

    public void setNama(String Nama){
        this.Nama = Nama;
    }
    public void setJenisKelamin(String JenisKelamin){
        this.JenisKelamin = JenisKelamin;
    }

    public void setUmur(int Umur){
        this.Umur = Umur ;
    }
    public String getNama(){
        return this.Nama;
    }
    public String getJenisKelamin(){
        return this.JenisKelamin;
    }

    public int getUmur(){
        return this.Umur;
    }
}