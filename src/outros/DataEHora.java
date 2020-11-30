package outros;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DataEHora {

	private Calendar c = Calendar.getInstance();
	private SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
	
	private String hora = Integer.toString(c.getTime().getHours());
	private String minutos = Integer.toString(c.getTime().getMinutes());
	private String segundos = Integer.toString(c.getTime().getSeconds());
	
	public String getHora() {
		return hora+":"+minutos+":"+segundos;
	}
	
	public String getData(){
		c.setTime(c.getTime());
		return formato.format(c.getTime());
	}

	
}
