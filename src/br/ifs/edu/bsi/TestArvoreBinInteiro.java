package br.ifs.edu.bsi;

public class TestArvoreBinInteiro {

	public static void main(String[] args) {		
		int n;
		
		do {
			menu();
			n = 1;
			ArvoreBinInteiro tree = new ArvoreBinInteiro();
			
			switch (n) {
				case 1:
					tree.add(5);
					tree.add(6);
					tree.add(7);
					tree.add(5);
					break;
				
				case 2:
					System.out.println("Maior número: " + tree.getMaior());
					break;
				
				case 3:
					System.out.println("Menor número: " + tree.getMenor());
					break;
				
				case 4:
					System.out.println("Altura da árvore: " + tree.getAltura());
					break;
					
				case 5:
					tree.listarPre();
					break;
					
				case 6:
					tree.listarPro();
					break;
					
				case 7:
					tree.listarSimetrico();
					break;
					
				case 8:
					tree.listarNiveis();
					break;
					
				case 9:
					tree.listarInternos();
					break;
					
				case 10:
					tree.listarFolhas();
					break;
					
				case 11:
					tree.listarCaminho(0);
					break;
					
				case 12:
					System.out.println("Raíz: " + tree.getRaiz());
					break;
					
				case 0:
					System.out.println("Saindo <3");
					break;	
			}
			
		}while (n != 0);

	}
	public static void menu() {
		System.out.println(
		" 1. Inserir um número \n 2. Retornar o maior número \n 3. Retornar o menor número \n 4. Retornar a altura da árvore " +
		"\n 5. Listar números (percurso Pré-Ordem) \n 6. Listar números (percurso Pós-Ordem) \n 7. Listar números (percurso Simétrico)" +
		"\n 8. Listar números (percurso em níveis) \n 9. Listar os números internos \n 10. Listar as folhas \n 11. Exibir caminho da raiz a um número" +
		"\n 12. Retorna raiz \n 0. Sair");
	}
}
