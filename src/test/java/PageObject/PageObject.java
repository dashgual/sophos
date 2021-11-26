package PageObject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.sophossolutions.com/")

public class PageObject extends net.serenitybdd.core.pages.PageObject {

	String quitar_Popup = "//div[@id='sg-popup-content-wrapper-5998']";
	String darClickTrabajaConNosotros = ".//*[text()[contains(.,\"Trabaja Con Nosotros\")]]";
	String tituloOfertas = "(//div[@class='premium-blog-content-wrapper empty-thumb'])[#]//h3";
	String NombreOferta = "//div[1]/div/div[2]/div[1]/div/h3/a";
	String FechaPublicacion = "(//div[@class='premium-blog-content-wrapper empty-thumb'])[#]//span//span";
	String DescripcionOferta = "(//div[@class='premium-blog-content-wrapper empty-thumb'])[#]//div[@class='premium-blog-post-content']";

	public void espera(int segundos) {
		try {
			Thread.sleep(segundos * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void quitar_Popup() throws AWTException, InterruptedException {
		Thread.sleep(1000);
		Robot robot = new Robot();
		robot.mouseMove(1500, 500);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
	}

	public void darClickTrabajaConNosotros() {
		find(By.xpath(darClickTrabajaConNosotros)).click();
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("window.scrollBy(0,1500)");

	}

	public void capturarlasofertas() {

		for (int x = 1; x < 10; x++) {
            String Auxiliar = tituloOfertas.replace("#", String.valueOf(x));
            System.out.println("Oferta  " + x);
			System.out.println("Nombre de la oferta :" + find(By.xpath(Auxiliar)).getText());
			Auxiliar = FechaPublicacion.replace("#", String.valueOf(x));
			System.out.println("Fecha de la publicación :" + find(By.xpath(Auxiliar)).getText());
			Auxiliar = DescripcionOferta.replace("#", String.valueOf(x));
			System.out.println("Descripción : " + find(By.xpath(Auxiliar)).getText());

		}
	}

}
