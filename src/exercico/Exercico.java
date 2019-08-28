/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercico;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 20181CMQ.ADS0069
 */
public class Exercico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero = 0;
        int opcao = 0;
        Scanner ler = new Scanner(System.in);
        Random randon = new Random();
        
        do {
            System.out.println("1 - Jogar Adivinhe o número");
            System.out.println("2 - Imprimir de 0 a 100, só os impares");
            System.out.println("3 - Imprimir de 0 a 10, só os pares");
            System.out.println("4 - Sair");
            System.out.println("");
            System.out.print("Escolha uma das opções acima: ");
            opcao = ler.nextInt();
            
            if(opcao == 1){
                numero = randon.nextInt(100);
                System.out.println("");
                System.out.print("Número gerado randomicamente: " + numero);
                System.out.println("");
                System.out.println("");
                
            }else if (opcao == 2){
                
                for (int i = 0; i <= 100; i++){
                    if (i%2!=0){
                        System.out.println(i);
                    }
                }
                
            }else if (opcao == 3){
                int i = 0;
                while (i <= 100){
                    if (i%2 == 0){
                        System.out.println(i);
                    }
                    i++;
                }
                
            }else if (opcao == 4){
                System.exit(0);
            }
            
            if(opcao < 1 || opcao > 4){
                System.out.println("");
                System.out.println("Opção inválida, tente novamente!");
                System.out.println("");
                opcao = 1;
            }
            
        } while (opcao > 0 && opcao < 5);

    }

}
