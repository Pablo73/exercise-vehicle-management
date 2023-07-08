package com.trybe.acc.java;

/**
 * Interface que define um veículo.
 */
public interface Veiculo {

  /**
   * Calcula o consumo de combustível do veículo para uma determinada distância.
   *
   * @param distancia a distância percorrida
   * @return o consumo de combustível do veículo para a distância especificada
   */
  double calcularConsumoCombustivel(double distancia);

  /**
   * Exibe as informações do veículo.
   */
  void exibirInformacoes();

}
