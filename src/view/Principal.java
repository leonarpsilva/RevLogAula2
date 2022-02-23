package view;

import controller.OperacoesController;

public class Principal {

	public static void main(String[] args) {
		
		OperacoesController op = new OperacoesController();
		op.numeros();
		op.alturaSexo();
    	op.valorMercadorias();
		op.maisMercadorias();

	}

}
