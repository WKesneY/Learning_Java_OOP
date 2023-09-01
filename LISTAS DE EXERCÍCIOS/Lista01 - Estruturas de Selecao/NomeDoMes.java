import java.util.*;

public class NomeDoMes {
    public static void main(String[] args){    
        
        int numeroMes; 
        Scanner scanner = new Scanner(System.in);

        System.out.println("-------------- QUAL O NUM. DO MES?--------------");
        System.out.printf("\n\nINFORME O NOME DO MES:");
        String nomeMes = scanner.nextLine().toLowerCase(); //Para receber a String minúscula

        switch(nomeMes)
        {
            case "janeiro":
            System.out.println("-> NUMERO CORRESPONDENTE = 1 <-"); 
            break;

            case "fevereiro":
            System.out.println("-> NUMERO CORRESPONDENTE = 2 <-"); 
            break;

            case "marco":
            System.out.println("-> NUMERO CORRESPONDENTE =  <- 3"); 
            break;

            case "março":
            System.out.println("-> NUMERO CORRESPONDENTE =  <- 3"); 
            break;

            case "abril":
            System.out.println("-> NUMERO CORRESPONDENTE = 4 <-"); 
            break;

            case "maio":
            System.out.println("-> NUMERO CORRESPONDENTE = 5 <-"); 
            break;

            case "junho":
            System.out.println("-> NUMERO CORRESPONDENTE = 6 <-"); 
            break;

            case "julho":
            System.out.println("-> NUMERO CORRESPONDENTE = 7 <-"); 
            break;

            case "agosto":
            System.out.println("-> NUMERO CORRESPONDENTE = 8 <-"); 
            break;

            case "setembro":
            System.out.println("-> NUMERO CORRESPONDENTE = 9 <-"); 
            break;

            case "outubro":
            System.out.println("-> NUMERO CORRESPONDENTE = 10 <-"); 
            break;

            case "novembro":
            System.out.println("-> NUMERO CORRESPONDENTE = 11 <-"); 
            break;

            case "dezembro":
            System.out.println("-> NUMERO CORRESPONDENTE = 12 <-"); 
            break;

            default: System.out.println("-> TALVEZ TENHA ESCRITO O NOME ERRADO <- ");
        }

        /*

        Map<String, Integer> meses = new HashMap<>();
        meses.put("janeiro", 1);
        meses.put("fevereiro", 2);
        meses.put("março", 3);
        meses.put("marco", 3);
        meses.put("abril", 4);
        meses.put("maio", 5);
        meses.put("junho", 6);
        meses.put("julho", 7);
        meses.put("agosto", 8);
        meses.put("setembro", 8);
        meses.put("outubro", 10);
        meses.put("novembro", 11);
        meses.put("dezembro", 12);


        System.out.println("-------------- QUAL O NUM. DO MES?--------------");
        System.out.println("\n\nINFORME O NOME DO MES:");
        nomeMes = scanner.nextLine().toLowerCase(); //Para receber a String minúscula


        if(meses.containsKey(nomeMes)){
            numeroMes = meses.get(nomeMes);
        }else System.out.println("-> NUMERO INVÁLIDO <-");

        */






    }
    
}
