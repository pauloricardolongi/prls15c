package model.entidades;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {
	private Integer numeroQuarto;
	private Date checkIn;
	private Date checkOut;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reserva(Integer numeroQuarto, Date checkIn, Date checkOut) {
		this.numeroQuarto = numeroQuarto;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	public Integer getNumeroQuarto() {
		return numeroQuarto;
	}
	public void setNumeroQuarto(Integer numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}
	public Date getCheckIn() {
		return checkIn;
	}
	
	public Date getCheckOut() {
		return checkOut;
	}
	public long duracao() {
		//diferen�a em milessegundos
		long diferenca = checkOut.getTime() - checkIn.getTime();
		//converter milessegundos para dias
		return TimeUnit.DAYS.convert(diferenca, TimeUnit.MILLISECONDS);
	}
	public void atualizar(Date checkIn, Date checkOut ) {
		this.checkIn= checkIn;
		this.checkOut= checkOut;
	}
	@Override
	public String toString() {
		return "Quarto"
				+ numeroQuarto
				+ ",check-in: "
				+ sdf.format(checkIn)
				+ ", check-out:"
				+ sdf.format(checkOut)
				+ ","
				+ duracao()
				+"noites";
	}
	

}
