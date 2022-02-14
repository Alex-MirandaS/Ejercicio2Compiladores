/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import GUI.PrincipalGUI;
import GUI.TablaResultados;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alex
 */
public class Controlador {

    private Ejercicio2 aLexico;

    private PrincipalGUI principalGUI = new PrincipalGUI(this);
    private TablaResultados tablaResultados = new TablaResultados();

    public void iniciar() {
        principalGUI.setVisible(true);
    }

    public void analizar() {
        Reader reader = new StringReader(principalGUI.getAreaTexto().getText());
        aLexico = new Ejercicio2(reader);
        try {
            aLexico.yylex();
            llenarTabla();
        } catch (IOException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void llenarTabla() {

        DefaultTableModel modelo = new DefaultTableModel();

        tablaResultados.getTabla().setModel(modelo);
        if (aLexico.getTokensGramatica().size() != 0 && aLexico.getNumeros().size() != 0) {
            modelo.addColumn("Cantidad de Vocales");
            modelo.addColumn("Cantidad de Palabras");

            for (int i = 0; i < aLexico.getTokensGramatica().size(); i++) {
                modelo.addRow(new Object[]{aLexico.getTokensGramatica().get(i).getValorVocales(), aLexico.getTokensGramatica().get(i).getCantidad()});
            }

            modelo.addRow(new Object[]{"Enteros Hallados"});
            for (int i = 0; i < aLexico.getNumeros().size(); i++) {
                modelo.addRow(new Object[]{aLexico.getNumeros().get(i)});
            }

        } else if (aLexico.getNumeros().size() != 0) {
            modelo.addColumn("Enteros Hallados");
            for (int i = 0; i < aLexico.getNumeros().size(); i++) {
                modelo.addRow(new Object[]{aLexico.getNumeros().get(i)});
            }
        } else if (aLexico.getTokensGramatica().size() != 0) {
            modelo.addColumn("Cantidad de Vocales");
            modelo.addColumn("Cantidad de Palabras");

            for (int i = 0; i < aLexico.getTokensGramatica().size(); i++) {
                modelo.addRow(new Object[]{aLexico.getTokensGramatica().get(i).getValorVocales(), aLexico.getTokensGramatica().get(i).getCantidad()});
            }

        }

        tablaResultados.setVisible(true);
    }

}
