public class Paciente {

  double altura;
  double peso;

  IndiceMassaCorporal calcularIndiceDeMassaCorporal() {

    IndiceMassaCorporal imc = new IndiceMassaCorporal();
    imc.resultado = peso / (altura * altura);
    imc.peso = peso;
    imc.altura = altura;

    return imc;
  }

}
