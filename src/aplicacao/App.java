package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entidades.Reserva;

public class App {

	public static void main(String[] args) throws ParseException {
		Scanner sc= new Scanner(System.in);
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Número do Quarto");
		int numero= sc.nextInt();
		System.out.print("Data de check-in (dd/MM/yyyy)");
		Date checkIn = sdf.parse(sc.next());
		System.out.print("Data de check-out (dd/MM/yyyy)");
		Date checkOut = sdf.parse(sc.next());
		
		if (! checkOut.after(checkIn)) {
			System.out.println("Erro data de saída deve ser	depois da data de entrada");
		}
		else {
			Reserva reserva = new Reserva(numero, checkIn, checkOut);
			System.out.println("Reserva:" + reserva);
			System.out.println();
			
			System.out.println("Entre com atualização da reserva");
			System.out.print("Data de check-in (dd/MM/yyyy)");
		    checkIn = sdf.parse(sc.next());
			System.out.print("Data de check-out (dd/MM/yyyy)");
		    checkOut = sdf.parse(sc.next());
		    
		    Date now = new Date();
		    if(checkIn.before(now)|| checkOut.before(now) ) {
		    System.out.println("Erro de reserva: a data de saída deve ser posterior a data de entrada ");
		    		    		    
		    }else if (! checkOut.after(checkIn)) {
		    	System.out.println("Erro data de saída deve ser	depois da data de entrada");
		    
		    }
		    else {
		    	System.out.println("Reserva:" + reserva);
		    }
		      
		}
		
        sc.close();
	}

}
