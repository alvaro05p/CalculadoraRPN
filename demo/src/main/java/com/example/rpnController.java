package com.example;

import java.util.ArrayList;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class rpnController {
    
    public ArrayList<String> numeros= new ArrayList<>();
    public ArrayList<String> filasNumeros= new ArrayList<>();
    //public ArrayList<Label> filas= new ArrayList<>();
    
    String numeroMostrar="";
    int filaActual=0;

    @FXML
    private Label numeroActual;
    @FXML
    private Label fila1;
    @FXML
    private Label fila2;
    @FXML
    private Label fila3;
    @FXML
    private Label fila4;
    @FXML
    private Label fila5;
    @FXML
    private Label fila6;
    @FXML
    private Label fila7;
    @FXML
    private Label fila8;
    @FXML
    private Label fila9;

    public void enter(){

        try {

            if (!numeroActual.getText().equals("") && !numeroActual.getText().startsWith(".")){

            filasNumeros.add(numeroActual.getText());
            
            for(int i=1;i<numeros.size();i++){
            numeros.clear();
            }
            mostrarFila();

            filaActual++;
            numeroActual.setText("");

            }else{
                numeroActual.setText("");
                numeros.clear();
            }
        } catch (Exception e) {
            System.out.println("No se deja que el usuario ponga un . o nada");
        }
        
    }

    public void delete(){
        numeroActual.setText("");
        numeros.clear();
    }

    public void mostrarFila(){

        fila9.setText(fila8.getText());

        fila8.setText(fila7.getText());

        fila7.setText(fila6.getText());

        fila6.setText(fila5.getText());

        fila5.setText(fila4.getText());

        fila4.setText(fila3.getText());

        fila3.setText(fila2.getText());

        fila2.setText(fila1.getText());

        fila1.setText(String.valueOf(filasNumeros.get(filaActual)));

    }

    public void suma(){

        double numero1=Double.parseDouble(fila2.getText());
        double numero2=Double.parseDouble(fila1.getText());

        double resultado = numero1 + numero2;

        fila1.setText(String.valueOf(resultado));

        bajar();

    }

    public void resta(){

        double numero1=Double.parseDouble(fila2.getText());
        double numero2=Double.parseDouble(fila1.getText());

        double resultado = numero1 - numero2;

        fila1.setText(String.valueOf(resultado));

        bajar();

    }

    public void mult(){

        double numero1=Double.parseDouble(fila2.getText());
        double numero2=Double.parseDouble(fila1.getText());

        double resultado = numero1 * numero2;

        fila1.setText(String.valueOf(resultado));

        bajar();

    }

    public void div(){

        double numero1=Double.parseDouble(fila2.getText());
        double numero2=Double.parseDouble(fila1.getText());

        double resultado = numero1 / numero2;

        fila1.setText(String.valueOf(resultado));

        bajar();


    }

    public void bajar(){
        fila2.setText(fila3.getText());
        fila3.setText(fila4.getText());
        fila4.setText(fila5.getText());
        fila5.setText(fila6.getText());
        fila6.setText(fila7.getText());
        fila7.setText(fila8.getText());
        fila8.setText(fila9.getText());
        if (!fila9.getText().equals("0.0")){
            fila9.setText("0.0");
        }
    }

    public void meter1(){
        numeroMostrar="";
        numeros.add("1");
        for(int i=0;i<numeros.size();i++){
            numeroMostrar+=String.valueOf(numeros.get(i));
        }

        numeroActual.setText(numeroMostrar);
        
    }

    public void meter2(){
        numeroMostrar="";

        numeros.add("2");
        for(int i=0;i<numeros.size();i++){
            numeroMostrar+=String.valueOf(numeros.get(i));
        }

        numeroActual.setText(numeroMostrar);
    }

    public void meter3(){
        numeroMostrar="";

        numeros.add("3");
        for(int i=0;i<numeros.size();i++){
            numeroMostrar+=String.valueOf(numeros.get(i));
        }

        numeroActual.setText(numeroMostrar);
    }

    public void meter4(){
        numeroMostrar="";

        numeros.add("4");
        for(int i=0;i<numeros.size();i++){
            numeroMostrar+=String.valueOf(numeros.get(i));
        }

        numeroActual.setText(numeroMostrar);
    }

    public void meter5(){
        numeroMostrar="";

        numeros.add("5");
        for(int i=0;i<numeros.size();i++){
            numeroMostrar+=String.valueOf(numeros.get(i));
        }

        numeroActual.setText(numeroMostrar);
    }

    public void meter6(){
        numeroMostrar="";

        numeros.add("6");
        for(int i=0;i<numeros.size();i++){
            numeroMostrar+=String.valueOf(numeros.get(i));
        }

        numeroActual.setText(numeroMostrar);
    }

    public void meter7(){
        numeroMostrar="";

        numeros.add("7");
        for(int i=0;i<numeros.size();i++){
            numeroMostrar+=String.valueOf(numeros.get(i));
        }

        numeroActual.setText(numeroMostrar);
    }

    public void meter8(){
        numeroMostrar="";

        numeros.add("8");
        for(int i=0;i<numeros.size();i++){
            numeroMostrar+=String.valueOf(numeros.get(i));
        }

        numeroActual.setText(numeroMostrar);
    }

    public void meter9(){
        numeroMostrar="";

        numeros.add("9");
        for(int i=0;i<numeros.size();i++){
            numeroMostrar+=String.valueOf(numeros.get(i));
        }

        numeroActual.setText(numeroMostrar);
    }

    public void meter0(){
        numeroMostrar="";

        numeros.add("0");
        for(int i=0;i<numeros.size();i++){
            numeroMostrar+=String.valueOf(numeros.get(i));
        }

        numeroActual.setText(numeroMostrar);
    }

    public void punto(){

        numeroMostrar="";

        numeros.add(".");
        for(int i=0;i<numeros.size();i++){
            numeroMostrar+=String.valueOf(numeros.get(i));
        }

        numeroActual.setText(numeroMostrar);

    }

    public void cambiarSimbolo(){
        double num=Double.parseDouble(fila1.getText());
        double cambiado=0-num;
        fila1.setText(String.valueOf(cambiado));
    }
    

}
