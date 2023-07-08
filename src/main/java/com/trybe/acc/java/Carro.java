package com.trybe.acc.java;

/**
 * Classe que representa um carro, herda de VeiculoBase.
 */
public class Carro extends VeiculoBase {

  /**
   * Número de passageiros do carro.
   */
  private int numeroDePassageiro;

  /**
   * Construtor da classe Carro.
   *
   * @param marca a marca do carro
   * @param modelo o modelo do carro
   * @param ano o ano do carro
   * @param tipoCombustivel o tipo de combustível do carro
   * @param capacidadeTanque a capacidade do tanque de combustível do carro
   * @param numeroDePassageiro o número de passageiros do carro
   */
  public Carro(String marca, String modelo, int ano, String tipoCombustivel, int capacidadeTanque,
      int numeroDePassageiro) {
    super(marca, modelo, ano, tipoCombustivel, capacidadeTanque);
    this.numeroDePassageiro = numeroDePassageiro;
  }

  /**
   * Calcula o consumo de combustível do carro para uma determinada distância.
   *
   * @param distancia a distância percorrida
   * @return o consumo de combustível do carro para a distância especificada
   */
  @Override
  public double calcularConsumoCombustivel(double distancia) {
    return distancia / 10;
  }

  /**
   * Exibe as informações do carro.
   */
  @Override
  public void exibirInformacoes() {
    System.out.println("+--------------------- Informações do veículo --------------------------+");
    System.out.println("Marca: " + super.getMarca());
    System.out.println("Modelo: " + super.getModelo());
    System.out.println("Ano: " + super.getAno());
    System.out.println("Tipo de Combustível: " + super.getTipoCombustivel());
    System.out.println("Capacidade do Tanque: " + super.getCapacidadeTanque());
    System.out.println("Número de Passageiros: " + numeroDePassageiro);
    System.out.println("+------------------------------- fim ------------------------------------");
  }
}
