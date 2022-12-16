
/*Crie um programa que através do ano de nascimento do usuario ele/ela possa verificar se o voto dele/dela é obrigatorio, opcional ou não vota,
 * na main faça um tratamento de erro, esse progarama precisa conter pelo menos um metodo.
 */

import java.util.InputMismatchException;
import java.util.Scanner;
    public class votacao{
        public static void main(String[] args) throws Exception{
            Scanner entrada = new Scanner(System.in);
            int idade;
            int ano = 2022;
            
            try{ // Vai tentar executar o código 
            System.out.println("Digite o ano em que voçê nasceu (lembrando que deve ser menor ou igual a 2022): ");
            idade = entrada.nextInt();
            int sub = idade - ano;
            int negat = sub * -1; // ao realizar a subtração de idade menos ano temos um numero negativo
            verifica(negat);// ao colocarmos esse nnumero vezes -1 esse numero vira positivo.
            }catch(InputMismatchException e){// O catch vai capturar a exeção
                System.out.println("Voçê digitou uma LETRA [ERRO].");
            }
        }   
        public static int verifica(int negat){

           if(negat < 16 ){
                System.out.println("Voçê tem "+negat+" anos. Não vota");
            }else if( negat < 18 || negat > 65 ){
                System.out.println("Voçê tem "+negat+" anos. voto opcional");
            }else{
                System.out.println("Voçê tem "+negat+" anos. voto obrigatorio");
            }
      
        return negat;
    }
    }



    