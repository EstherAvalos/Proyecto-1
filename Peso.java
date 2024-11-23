import javax.swing.JOptionPane;

public class Peso {
    public static void main(String[] args) {
        float estatura;
        short peso;
        float imc;
        byte resp;
        do{
          peso=Short.parseShort(JOptionPane.showInputDialog("captura tu peso:"));
            estatura=Float.parseFloat(JOptionPane.showInputDialog("captura tu estatura en formato de metros"));
            imc=(peso/(estatura*estatura));
            if(imc<18.49){
                JOptionPane.showMessageDialog(null,"Peso bajo");
            }else if (imc>=18.50 && imc<=24.99){
                JOptionPane.showMessageDialog(null,"Peso normal");
            }else if(imc>=25 && imc <=29.99){
                JOptionPane.showMessageDialog(null,"Sobrepeso");
            }else if(imc>=30 && imc <=34.99){
                JOptionPane.showMessageDialog(null, "Obesidad leve");
            } else if(imc>=35 && imc<=39.99){
                JOptionPane.showMessageDialog(null,"Obesidad media");
            }else{
                JOptionPane.showMessageDialog(null,"Obesidad mórbida");
            }
            resp=Byte.parseByte(JOptionPane.showInputDialog("Captura 1, si desea realizar otro calculo"));
        }while (resp==1);
    }
}