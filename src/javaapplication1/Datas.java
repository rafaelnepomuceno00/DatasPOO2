/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.time.*;
import java.time.format.*;

/**
 *
 * @author IFNMG
 */
public class Datas {
    public static void main(String[] args){
    // pegar data atual
        LocalDate hoje = LocalDate.now();
        System.out.print(hoje);
        
    
        LocalDate atendtados = LocalDate.of(2001,9,11);
        System.out.print(atendtados);
        
        DateTimeFormatter Formatador = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        String hojeFormato = hoje.format(Formatador);
        System.out.print(hojeFormato);
    
        System.out.print("\nDia da semana"+ hoje.getDayOfWeek().name());
        System.out.print("\nDia "+ hoje.getDayOfMonth());
        System.out.print("\nMes "+ hoje.getMonthValue());
        System.out.print("\nMes "+ hoje.getMonth().name());
        System.out.print("\nAno "+ hoje.getYear());
        
        
    }
    
    
}
