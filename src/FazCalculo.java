/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jonathan
 */
public class FazCalculo {
    public float calcula(float valor1,float valor2,char operador){
        float total = 0;
        if(operador == '+'){
            total=valor1+valor2;
        }else if(operador == '-'){
            total=valor1-valor2;
        }else if(operador == '*'){
            total=valor1*valor2;
        }
        return total;
    }
}
