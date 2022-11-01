#Author: Eva Andrades

@stories
Feature: Acceder al sitio de compras Bon Bonite
  Como usuario, quiero acceder al sitio de compras Bon Bonite para comprar accesorios
  @scenario1
  Scenario: Comprar Zapatos
    Given que quiero acceder al sitio de compras con mi datos de usuario
    |  strUser  | strPassword |
    |1152696923 | Agosto2022* |
    When eliga la opcion zapatos
    Then escojo la talla
    | strTalla |
    | 36       |