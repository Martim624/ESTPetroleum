package petroleum;

import java.util.ArrayList;

/** Classe que representa a central de distribuição de combústivel.
 * Deve conter todas as informações, como os camiões, os postos, etc.
 * É ainda responsável por controlar todos os elemenots e operações
 */
public class Central {
	// constantes para os erros que podem surgir udurante a realização das operações
	/** Correu tudo bem com a operação */
	public static final int ACEITE = 0;
	/** Usada quando se pretende adicionar um pedido a um posto, mas este não precisa */
	public static final int POSTO_NAO_PRECISA = ACEITE + 1;
	/** Indica que uma quantidade de litros excede a capacidade do posto de a armazenar */
	public static final int EXCEDE_CAPACIDADE_POSTO = POSTO_NAO_PRECISA + 1;
	/** Indica que uma quantidade de litros excede a capacidade do camião de a armazenar */
	public static final int EXCEDE_CAPACIDADE_CAMIAO = EXCEDE_CAPACIDADE_POSTO + 1;
	/** Indica que o camião não pode satisfazer um pedido, pois este iria exceder o tempo de turno */ 
	public static final int EXCEDE_TEMPO_TURNO = EXCEDE_CAPACIDADE_CAMIAO + 1;

	private ArrayList<Camiao> camioes;
	private ArrayList<Posto> postos;
	/** retorna o camião associado a uma matricula
	 * @param matricula matrícula a pesquisar matricula
	 * @return o camião com a matrícula indicada, ou null se não existir
	 */
	public Camiao getCamioes(String matricula) {
		for (Camiao camiao : camioes) {
			if (camiao.getMatricula().equals(matricula)) {
				return getCamioes(matricula);
			}
		}
		return null; 
	}
	
	/** retorna o posto que tem um dado id
	 * @param id id a pesquisar
	 * @return o posto com o id, ou null se não existir
	 */
	public Posto getPosto( int id ) {
		// TODO fazer este método
		return null;
	}


	/** processa uma entrega, isto é, associa o pedido ao camião respetivo
	 * @param posto posto onde entregar o combústivel
	 * @param litros litros a entregar
	 * @param camiao camião que irá fazer a entrega
	 * @return ACEITE, o pedido foi adicionado ao camião<br>
	 *         EXCEDE_CAPACIDADE_CAMIAO, se o número de litros for superior
	 *         ao que o camião tem disponível<br>
	 *         EXCEDE_TEMPO_TURNO, se o pedido implicar um tempo maior que um turno
	 *         POSTO_NAO_PRECISA, se o posto não necessita de ser abastecido
	 *         EXCEDE_CAPACIDADE_POSTO, se o posto não tem capacidade de armazenar os litros indicados      
	 */
	public int processarEntrega(Posto posto, int litros, Camiao camiao) {
		// TODO fazer este método
		return ACEITE;
	}

	
	/** finaliza um turno, isto é, realiza os itinerários e
	 * processa os gastos dos postos 
	 */
	public void finalizarTurno() {
		realizarItinerarios();
		processarGastosPostos();
	}
	
	/** realiza os itinerários, isto é, faz os camiões
	 * transportar o combústivel para os postos adjudicados 
	 */
	private void realizarItinerarios() {
		// TODO fazer este método
	}
	
	/** processa os gastos dos postos
	 */
	private void processarGastosPostos() {
		// TODO fazer este método
	}

	public void setCamioes(ArrayList<Camiao> camioes) {
		this.camioes = camioes;
	}
	
	public void mostrarCamioes() {
        if (camioes != null && !camioes.isEmpty()) {
            System.out.println("Camiões na central:");
            for (Camiao camiao : camioes) {
                System.out.println(camiao);
            }
        } else {
            System.out.println("Não há camiões na central.");
        }
    }

	public void setPostos(ArrayList<Posto> postos) {
		this.postos = postos;
	}
	
	public void mostrarPostos() {
	    if (postos != null && !postos.isEmpty()) {
	        System.out.println("Postos na central:");
	        for (Posto posto : postos) {
	            System.out.println(posto); 
	        }
	    } else {
	        System.out.println("Não há postos na central.");
	    }
	}
}
