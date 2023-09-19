public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartv = new SmartTv();

        smartv.ligar();

        smartv.diminuirVolume();
        smartv.diminuirVolume();

        smartv.MudarCanal(10);

        System.out.println("A Smart Tv está ligada?");
        if (smartv.ligada == true) {
            System.out.println("Sim"+"\n");
            System.out.println("Em qual canal a SmartTv está sintonizada?");
            System.out.println("Canal " + smartv.canal +"\n");

            System.out.println("Qual o Volume da TV?");
            System.out.println("Volume: " + smartv.volume);
        } else {
            System.out.println("Nao"+"\n");
        }
    }
}
