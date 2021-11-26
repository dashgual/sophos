package Definitions;

import java.awt.AWTException;

import Steps.Stepsprueba;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;


public class Definitions {
	
	@Steps
	 Stepsprueba pasos; 

	
	@Given("^Abrir el navegador$")
	public void abrir_el_navegador() {
	pasos.abrir_navegador();
	}

	@When("^Navegar a la pagina de sophos$")
	public void navegar_a_la_pagina_de_sophos() {
	 
	}

	@When("^Quitar Popup$")
	public void quitar_Popup() throws AWTException, InterruptedException {
    pasos.quitar_Popup();
	  
	}

	@When("^Dar click trabaja con nosotros$")
	public void dar_click_trabaja_con_nosotros() {
    pasos.darClickTrabajaConNosotros();
	   
	}

	@When("^capturar las ofertas$")
	public void capturar_las_ofertas() {
	pasos.capturarlasofertas();
	   
	}

	@Then("^Validar que imprima en consola$")
	public void validar_que_imprima_en_consola() {
	
	 
	}

}
