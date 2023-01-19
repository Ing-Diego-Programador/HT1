import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		
		radio radio = new radio();
		int opcionUsuario;
		int condition = 1;
		
	    do {
			opcionUsuario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opción deseada: \n\n" 
			+ "1. Encender Radio. \n" + "2. Cambiar de frecuecia. \n" + "3. Cambiar de emisora. \n"
			+ "4. Guardar Emisora. \n" + "5. Seleccionar emisora guardada. \n" + "6. Apagar radio. \n\n"
			+ "Emisora actual: \n" + radio.emisoraActual.getNombreEmisora() + " - " + radio.emisoraActual.getNumeroEmisora() 
			+ " - " + radio.emisoraActual.getFrecuenciaEmisora() + "\n\n"));
	
	        switch (opcionUsuario) {
	            case 1:
	                radio.encenderRadio();
	                break;
	            case 2:
	            	radio.cambiarFrecuencia();
	            	break;
	            case 3:
	            	radio.avanzarEmisora();
	            	break;
	            case 4:
	            	radio.guardarEmisora();
	            	break;
	            case 5:
	            	radio.seleccionarEmisoraGuardada();
	            	break;
	            case 6:
	            	radio.apagarRadio();
	            	break;
	            default:
	            	JOptionPane.showMessageDialog(null, "No ingreso una opcion valida...");
	                break;
	        }    
	    } while (condition == 1);

	}
}
