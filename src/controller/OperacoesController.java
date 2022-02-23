package controller;

import javax.swing.JOptionPane;

public class OperacoesController {
	
	public OperacoesController() {
		super();
	}

	public void numeros() {
		int i, soma, num[] = new int[10];
		i=0;
		soma=0;
		for (i=0; i<10; i++) {
			num[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i+1) + "° numero"));
			if (num[i] < 40) {
				soma = soma + num[i];
				
			}
		}
		System.out.println("a soma de todos os numeros inferiores a 40 é de: " + soma);
	}
	
	public void alturaSexo() {
		int sexo, qntm=0, qnth=0, i=0;
        float altura, somah=0, mediah=0, maior=0, menor=3;
        for (i=0; i<10; i++) {
        	sexo = Integer.parseInt(JOptionPane.showInputDialog("digite 1 para mulher e 2 para homem: "));
        	altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura da pessoa: "));
        	if (sexo == 1) {
                qntm++;
            } else if (sexo == 2) {
                qnth++;
                somah = somah + altura;
            } else {
                System.out.println("digite um sexo valido");
            }
            if (altura > maior) {
                 maior = altura;
            } else if (altura < menor){
                 menor = altura;
            }
        }
        mediah = somah / qnth;

        System.out.println("a maior altura é de " + maior + "metros , e a menor é de " + menor + "metros");
        System.out.println("a media de altura dos homens é " + mediah + "metros");
        System.out.println("o numero de mulheres é " + qntm);
    }
	
	public void valorMercadorias() {
		int mercadoria=0, i=0, m = 0;
		mercadoria = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero total de mercadorias:"));
		m = mercadoria + 0;
		float valor_total=0, media=0, valor_m[] = new float[m]; 
		for (i=0; i<m; i++) {
			valor_m[i] = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do " + (i+1) + "° produto"));
			valor_total = valor_total + valor_m[i];
		}
		media = valor_total / mercadoria;
		System.out.println("o valor total de mercadorias é de: " + valor_total + "reais");
		System.out.println("a media dos valores é de: " + media + "reais");
	}
	
	public void maisMercadorias() {
		int mercadoria, cont=1;
		float valor_total, valor_m, media;
		valor_m = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da mercadoria: "));
		valor_total = valor_m;
		mercadoria = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 caso queira adicionar outra mercadoria ou Digite 2 caso não queira"));
		while(mercadoria == 1) {
			cont = cont + 1;
			valor_m = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da mercadoria: "));
			valor_total = valor_total + valor_m;		
			mercadoria = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 caso queira adicionar outra mercadoria ou Digite 2 caso não queira"));
		}
		media = valor_total / cont;
		System.out.println("o valor total de mercadorias é de: " + valor_total + "reais");
		System.out.println("a media dos valores é de: " + media + "reais");
	}
	
	
	

}
