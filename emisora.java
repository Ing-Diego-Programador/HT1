
public class emisora {
	
    private String nombreEmisora, frecuenciaEmisora;
    private double numeroEmisora;
    
    emisora(String nombreEmisora, String frecuenciaEmisora, double numeroEmisora){
    	this.nombreEmisora = nombreEmisora;
    	this.frecuenciaEmisora = frecuenciaEmisora;
    	this.numeroEmisora = numeroEmisora;
    }
    
    emisora(){
    	
    }

	public String getNombreEmisora() {
		return nombreEmisora;
	}

	public void setNombreEmisora(String nombreEmisora) {
		this.nombreEmisora = nombreEmisora;
	}

	public String getFrecuenciaEmisora() {
		return frecuenciaEmisora;
	}

	public void setFrecuenciaEmisora(String frecuenciaEmisora) {
		this.frecuenciaEmisora = frecuenciaEmisora;
	}

	public double getNumeroEmisora() {
		return numeroEmisora;
	}

	public void setNumeroEmisora(double numeroEmisora) {
		this.numeroEmisora = numeroEmisora;
	}
    
    
}
