package arranque;
import java.awt.Point;
import java.util.ArrayList;

import menu.Mapa;
import menu.JanelaControlo;
import petroleum.Camiao;
import petroleum.Central;
import petroleum.Posto;

/** Responsável por cria o ambiente de execução e criar a janela */
public class Main {

	public static void main(String[] args) {
		Central c = new Central();
		
		ArrayList<Posto> postos = criarPostos();
        c.setPostos(postos);

		
		ArrayList<Camiao> camioes = criarCamioes();
        c.setCamioes(camioes);
		
        
        c.mostrarCamioes();
		c.mostrarPostos();
		// criar a apresentar a janela principal
		JanelaControlo postosFrame = new JanelaControlo( c );
		postosFrame.setVisible( true );
	}
	
	private static ArrayList<Posto> criarPostos(){
		ArrayList<Posto> postos = new ArrayList<>();
		
		postos.add(new Posto(1, "Minas Tirith", new Point(1400, 990), 2200, 10000, 40000));
	    postos.add(new Posto(2, "Isengard", new Point(925, 710), 3200, 7000, 30000));
	    postos.add(new Posto(3, "Dol Guldur", new Point(1235, 510), 2300, 17000, 30000));
	    postos.add(new Posto(4, "Rivendell", new Point(890, 310), 800, 15000, 20000));
	    postos.add(new Posto(5, "Hobbiton", new Point(455, 335), 1300, 25000, 30000));
	    postos.add(new Posto(6, "Edoras", new Point(1035, 800), 1300, 20000, 25000));
	    postos.add(new Posto(7, "Barad-dur", new Point(1690, 915), 2300, 5000, 35000));
	    postos.add(new Posto(8, "Amon Sul", new Point(735, 310), 1800, 6000, 25000));
	    postos.add(new Posto(9, "Erebor", new Point(1500, 180), 1750, 4000, 30000));
	    postos.add(new Posto(10, "Moria", new Point(860, 500), 2100, 7000, 35000));
	    postos.add(new Posto(11, "Cirith Ungol", new Point(1540, 980), 1200, 2000, 25000));
	    postos.add(new Posto(12, "Emyn Muil", new Point(1380, 700), 1600, 18000, 25000));
	    postos.add(new Posto(13, "Linhir", new Point(1110, 1180), 1900, 5000, 30000));
	    postos.add(new Posto(14, "Dom Beornd", new Point(1090, 240), 1600, 5000, 30000));
	    postos.add(new Posto(15, "Harlond", new Point(175, 400), 2000, 8000, 30000));
	    
		return postos;
		
		
	}
	
	 private static ArrayList<Camiao> criarCamioes() {
	        ArrayList<Camiao> camioes = new ArrayList<>();
	        
	        Camiao camiao1 = new Camiao("11-FG-33", 20000, 65, 20);
	        camioes.add(camiao1);

	        Camiao camiao2 = new Camiao("22-DV-22", 30000, 50, 30);
	        camioes.add(camiao2);

	        Camiao camiao3 = new Camiao("AA-34-BB", 35000, 70, 30);
	        camioes.add(camiao3);

	        Camiao camiao4 = new Camiao("CF-65-FC", 40000, 45, 40);
	        camioes.add(camiao4);

	        return camioes;
	    }


}
