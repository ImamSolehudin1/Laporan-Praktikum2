public class Twoperson{
    public static void main(String[] args){
        //Membuat objek
        Person Dia1 = new Person();
        Person Dia2 = new Person();

        //Memanggil atribut dan memeberi niali
        Dia1.setNama("Anton");
        Dia1.setJenisKelamin("Laki-laki");
        Dia1.setUmur(20);
        Dia2.setNama("Riko");
        Dia2.setJenisKelamin("Laki-laki");
        Dia2.setUmur(25);

        System.out.println("==============================");
        System.out.println("Nama            : "+ Dia1.getNama());
        System.out.println("Jenis Kelamin   : "+ Dia1.getJenisKelamin());
        System.out.println("Umur            : "+ Dia1.getUmur());
        System.out.println("==============================");
        System.out.println("Nama            : "+ Dia2.getNama());
        System.out.println("Jenis Kelamin   : "+ Dia2.getJenisKelamin());
        System.out.println("Umur            : "+ Dia2.getUmur());
    }

}