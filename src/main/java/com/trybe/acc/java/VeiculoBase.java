package com.trybe.acc.java;

/**
 * Classe abstrata que representa um veículo base.
 */
public abstract class VeiculoBase implements Veiculo {

  /**
   * Marca do veículo.
   */
  private String marca;

  /**
   * Modelo do veículo.
   */
  private String modelo;

  /**
   * Ano do veículo.
   */
  private int ano;

  /**
   * Tipo de combustível do veículo.
   */
  private String tipoCombustivel;

  /**
   * Capacidade do tanque de combustível do veículo.
   */
  private int capacidadeTanque;

  /**
   * Construtor da classe VeiculoBase.
   *
   * @param marca a marca do veículo
   * @param modelo o modelo do veículo
   * @param ano o ano do veículo
   * @param tipoCombustivel o tipo de combustível do veículo
   * @param capacidadeTanque a capacidade do tanque de combustível do veículo
   */
  public VeiculoBase(String marca, String modelo, int ano, String tipoCombustivel,
      int capacidadeTanque) {
    this.marca = marca;
    this.modelo = modelo;
    this.ano = ano;
    this.tipoCombustivel = tipoCombustivel;
    this.capacidadeTanque = capacidadeTanque;
  }

  /**
   * Obtém a marca do veículo.
   *
   * @return a marca do veículo
   */
  public String getMarca() {
    return marca;
  }

  /**
   * Obtém o modelo do veículo.
   *
   * @return o modelo do veículo
   */
  public String getModelo() {
    return modelo;
  }

  /**
   * Obtém o ano do veículo.
   *
   * @return o ano do veículo
   */
  public int getAno() {
    return ano;
  }

  /**
   * Obtém o tipo de combustível do veículo.
   *
   * @return o tipo de combustível do veículo
   */
  public String getTipoCombustivel() {
    return tipoCombustivel;
  }

  /**
   * Obtém a capacidade do tanque de combustível do veículo.
   *
   * @return a capacidade do tanque de combustível do veículo
   */
  public int getCapacidadeTanque() {
    return capacidadeTanque;
  }

  /**
   * Define a marca do veículo.
   *
   * @param marca a marca do veículo
   */
  public void setMarca(String marca) {
    this.marca = marca;
  }

  /**
   * Define o modelo do veículo.
   *
   * @param modelo o modelo do veículo
   */
  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  /**
   * Define o ano do veículo.
   *
   * @param ano o ano do veículo
   */
  public void setAno(int ano) {
    this.ano = ano;
  }

  /**
   * Define o tipo de combustível do veículo.
   *
   * @param tipoCombustivel o tipo de combustível do veículo
   */
  public void setTipoCombustivel(String tipoCombustivel) {
    this.tipoCombustivel = tipoCombustivel;
  }

  /**
   * Define a capacidade do tanque de combustível do veículo.
   *
   * @param capacidadeTanque a capacidade do tanque de combustível do veículo
   */
  public void setCapacidadeTanque(int capacidadeTanque) {
    this.capacidadeTanque = capacidadeTanque;
  }
}
