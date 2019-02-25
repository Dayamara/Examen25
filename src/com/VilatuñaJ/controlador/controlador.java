/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.VilatuñaJ.controlador;

import com.VilatuñaJ.modelo.persona;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author UseR
 */
public class controlador {
    private ArrayList<persona> lista=new ArrayList<persona>();
    
    public int getTamanio(){
        return lista.size();
    }
    
    public void setAgregar(persona p){
        lista.add(p);
    }
    
    public persona getpersona(){
        return lista.get(getTamanio());
    }
    
    public void imprimir(){
        JOptionPane.showMessageDialog(null,Arrays.toString(lista.toArray()));
    }
    
    public void eliminar(){
        lista.clear();
    }
    
    public persona buscar(String pos){
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).getApellido().equals(pos)){
                return lista.get(i);
            }else{
                System.out.println("No existe este registro");
            }
        }
        return null;
    }
    
    public void generar(){
        File Archivo;
        PrintWriter Escribir;
        Archivo= new File("Lista_examen.txt");
        if (!Archivo.exists()) {
            try {
                Archivo.createNewFile();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            try {
                Escribir= new PrintWriter(Archivo,"utf-8");
                Escribir.print(Arrays.toString(lista.toArray()));
                Escribir.close();
            } catch (Exception e) {
            }
        }
    }
}
