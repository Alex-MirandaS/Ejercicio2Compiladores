/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author Alex
 */
public class Token {

    private int valorVocales;

    private int cantidad;

    public Token(int valorVocales, int cantidad) {
        this.valorVocales = valorVocales;
        this.cantidad = cantidad;
    }

    public int getValorVocales() {
        return valorVocales;
    }

    public void setValorVocales(int valorVocales) {
        this.valorVocales = valorVocales;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public void aumentarCantidad() {
        this.cantidad++;
    }

}
