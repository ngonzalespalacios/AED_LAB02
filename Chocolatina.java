package LAB02;

public class Chocolatina {
	private String nombre;
	private double porcentajeCacao;
	
	public Chocolatina(String nombre,double porcentajeCacao) {
		this.nombre=nombre;
		this.porcentajeCacao = porcentajeCacao;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public double getPorcentajeCacao() {
		return porcentajeCacao;
	}
	public void setPorcentajeCacao(double porcentajeCacao) {
		this.porcentajeCacao = porcentajeCacao;
	}
	
	 @Override
	    public boolean equals(Object o) {
	        if (o instanceof Chocolatina) {
	            Chocolatina c = (Chocolatina) o;
	            return nombre.equals(c.nombre) && porcentajeCacao == c.porcentajeCacao;
	        }
	        return false;
	    }

	    @Override
	    public String toString() {
	        return nombre + " (" + porcentajeCacao + "% cacao)";
	    }

}
