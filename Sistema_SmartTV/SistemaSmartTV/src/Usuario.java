public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTV  = new SmartTv();
        
        System.out.println("Estado atual da TV");

        System.out.println("A TV está ligada " + smartTV.ligada);
        smartTV.ligar();
        System.out.println("Canal atual: " + smartTV.canal);
        smartTV.trocarCanal();
        smartTV.voltarCanal();
        smartTV.canalEspecifico(23);
        System.out.println("Volume atual: " + smartTV.volume);
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.desligar();

    }
}
