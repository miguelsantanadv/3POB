package JAVA_AV2;

public class Reserva {
	private int idReserva;
	private int idQuarto;
	private int idCama;
	private int idCliente;
	private String dtEntrada;
	private String dtSaida;
	
	public Reserva(int idReserva, int idQuarto, int idCama, int idCliente, String dtEntrada, String dtSaida) {
		this.idReserva = idReserva;
		this.idQuarto = idQuarto;
		this.idCama = idCama;
		this.idCliente = idCliente;
		this.dtEntrada = dtEntrada;
		this.dtSaida = dtSaida;
	}

	public int getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}

	public int getIdQuarto() {
		return idQuarto;
	}

	public void setIdQuarto(int idQuarto) {
		this.idQuarto = idQuarto;
	}

	public int getIdCama() {
		return idCama;
	}

	public void setIdCama(int idCama) {
		this.idCama = idCama;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getDtEntrada() {
		return dtEntrada;
	}

	public void setDtEntrada(String dtEntrada) {
		this.dtEntrada = dtEntrada;
	}

	public String getDtSaida() {
		return dtSaida;
	}

	public void setDtSaida(String dtSaida) {
		this.dtSaida = dtSaida;
	}
}
