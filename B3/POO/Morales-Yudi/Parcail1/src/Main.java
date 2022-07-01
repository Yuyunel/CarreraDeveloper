public class Main {
    public static void main(String[] args) {
        TituloLicenciatura titulo1 = new TituloLicenciatura(2,"2021/01","2022/02",false,true,"si","2023",10);
        titulo1.ejercer();

        TituloLicenciatura titulo2 = new TituloLicenciatura(2,"2021/07","2021/02",false,true,"si","2023",5);
        titulo1.ejercer();

        titulo1.compareTo(titulo2);



    }
}
