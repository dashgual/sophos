#Author: David Gutierrez
#Keywords Summary : Sophos
#Scenario: Automatizacion Sophos
@tag
Feature: Automatizacion Sophos
  I want to use this template for my feature file

  @tag1
  Scenario: ofertas sophos
    Given Abrir el navegador
    When Navegar a la pagina de sophos
    And Quitar Popup 
    And Dar click trabaja con nosotros
    And capturar las ofertas
    Then Validar que imprima en consola 
   


  

