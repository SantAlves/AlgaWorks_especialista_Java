public class SmartTv {
  
  boolean ligada = false;
  int canal = 1;
  int volume = 25;

  public void ligar() {
    ligada = true;
    System.out.println("A TV está ligada");
  }
  public void desligar() {
    ligada = false;
    System.out.println("A TV está desligada");

  }

  public void trocarCanal() {
    canal++;
    //volume = volume + 1; ou volume += 1;

  }
  public void voltarCanal() {
    canal--;
    //volume = volume + 1; ou volume += 1;

  }public void canalEspecifico(int novoCanal) {
    canal = novoCanal;
  }

  public void aumentarVolume() {
    volume++;
    //volume = volume + 1; ou volume += 1;
    System.out.println("Almentando volume paar: " + volume);

  }

  public void diminuirVolume() {
    volume--;
    //volume = volume + 1; ou volume += 1;

    System.out.println("Diminuindo volume paar: " + volume);
  }
}
