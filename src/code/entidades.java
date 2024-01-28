/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class entidades {
    Scanner scan=new Scanner(System.in);
    int hp, atk, def, xp, lv; 
    String nom;
    int ram;
    int deff=0,atf=0;
    
    public entidades(String no, int h, int at, int df, int ex, int lev){
        nom=no;
        hp=h; 
        atk=at; 
        def=df;  
        xp=ex;
        lv=lev;
    }
    //SELECCION DE COMENTARIO DE PELEA
    public String present(){
        int rra;
        String a=("poo");
        rra=(int)Math.round(Math.random()*20);
        if(rra>=0 && rra<=5) a=("\n"+nom+" lv:"+ lv+ " te ha atacado defiendete");
        if(rra>=6 && rra<=10) a=("\n"+nom+" lv:"+lv+" se ha aparecido en tu camino, eliminalo");
        if(rra>=11 && rra<=15) a=("\nvaya, me parece que "+nom+" lv:"+lv+" solicita una paliza");
        if(rra>=16 && rra<=20) a=("Ohh mira "+nom+" lv:"+lv+"\npan comido no es asi heroe?");
        return a;
    }
    
    //AUN NO USADO, FUNCION DE MEJORA DE ENEMIGOS
    public void nivel(int lvprota){
        int hhp=5, att=1, dee=1, gg;
        while(lvprota>lv){
        lv++;
        gg=(int)Math.round(Math.random()*10);
        if(gg>=0 && gg<=5)hp=hp+hhp;
        
        gg=(int)Math.round(Math.random()*10);
        if(gg>=0 && gg<=5)def=def+dee;
        
        gg=(int)Math.round(Math.random()*10);
        if(gg>=0 && gg<=5) atk=atk+att;
    }}
    
    
    //Parte del codigo que nos devuelve el texto segun la accion del enemigo
    public String peleas(int at,int ef){
        
        String dd=(" ");
        ram=(int)Math.round(Math.random()*55);
        //Precalculo de daños segun la accion que realizara el enemigo
            if(ram>=0 && ram<=18){deff=def; atf=0; dd=("\n"+nom+" se ha defendido\n");}
            if(ram>=19 && ram<=37){deff=def/2; atf=atk; dd=("\n"+nom+" te ha atacado\n");}
            if(ram>=38 && ram<=50){deff=def/2; atf=atk*2; dd=("\n"+nom+" te ha echo un critico\n");}
            if(ram>=51 && ram<=55) {deff=def/2; atf=(atk*4)/5; dd=("\n"+nom+" te hecho un poco daño\n");}
            //Correccion de error de daños para el calculo fina
            if(1>(atf-(ef/2))){ atf=ef/2;}
            else if(1>(atf-ef)){ atf=ef;}
            if(1>(at-deff)) deff=at;
            return dd;
    }
    
}
