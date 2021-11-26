package Steps;

import java.awt.AWTException;
import net.thucydides.core.annotations.Step;
import PageObject.PageObject;

public class Stepsprueba {


PageObject paso;

public void abrir_navegador() {
paso.open();
}

public void quitar_Popup() throws AWTException, InterruptedException {
paso.quitar_Popup();
	
}

public void darClickTrabajaConNosotros() {
paso.darClickTrabajaConNosotros();
	
}

public void capturarlasofertas() {
paso.capturarlasofertas();
	
}


	
}