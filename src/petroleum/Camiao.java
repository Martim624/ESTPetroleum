package petroleum;
import java.awt.Point;

import menu.Mapa;

/** Esta classe representa um camião, que, neste contexto, se refere à capacidade de transportar
 * combústivel. Tem para isso um limite máximo de combústivel que pode transportar e a
 * quantidade de combústvel que transporta num dado momento.
 * Cada camião desloca-se a uma velocidade, que para simplificar, iremos contabilizar como a velocidade média.
 * Um camiºão segue um itinerário, sendo que deve terminar o itinerário dentro 
 * do limite de tempo de um turno de 14 horas )2 condutores com turnos de 7 horas cada).
 */
public class Camiao {
	public static final int TEMPO_TURNO = 14 * 3600;
	private String matricula;
	private int capacidade;
	private int velocidadeMedia;
	private int debito;
	
	public Camiao(String matricula, int capacidade, int velocidadeMedia, int debito) {
	    this.matricula = matricula;
	    this.capacidade = capacidade;
	    this.velocidadeMedia = velocidadeMedia;
	    this.debito = debito;
	}
	
	public String toString() {
        return "Matrícula: " + matricula +
               ", Capacidade: " + capacidade + " litros" +
               ", Velocidade Média: " + velocidadeMedia + " km/h" +
               ", Débito: " + debito + " litros/segundo";
    }
	
	/** o tempo máximo de um turno, que são as 14 horas
	 * (2 condutores), dadas em segundos */
	
	
	/** indica se o Camião pode acrescentar o seguinte pedido ao seu itinerário
	 * @param posto posto que pede o abastecimento
	 * @param litros litros que o posto pretende
	 * @return ACEITE, se aceitar o pedido <br>
	 *         EXCEDE_CAPACIDADE_CAMIAO, se o número de litros for superior
	 *         ao que o camião tem disponível<br>
	 *         EXCEDE_TEMPO_TURNO, se o pedido implicar um tempo maior que um turno      
	 *          
	 */
	public int podeFazerPedido(Posto posto, int litros) {
		// TODO implementar este método
		return Central.ACEITE;
	}
	
	/** adiciona um posto ao itinerário do camião, se for possível.
	 * @param p posto que pede o abastecimento
	 * @param litros litros que o posto pretende
	 * @return ACEITE, se aceitar o pedido <br>
	 *         EXCEDE_CAPACIDADE_CAMIAO, se o número de litros for superior
	 *         ao que o camião tem disponível<br>
	 *         EXCEDE_TEMPO_TURNO, se o pedido implicar um tempo maior que um turno      
	 */
	public int addPosto( Posto p, int litros ) {
		// TODO fazer este método
		return Central.ACEITE;
	}

	/** retorna o tempo, em segundos, que demora a fazer o itinerário
	 * @return o tempo, em segundos, que demora a fazer o itinerário 
	 */
	public double duracaoTurno( ) {
		// TODO fazer este método
		return 0;
	}
	
	/** retorna o tempo, em segundos, que demora a fazer o itinerário
	 * acrescentando um posto extra
	 * @param extra o posto extra a processar
	 * @param nLitros oslitros que o posto extra precisa
	 * @return tempo, em segundos, que demora a fazer o itinerário mais o posto extra
	 */
	public double duracaoTurnoExtra( Posto extra, int nLitros ) {
		// TODO fazer este método
		return 0;
	}

	/** Efetua o transporte e transferência de combustível
	 * para todos os postos no itinerário
	 */
	public void transporta( ){
		// TODO fazer este método
	}

	/** retorna o tempo, em segundos, que demora a percorrer o caminho entre
	 * dois pontos.
	 * @param ini o ponto inical
	 * @param fim o ponto final
	 * @return o tempo que demora a ir de ini a fim.
	 */
	private double tempoPercorrer( Point ini, Point fim ){
		// TODO terminar este método (distância / velocidade)
		return Mapa.distancia(ini, fim);
	}
	
	/** retorna quanto tempo demora, em segundos, a transferir a quantidade de liquido
	 * @param nLitros a quantidade de liquido a transferir
	 * @return o tempo que demora, em segundos, a transferir os nLitros
	 */
	private double tempoDespejar( int nLitros ){
		// TODO fazer este método
		return 0;
	}
	
	/** retorna a percentagem de ocupação do camião, entre 0 (0%) e 1 (100%)
	 * @return a percentagem de ocupação 
	 */
	public float percentagemOcupacao() {
		// TODO fazer este método
		return 0;
	}
	
	/** retorna a capacidade livre, isto é, quantos litros ainda pode
	 * adicionar à carga
	 * @return a capacidade livre, em litros
	 */
	public int capacidadeLivre() {
		// TODO fazer este método
		return 0;
	}

	public String getMatricula() {
		return matricula;
	}
	
	public int getCapacidade() {
		return capacidade;
	}
	
	public int getVelocidadeMedia() {
		return velocidadeMedia;
	}
	
	public int getDebito() {
		return debito;
	}
}
