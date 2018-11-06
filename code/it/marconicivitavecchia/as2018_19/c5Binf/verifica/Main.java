
// TODO Inserire il package corretto
package it.marconicivitavecchia.as2018_19.c5Binf.verifica;

import javax.swing.*;

public class Main extends JFrame {
	
	public Main() {
		super("Project X");
		super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		// DONE Inserire la size in accordo con il wireframe
		super.setSize(1200,600);
		
		// DONE Usare StringBuilder per costruire la stringa HTML
		StringBuilder sb = new StringBuilder();
		sb.append("<html>");
		sb.append("<body>");
		sb.append("<div style='border: 2px'>");
		sb.append("<h1> Almanacco astronomico </h1>");
		sb.append("<h2> Novembre 2018 </h2>");
		sb.append("<p> <b>Il Sole.</b> <i>In Novembre perderemo complessivamente 1 ora e 3 minuti di luce.</i></p>");
		// TODO Creare la stringa HTML per il wireframe
		
		// create a table
		sb.append("<div style='display:table'>");	
		
		// create a row
		sb.append("<div style='display:table-row'>");
		
		// create a cell
		sb.append("<div style='display:table-cell'>");	
		sb.append("Data");
		sb.append("</div>");
		
		sb.append("<div style='display:table-cell'>");
		sb.append("Sorge");
		sb.append("</div>");
		
		sb.append("<div style='display:table-cell'>");
		sb.append("Tramonta");
		sb.append("</div>");
		
		sb.append("</div>");//close div row	
		
		sb.append("<hr>");//create a line	
		 
		 
		// create a row
		sb.append("<div style='display:table-row'>");
		
		sb.append("<div style='display:table-cell'>");	
		sb.append("1gio");
		sb.append("</div>");
		
		sb.append("<div style='display:table-cell'>");
		sb.append("6:55");
		sb.append("</div>");
		
		sb.append("<div style='display:table-cell'>");
		sb.append("17:10");
		sb.append("</div>");
		
		sb.append("</div>");//close div row	
		sb.append("<div style='display:table-row'>");
		
		// create a cell
		sb.append("<div style='display:table-cell'>");	
		sb.append("2ven");
		sb.append("</div>");
		
		sb.append("<div style='display:table-cell'>");
		sb.append("6:56");
		sb.append("</div>");
		
		sb.append("<div style='display:table-cell'>");
		sb.append("17:08");
		sb.append("</div>");
		
		sb.append("</div>");//close div row	
		
		// create a row
		sb.append("<div style='display:table-row'>");	
		sb.append("<div style='display:table-cell'>");	
		sb.append("3sab");
		sb.append("</div>");
		
		sb.append("<div style='display:table-cell'>");
		sb.append("6:55");
		sb.append("</div>");
		
		sb.append("<div style='display:table-cell'>");
		sb.append("17:07");
		sb.append("</div>");
		
		sb.append("</div>");//close div row	
		
		sb.append("</div>");//close div table
		sb.append("</div>");//close container
		sb.append("</body>");//close body
		sb.append("</html>");
		
		// DONE Convertire lo StringBuilder in String
		String htmlText = sb.toString();
		// DONE Assegnare correttamente la stringa create a JLabel
		super.add(new JLabel(htmlText));
		super.setVisible(true);
		 
		System.out.println(htmlText);
		
		System.out.println("Verifica Swing-GitHub");
		
		
	}
	
	public static void main (String[] args) {
		new Main();
	}
}

