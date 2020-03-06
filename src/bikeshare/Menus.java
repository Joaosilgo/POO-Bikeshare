/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bikeshare;

/**
 *
 * @author João
 */
public class Menus {

    public Menus() {
    }

    public void menuDespedida() {
        System.out.println("Obrigado e até Breve");
    }

    public void menuInicial() {
        System.out.println("  Estação");
        System.out.println("1- Campus do IPS");
        System.out.println("2- Escola Profissional");
        System.out.println("3- São Sebastião");
        System.out.println("4- Estação CP");
        System.out.println("5- ForumMunicipal");
        System.out.println("5- Albarquel");
        System.out.println("0- Sair");
    }

    public void menuPrincipal() {
        System.out.println("1- Alugar / Devolver bicicleta");
        System.out.println("2- Utilizadores registados ou por registar (criar ou alterar utilizador / pagar anuidade)");
        System.out.println("3- Comprar bilhete 1 a 7 dias");
        System.out.println("4- Visualizar estações");
        System.out.println("5- Fazer manutenção");
        System.out.println("0- Sair");
    }

    public void menuAlugar() {
        System.out.println("1- bilhete  ");
        System.out.println("2-cartão BikeShare");
        System.out.println("0- Sair");

    }

    public void menuAlugar1() {
        System.out.println("1- Inserir código ");
        System.out.println("0- Sair");

    }

    public void menuAlugar2() {
        System.out.println("1- Inserir  cartão BikeShare:");
        System.out.println("0- Sair");

    }
//Ecrã de opção para alugar de um utilizador com assinatura

    public void menuAlugarUtilizadorComAssinatura(Utilizador user) {
        System.out.println("Benvindo:" + user.getNome() + " " + user.getApelido());
        System.out.println("Cartão BikeShare: " + user.getCartao().getCardId());
        System.out.println("Assinatura anual : " + user.getAnuidade().getAnuidadeType() + " - válida até" + user.getAnuidade().getValidate());
        if (user.getAnuidade().getAnuidadeType() == "JovemNormal" || user.getAnuidade().getAnuidadeType() == "NormalNormal") {
            System.out.println("1- Alugar uma bicicleta normal");

        } else if (user.getAnuidade().getAnuidadeType() == "JovemElectrica" || user.getAnuidade().getAnuidadeType() == "NormalElectrica") {
            System.out.println("2- Alugar uma bicicleta elétrica");
        } else {
            System.out.println("1- Alugar uma bicicleta normal");
            System.out.println("2- Alugar uma bicicleta elétrica");
        }
        System.out.println("0- Sair");
    }

    public void menu2() {
        System.out.println(" 1- Pagar anuidade");
        System.out.println("2- Registar novo utilizador");
        System.out.println("3- Alterar dados de um utilizador");
        System.out.println("0- Sair");
    }

    public void menu2opcao1() {
        System.out.println("Tipos de anuidade:");
        System.out.println(" 1- Normal: 29.00€");
        System.out.println(" 2- Normal Elétrica: 59.00€");
        System.out.println(" 3- Jovem (16-24): 18.00€");
        System.out.println(" 4- Jovem Elétrica: 31.00€");
        System.out.println(" 0- Sair");
    }

    public void menu1opcao1pagamento() {
        System.out.println(" Pagamento de anuidade");
        System.out.println(" - Insere o nº do seu cartão de pagamento:");
        System.out.println(" - Insere a data de validade do seu cartão de pagamento:");
        System.out.println("0- Sair");
    }

    public void menu1opcao1pagamentoConfirmacao(Utilizador user) {
        System.out.println(" Anuidade ativada com sucesso");
        System.out.println(" Data limite de validade:" + user.getAnuidade().getValidate());

    }

    public void menu1opcao3() {
        System.out.println(" Bihete Dias/Bike/Preço:");
        System.out.println(" 1- 1 dia Bike Normal valor: 1 €");
        System.out.println(" 2- 3 dia Bike Normal valor: 3 €");
        System.out.println(" 3- 7 dia Bike Normal valor: 5 €");

        System.out.println(" 4- 1 dia Bike Electrica valor: 3 €");
        System.out.println(" 5- 3 dia Bike Electrica valor: 9 €");
        System.out.println(" 6- 7 dia Bike Electrica valor: 15 €");

        System.out.println("0- Sair");
    }

    public void menu1opcao1opcao1() {
        System.out.println(" Pagamento de anuidade");

        System.out.println("- Insere o nº do seu cartão :");

        System.out.println("0- Sair");
    }

    public void menu1opcao1opcao1Tipos() {
        System.out.println(" Tipo:");

        System.out.println("1- Normal: 29.00€");

        System.out.println("2- Normal Elétrica: 59.00€");
        System.out.println("3- Jovem (16-24): 18.00€");
        System.out.println("4- Jovem Elétrica: 31.00€");
        System.out.println("0- Sair");
    }

    public void opcao2opcao2ConfirmacaoRegisto(Utilizador user) {
        System.out.println("  novo utilizador  ");
        System.out.println("Nome:" + user.getNome());
        System.out.println("Apelido:" + user.getApelido());
        System.out.println("Género:" + user.getGenero());
        System.out.println("Idade:" + user.getIdade());
        System.out.println("Nif:" + user.getNif());
        System.out.println("Morada:" + user.getMorada());
        System.out.println("Pais:" + user.getPais());
        System.out.println("E-mail:" + user.getMail());
         System.out.println();

        System.out.println("Utilizador criado com sucesso");
        System.out.println("O nº do seu cartão BikeShare é:" + user.getCartao().getCardId());
    }
    public void menuFinalOperacao()
    {
        System.out.println();
     System.out.println("1-Menu Principal");
     System.out.println("0-Sair" );
            
    }
     public void opcao2opcao3Alterar(Utilizador user) {
         
        System.out.println("  Escolha o campo a Modificar:  ");
        System.out.println("1-Nome:" + user.getNome());
        System.out.println("2-Apelido:" + user.getApelido());
        System.out.println("3-Género:" + user.getGenero());
        // System.out.println("4-Idade:" + user.getIdade());
        System.out.println("4-Nif:" + user.getNif()); 
        System.out.println("5-Morada:" + user.getMorada());
        System.out.println("6-Pais:" + user.getPais());
        System.out.println("7-E-mail:" + user.getMail());
         System.out.println();

        System.out.println("0-Sair");
        
    }
     public void requestNumberCard()
     {
      System.out.println("- Insere o nº do seu cartão de pagamento:");

        System.out.println("0- Sair");
     }
     public void confirmacaoPedidoBilhete(Ticket t, Utilizador user)
     {
          System.out.println(" Bilhete adquirido por :"+user.getNome());

        System.out.println(t.toString());
     }
    
    

}
