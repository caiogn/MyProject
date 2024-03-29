/**
 * 
 */
package cursojava;

/**
 * @author Usuario
 *
 */
public class Fundamentos {
//comentando apenas para criar um commit

	public static void main(String[] args) {
		String nome = "Caio César";
		int idade = 21; 
		char sexo = 'M';
		double altura = 1.80; 
		boolean rico = false;
        System.out.println("Nome: " + nome);
        System.out.println("Informações");
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
        System.out.println("Altura: " + altura);
        System.out.println("Rico: " + rico);
        System.out.println("__________________");
        System.out.println("");
        int i = 2;
        System.out.println("Operadores Aritiméticos e Atribuições");
        System.out.println("exemplos: ");
        System.out.println("i = " + i);
        System.out.println("i = " + i + " + 5 = " + (i + 5));
        System.out.println("");
        System.out.println("Agora multiplicação");
        System.out.println("i = " + i + " * 5 = " + (i * 5));
        System.out.println("__________________");
        System.out.println("");
        System.out.println("Estruturas de controle - Uso do 'if'");
        if (sexo == 'M') {
        	System.out.println("Alistamento Militar Obrigatório");
        }
        System.out.println("");
        System.out.println("Estruturas de controle - Uso do 'if - else'");
        if (idade < 18) {
        	System.out.println("Menor de idade");
        } else {
        	System.out.println("Maior de idade");
        }
        System.out.println("");
        System.out.println("Estruturas de controle - Uso do 'else-if'");
        if (idade < 16) {
        	System.out.println("Proibido Votar");
        } else if (idade >= 18 && idade <= 70) {
        	System.out.println("Voto Obrigatório");
        } else if (idade == 16 || idade == 17 || idade > 70) {
        	System.out.println("Voto facultativo");
        }
        System.out.println("");
        System.out.println("Estruturas de controle - Uso do 'switch case'");
        System.out.println("");
        System.out.println("1 CADASTRO DE CLIENTES");
        System.out.println("2 CADASTRO DE USUARIOS");
        System.out.println("3 RELATORIOS");
        int opcao = 3;
        switch (opcao) {
        case 1: 
        	System.out.println("CLIENTES");
        	break;
        case 2:
        	System.out.println("USUARIOS");
        	break;
        case 3:
        	System.out.println("RELATÓRIOS");
        	break;
        default:
        	System.out.println("Opção Invalida");
        	break; 
        }
        System.out.println("");
        System.out.println("Estruturas de repetições");
        System.out.println("");
        System.out.println("Uso do 'For'");
        for (int j = 10; j > 0; j--) {
        	System.out.println(j);
        }
        System.out.println("");
        System.out.println("Tabuada");
        for (int tabuada = 0; tabuada <=10; tabuada++) {
        	System.out.println("");
        	for (int valor = 0; valor <= 10; valor++) {
        		System.out.println(tabuada + " x " + valor + " = " + (tabuada * valor));
        	}
        }
	}

}
