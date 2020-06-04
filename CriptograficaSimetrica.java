package criptograficasimetrica;

import java.util.Scanner;

public class CriptograficaSimetrica {

    public static void main(String[] args) {
        
        int A;
        int chave;
        int code;
        int aux;
        String msg;
        String resulMSG = " ";
        String resulDMSG = " ";
        
        do{
            resulMSG = " ";
            resulDMSG = " ";
            Scanner read = new Scanner (System.in);
            do{
            System.out.println("Digite 1 para criptografar");
            System.out.println("Digite 2 para descriptografar");
            A = read.nextInt();
            if (A == 1 || A== 2){
                break;
            }
            System.out.println("Valor invalido");
            System.out.println("");
            }
            while(true);
            if (A==1){
                System.out.println("Digite sua chave em um valor inteiro entre 1 e 10");
                chave = read.nextInt();
                System.out.println("Digite a mensagem");
                msg = read.next();
                char letras [] = new char[msg.length()];
                
                  for(int i = 0; i < msg.length(); i++){
                  code = msg.codePointAt(i);
                  letras[i] = (char) code;
                      }
                  for(int C = 0; C<msg.length(); C++){
                      letras[C] = (char) (letras[C] + chave);
                      if(letras[C]>122){
                          aux = letras[C] - 122;
                          letras[C] = (char) (96 + aux);
                      }
                      resulMSG = resulMSG + letras[C];
                  }
                  
                  System.out.print("resultado:");
                  System.out.println(resulMSG);
                  System.out.println("");
            }
            else{
                
                System.out.println("Digite sua chave em um valor inteiro");
                chave = read.nextInt();
                System.out.println("Digite a mensagem");
                msg = read.next();
                char letras [] = new char[msg.length()];
                
                  for(int i = 0; i < msg.length(); i++){
                  code = msg.codePointAt(i);
                  letras[i] = (char) code;
                      }
                  for(int C = 0; C<msg.length(); C++){
                      letras[C] = (char) (letras[C] - chave);
                          if(letras[C]<97){
                          aux = 97 - letras[C];
                          letras[C] = (char) (123 - aux);
                      }
                      resulDMSG = resulDMSG + letras[C];
                  }
                  
                System.out.print("resultado:");
                System.out.println(resulDMSG);
                System.out.println("");
            }
        }
        while(true);
    }
}
