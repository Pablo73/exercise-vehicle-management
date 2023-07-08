package com.trybe.acc.java;

/**
 * Método principal.
 */

public class Moto extends VeiculoBase {

  /**
   * Tipo de moto.
   */
  private String tipoDeMoto;

  /**
   * Construtor da classe Moto.
   *
   * @param marca a marca do moto
   * @param modelo o modelo do moto
   * @param ano o ano do moto
   * @param tipoCombustivel o tipo de combustível do moto
   * @param capacidadeTanque a capacidade do tanque de combustível do moto
   * @param tipoDeMoto tipo de moto
   */
  public Moto(String marca, String modelo, int ano, String tipoCombustivel, int capacidadeTanque,
      String tipoDeMoto) {
    super(marca, modelo, ano, tipoCombustivel, capacidadeTanque);
    this.tipoDeMoto = tipoDeMoto;
  }

  /**
   * Calcula o consumo de combustível do moto para uma determinada distância.
   *
   * @param distancia a distância percorrida
   * @return o consumo de combustível do moto para a distância especificada
   */
  @Override
  public double calcularConsumoCombustivel(double distancia) {
    return distancia / 18.0;
  }

  /**
   * Exibe as informações do moto.
   */
  @Override
  public void exibirInformacoes() {
    System.out.println("+-------------------- Informações do veículo --------------------------+");
    System.out.println("Marca: " + super.getMarca());
    System.out.println("Modelo: " + super.getModelo());
    System.out.println("Ano: " + super.getAno());
    System.out.println("Tipo de Combustível: " + super.getTipoCombustivel());
    System.out.println("Capacidade do Tanque: " + super.getCapacidadeTanque());
    System.out.println("Tipo da moto: " + tipoDeMoto);
    System.out.println("+------------------------------- fim ------------------------------------");
  }

}
