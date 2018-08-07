package br.unicentro.acaddecomp;

public class GatoQuantico {
	public final Estado vivo = new EstadoVivo();
	public final Estado morto = new EstadoMorto();
	public final Estado quantico = new EstadoQuantico();
	
	private Estado estado;

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	public void miar(){
		estado.miar();
	}
}
