/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uniacademia.sca.arquivo;

import br.edu.uniacademia.sca.modelo.Docente;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jhon4
 */
public class ArquivoInDocente {
    
    private FileInputStream fin = null;
    private ObjectInputStream objIn = null;
    //Função para abrir fin depois objIn
    public void abrir() throws FileNotFoundException, IOException {
        fin = new FileInputStream("informacoes_docente.txt");
        objIn = new ObjectInputStream(fin);
    }
    
    public void fechar() {
        try {
            objIn.close();
            fin.close();
        } catch (IOException ex) {
            Logger.getLogger(ArquivoInDocente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //metodo especifico para leitura de um unico objeto;
    public Docente get() throws IOException, ClassNotFoundException {
        Docente obj = null;
        try {
            obj = (Docente) objIn.readObject();
        } catch (EOFException ex) {
            obj = null;
        }
        return obj;
    }
    //metodo especifico para leitura de todos objetos;
    public List getTodos() {
        List<Docente> lista = new ArrayList<Docente>();

        try {
            abrir();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArquivoInDocente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ArquivoInDocente.class.getName()).log(Level.SEVERE, null, ex);
        }

        boolean continua = true;
        Docente obj = null;
        while (continua) {
            try {
                obj = (Docente) objIn.readObject();
                lista.add(obj);
            } catch (EOFException ex) {
                continua = false;
            } catch (IOException ex) {
                continua = false;
            } catch (ClassNotFoundException ex) {
                continua = false;
                Logger.getLogger(ArquivoInDocente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        fechar();
        return lista;
    }

}
