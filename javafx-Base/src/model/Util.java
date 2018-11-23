package model;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

import javafx.scene.chart.XYChart;
import javafx.scene.control.DatePicker;

public class Util {
	
	public static Date toDate(DatePicker datePicker) {
        if(datePicker.getValue() == null){
            return null;
        }
        LocalDate ld = datePicker.getValue();
        Instant instant = ld.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant();
        Date date = Date.from(instant);
        return date;
    }
	
   public static  XYChart.Series<String, Number>  gerarSerieNomeVsMesNascimento(Set<Cliente> clientes) {
    	Calendar c = Calendar.getInstance();
    	XYChart.Series<String, Number> series = new XYChart.Series<>();
    	series.setName("Mes nascimento por Cliente");
    	for(Cliente e: clientes) 
		{
    		c.setTime(e.getDataNascimento());
			series.getData().add(new XYChart.Data<String, Number>(e.getNome(),c.get(Calendar.MONTH)+1));
		}
    	return series;
    }
	
}
