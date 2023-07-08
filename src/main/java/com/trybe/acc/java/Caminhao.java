package com.trybe.acc.java;

/**
 * Método principal.
 */

public class Caminhao extends VeiculoBase {

  /**
   * Capacidade de carga do caminhão.
   */
  private int capacidadeCarga;

  /**
   * Construtor da classe Caminhao.
   *
   * @param marca a marca do caminhao
   * @param modelo o modelo do caminhao
   * @param ano o ano do caminhao
   * @param tipoCombustivel o tipo de combustível do caminhao
   * @param capacidadeTanque a capacidade do tanque de combustível do caminhao
   * @param capacidadeCarga a capacidade de carga do caminhão em Kg
   */
  public Caminhao(String marca, String modelo, int ano, String tipoCombustivel,
      int capacidadeTanque, int capacidadeCarga) {
    super(marca, modelo, ano, tipoCombustivel, capacidadeTanque);
    this.capacidadeCarga = capacidadeCarga;
  }

  /**
   * Calcula o consumo de combustível do caminhao para uma determinada distância.
   *
   * @param distancia a distância percorrida
   * @return o consumo de combustível do caminhao para a distância especificada
   */
  @Override
  public double calcularConsumoCombustivel(double distancia) {
    return distancia / 6.0;
  }

  /**
   * Exibe as informações do caminhao.
   */
  @Override
  public void exibirInformacoes() {
    System.out.println("+---------------------- Informações do veículo ------------------------+");
    System.out.println("Marca: " + super.getMarca());
    System.out.println("Modelo: " + super.getModelo());
    System.out.println("Ano: " + super.getAno());
    System.out.println("Tipo de Combustível: " + super.getTipoCombustivel());
    System.out.println("Capacidade do Tanque: " + super.getCapacidadeTanque());
    System.out.println("Capacidade de Carga: " + capacidadeCarga + "Kg");
    System.out.println("+------------------------------- fim ------------------------------------");
  }

}
