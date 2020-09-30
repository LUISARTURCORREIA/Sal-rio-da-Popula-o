/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicativodosalariodapopulacao;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AplicativoDoSalarioDaPopulacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leia = new Scanner(System.in);
       double salario = 0, mediaSalario = 0, maiorSalario = 0, percentualSalario = 0, salarioCalculo = 0, percentualMenor150 = 0;
       int filhos = 0, mediaFilho = 0, atual = 1, cadastrarNovo = 0, pessoas = 0;
       String aux = "";
       System.out.println("Ao digitar sair, você irá sair do programa");
       while(true){
           cadastrarNovo = 0;
           System.out.println("Qual o salario?");
           aux = leia.next();
           if(aux.equals("sair")){
               System.out.println("Processo encerrado");
               break;
           }
           else{
               salario = Double.parseDouble(aux);
               if(salario <= 150){
               pessoas = pessoas + 1;
               percentualMenor150 = ((pessoas*100)/atual);
               }
               salarioCalculo += salario;
               mediaSalario = salarioCalculo / atual;
               System.out.println("Quantos filhos você tem?");
               filhos = leia.nextInt();
               mediaFilho = filhos / atual;
               if(salario > maiorSalario){
                   maiorSalario = salario;
               }
               System.out.println("Quantas vezes rodou " + atual + " Quantas pessoas com menor de 150 " + pessoas);
               System.out.println("Seu salario é " + salario + "\nA média atual é " + mediaSalario + "\nMédia de número de filhos é " + mediaFilho + "\nMaior salario é " + maiorSalario);
               System.out.println("Percentual com menor de 150 reais é " + percentualMenor150 + "%");
               System.out.println("Deseja cadastrar um novo usuario? \n 1 para sim");
               cadastrarNovo = leia.nextInt();
               if(cadastrarNovo == 0){
                   System.out.println("Processo encerrado");
                   break;
               } else{
                   atual++;
               }
               
       }
   }
    }
}
