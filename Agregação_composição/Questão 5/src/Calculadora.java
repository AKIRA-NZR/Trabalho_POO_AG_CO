import javax.swing.JOptionPane;

public class Calculadora{
    public static void main(String[] args) {
        double num1 = 0.0;
        double num2 = 0.0;
        while(true){
        
    try{
        String numero1 = JOptionPane.showInputDialog("Digite um número: ");
        num1 = Double.parseDouble(numero1);

        String numero2 = JOptionPane.showInputDialog("Digite um número: ");
        num2 = Double.parseDouble(numero2);
        break;

        }
    catch(NumberFormatException erro){
        JOptionPane.showMessageDialog(null, "Erro! Tente novamente");
        }
        }

        String[] opcao = {"+", "-", "x","/"};
        int selecao = JOptionPane.showOptionDialog(null,"Digite a sua opção de calculo","Calculadora", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcao, opcao[0]);
        if (selecao == 0){
            double resultado;
            resultado = num1 + num2;
            JOptionPane.showMessageDialog(null,"A soma é: " + resultado);
        }
        if(selecao == 1){
            double resultado;
            resultado = num1 - num2;
            JOptionPane.showMessageDialog(null, "A subtração é: " + resultado);
        }
        if(selecao == 2){
            double resultado;
            resultado = num1 * num2;
            JOptionPane.showMessageDialog(null, "A multiplicação é: " + resultado);
        }
        if(selecao == 3){
            double resultado;
            resultado = num1 / num2;
            JOptionPane.showMessageDialog(null, "A divisão é: " + resultado);
        }
        
    }
}