package FuncionalidadNueva;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public aspect manejoDeProcesos {
	
	after(): execution (public * realizar*(..)) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		String fechaHora = dtf.format(LocalDateTime.now());
		System.out.println("Movimiento realizado a las " + fechaHora) ;
	}
}
