import java.util.ArrayList;
import javax.swing.JOptionPane;

public class radio implements iRadio{
	
	int contFM = 1, contAM = 1, contGuardado = 0;
	emisora emisora = new emisora();
	private boolean estadoRadio = false;
	
	public boolean getEstadoRadio() {
		return estadoRadio;
	}
	
	
	private ArrayList<emisora> AM = new ArrayList<>();
    private ArrayList<emisora> FM = new ArrayList<>();
    private ArrayList<emisora> arrayEmisorasGuardadas = new ArrayList<>();
    
    emisora emisoraActual = new emisora("LO MEJOR", "AM", 530);


    
    emisora AM1 = new emisora("LO MEJOR", "AM", 530);
    emisora AM2 = new emisora("DISNEY AM", "AM", 540);
    emisora AM3 = new emisora("HITS DEL MOMENTO", "AM", 560);
    emisora AM4 = new emisora("TROPICALIDA", "AM", 610);
    emisora AM5 = new emisora("AM JOYA", "AM", 650);
    emisora AM6 = new emisora("¿QUE PASO HOY?", "AM", 850);
    
    emisora FM1 = new emisora("SALUDOS", "FM", 87.9);
    emisora FM2 = new emisora("DISNEY FM", "FM", 88.1);
    emisora FM3 = new emisora("TOP HITS", "FM", 88.4);
    emisora FM4 = new emisora("TOPIC", "FM", 88.9);
    emisora FM5 = new emisora("FM JOYA", "FM", 89.1);
    emisora FM6 = new emisora("SABROSONA", "FM", 90.9);
    
	@Override
	public void encenderRadio() {
		if(estadoRadio == false) {
			estadoRadio = true;
		    
			AM.add(AM1); AM.add(AM2); AM.add(AM3); AM.add(AM4); AM.add(AM5); AM.add(AM6);
			FM.add(FM1); FM.add(FM2); FM.add(FM3); FM.add(FM4); FM.add(FM5); FM.add(FM6);
			
			JOptionPane.showMessageDialog(null, "Se encendio el radio");
		}else {
			JOptionPane.showMessageDialog(null, "El radio ya esta encendido");
		}
	}
	
	@Override
	public void cambiarFrecuencia() {
		if(estadoRadio == true) {
			if(emisoraActual.getFrecuenciaEmisora() == "AM"){
				emisoraActual.setNombreEmisora("SALUDOS");
				emisoraActual.setFrecuenciaEmisora("FM");
				emisoraActual.setNumeroEmisora(87.9);
				JOptionPane.showMessageDialog(null, "Se cambio a la emisora: " + emisoraActual.getFrecuenciaEmisora());
				contFM = 1;
			}else {
				emisoraActual.setNombreEmisora("LO MEJOR");
				emisoraActual.setFrecuenciaEmisora("AM");
				emisoraActual.setNumeroEmisora(530);
				JOptionPane.showMessageDialog(null, "Se cambio a la emisora: " + emisoraActual.getFrecuenciaEmisora());
				contAM = 1;
			}
		}else {
			JOptionPane.showMessageDialog(null, "No puedes realizar esta acción \n porque el radio esta apagado");
		}

	}
	
	@Override
	public void avanzarEmisora() {
		if(estadoRadio == true) {
			
			if(contFM >= 6 || contAM >= 6) {
				contFM = 0;
				contAM = 0;
			}
			
			if(emisoraActual.getFrecuenciaEmisora() == "FM" && contFM < 6) {
				emisoraActual.setNombreEmisora(FM.get(contFM).getNombreEmisora());
				emisoraActual.setFrecuenciaEmisora(FM.get(contFM).getFrecuenciaEmisora());
				emisoraActual.setNumeroEmisora(FM.get(contFM).getNumeroEmisora());
				contFM += 1;
				
			}else if(emisoraActual.getFrecuenciaEmisora() == "AM" && contAM < 6){
				emisoraActual.setNombreEmisora(AM.get(contAM).getNombreEmisora());
				emisoraActual.setFrecuenciaEmisora(AM.get(contAM).getFrecuenciaEmisora());
				emisoraActual.setNumeroEmisora(AM.get(contAM).getNumeroEmisora());
				contAM += 1;
			}	
			
		}else {
			JOptionPane.showMessageDialog(null, "No puedes realizar esta acción \n porque el radio esta apagado");
		}
	}
	
	@Override
	public void guardarEmisora() {
		if(estadoRadio == true) {
			if(contGuardado <= 12) {
				arrayEmisorasGuardadas.add(emisoraActual);
				JOptionPane.showMessageDialog(null, "Esta emisora se almaceno en el espacio: No." + contGuardado);
				contGuardado += 1;
			}else {
				JOptionPane.showMessageDialog(null, "Sobrepasaste los limites de guardado...");
			}
		}else {
			JOptionPane.showMessageDialog(null, "No puedes realizar esta acción \n porque el radio esta apagado");
		}
		
	}
	
	@Override
	public void seleccionarEmisoraGuardada() {
		
		if(estadoRadio == true) {
			int nGuardada = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opción deseada"));
			if(nGuardada < arrayEmisorasGuardadas.size()) {
				emisoraActual.setNombreEmisora(arrayEmisorasGuardadas.get(nGuardada).getNombreEmisora());
				emisoraActual.setFrecuenciaEmisora(arrayEmisorasGuardadas.get(nGuardada).getFrecuenciaEmisora());
				emisoraActual.setNumeroEmisora(arrayEmisorasGuardadas.get(nGuardada).getNumeroEmisora());
				
		        for (int i = 0; i < arrayEmisorasGuardadas.size(); i++) {
		        	//System.out.println(arrayEmisorasGuardadas.get(i).getNombreEmisora());
		        }
				

				JOptionPane.showMessageDialog(null, "Tu emisora se cargo correctamente");	
			}else {
				JOptionPane.showMessageDialog(null, "No hay registros en ese espacio");
			}
			if(nGuardada > 12) {
				JOptionPane.showMessageDialog(null, "No puedes pasar de 12...");
			}
		}else {
			JOptionPane.showMessageDialog(null, "No puedes realizar esta acción \n porque el radio esta apagado");
		}
	}
	
	@Override
	public void apagarRadio() {
		if(estadoRadio == true) {
			estadoRadio = false;
			JOptionPane.showMessageDialog(null, "Se apago el radio");
			AM.clear();
			FM.clear();
		}else {
			JOptionPane.showMessageDialog(null, "El radio ya esta apagado");
		}
	}
}
