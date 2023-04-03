package projetocalcladora;

import static java.lang.Integer.parseInt;

import javax.swing.JOptionPane;

//depois tentar recebendo com  strin e com case
public class ProjetoCalcladora {

    public static void main(String[] args) {
        int operador;

        //do{
        //perguntas
        do {
            //atributos
            int it1, it2;
            int res = 0;
            double div = 0;
            String op, item, item2;

            op = JOptionPane.showInputDialog("Digite uma operaçao \n"
                    + "1 - SOMAR \n"
                    + "2 - DIMINUIR \n"
                    + "3 - MULTIPLICAR \n"
                    + "4 - DIVISAO \n"
                    + "5 - SAIR");

            //conversao
            operador = parseInt(op);

            switch (operador) {

                case 1:

                    item = JOptionPane.showInputDialog("Digite um valor 1");
                    item2 = JOptionPane.showInputDialog("Digite um valor 2");
                    it1 = parseInt(item);
                    it2 = parseInt(item2);

                    res = it1 + it2;
                    JOptionPane.showMessageDialog(null, "RESPOSTA " + res);
                    break;

                case 2:
                    item = JOptionPane.showInputDialog("Digite um valor 1");
                    item2 = JOptionPane.showInputDialog("Digite um valor 2");
                    it1 = parseInt(item);
                    it2 = parseInt(item2);
                    res = it1 - it2;
                    JOptionPane.showMessageDialog(null, "RESPOSTA " + res);
                    break;

                case 3:
                    item = JOptionPane.showInputDialog("Digite um valor 1");
                    item2 = JOptionPane.showInputDialog("Digite um valor 2");
                    it1 = parseInt(item);
                    it2 = parseInt(item2);

                    res = it1 * it2;
                    JOptionPane.showMessageDialog(null, "RESPOSTA " + res);
                    break;

                case 4:
                    item = JOptionPane.showInputDialog("Digite um valor 1");
                    item2 = JOptionPane.showInputDialog("Digite um valor 2");
                    it1 = parseInt(item);
                    it2 = parseInt(item2);

                    div = it1 / it2;
                    JOptionPane.showMessageDialog(null, "RESPOSTA " + div);
                    break;

                case 5:

                    JOptionPane.showMessageDialog(null, "SAINDO ");
                    System.exit(0);

                    break;

                default:
                    System.out.println("Operaçao Inválido ");
                    break;

            }

        } while (operador != 5);

        //   }while(operador!=5); 
    }

}
