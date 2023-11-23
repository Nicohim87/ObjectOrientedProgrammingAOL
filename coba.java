abstract class Manusia{
    String Nama;
    String Alamat;
    int Age;

    public Manusia(String Nama, String Alamat, int Age){
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.Age = Age;
    }

}

class gamer extends Manusia{
    String Rank;
    gamer(String Nama, String Alamat, int Age, String Rank){
        super(Nama, Alamat, Age);
        this.Rank = Rank;
    }

    void display(){
        String hasil;
        System.out.println("Nama    : "+Nama);
        System.out.println("Alamat  : " +Alamat);
        System.out.println("Umur    : " +Age);
        System.out.println("Rank    : " +Rank);
        if(Rank == "bronze"){
            hasil = "CUPU";
        } else{
            hasil = "JAGO";
        }
        System.out.println("Status  : " +hasil);
    }
}

public class coba{
    public static void main(String[] args){
        System.out.println("Odit Pro Player Dota 2 tapi bo'ong");
    gamer data = new gamer("Liu", "Malang", 99, "bronze");
    System.out.println("Davin Wibu Akut");
    data.display();
    }
}