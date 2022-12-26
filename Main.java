public class Main {
    public static void main(String[] args) {
        /* 
         Nombres entier , nombres réels , lettres ('A', 'B'), mots ("bonjour je m'appelle Benjamin"), Boolean (vrai ou faux/ 0 ou 1)
        */

        int entier = 3;
        float reels = 4.0f;
        char caracter = 'A';
        String mots = "bonjour je m'appelle Benjamin'";
        boolean vraiOuFaux = true;

        /*
         Les gens peuvent entrer en boîte de nuit a leur 18 ans , endessous de 18 ans il ne peuvent pas y entrer.
         SI age = 18
            vous pouvez rentrer
        SINON
            vous ne pouvez pas rentrer
        */
        int age = 17;

        if(age >= 18) {
            System.out.println("vous pouvez rentrer");
        } else {
            System.out.println("Vous ne pouvez pas rentrer");
        }

        /*
         En hiver il fait froids , mais l'été il fait chaud , quand il fait une température tempérer c'est la mi-saison
         SI température = froid
            Nous sommes en hiver
        SI température = chaud 
             Nous sommes en été 
        SINON
            Nous sommes en mi-saison
         */
            String temp = "Froid";

            if(temp == "Froid") {
                System.out.println("On est en hiver");
            } else if(temp == "Chaud") {
                System.out.println("On est en été");
            }
            else {
                System.out.println("Nous sommes en mi-saison");
            }

         /*
          Je suis vieux je dors à 21h, je suis jeune je dors à minuit, 22
          SI l'heure = 21h
            Je suis vieux 
            SI l'heure = 00h00
            Je suis jeune 
          */

          String hours = "21H00";
          if(hours == "21H00") {
                System.out.println("Je suis vieux");
           }
        else if (hours == "00H00") {
            System.out.println("Je suis jeune");
        }

        /*
         * Une simulation de distributeur
         * Coca = 4e
         * Jus d'orange = 2e
         * Eau = 1,50e
         * Whiksy = 8e
         * 
         * Quel est le type approprié ?
         * 
         * Il faut que je vois dans le terminal ce que j'ai commandé
         */

        float money = 15.50f;
        String product = "j";

        if(money >= 4.0f && product == "Coca"){
            System.out.println("Coca recup");
            money = money - 4.0f;
            System.out.println("Votre money est a " + money);
        }
        else if(money >= 2.0f && product == "Jus"){
            System.out.println("Jus recup");
            money = money - 2.0f;
            System.out.println("Votre money est a " + money);
        }
        else if(money >= 1.50f && product == "Eau"){
            System.out.println("Recup Eau");
            money = money - 1.50f;
            System.out.println("Votre money est a " + money);
        }
        else if(money >= 8f && product == "Whisky"){
            System.out.println("Recup Whisky");
            money = money - 8.0f;
            System.out.println("Votre money est a " + money);
        }
        else {
            System.out.println("Produit non valide fdp");
        }
            
    }
}