/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uniacademia.sca.arquivo;

import br.edu.uniacademia.sca.modelo.Turma;
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
public class ArquivoInTurma {
    
    private FileInputStream fin = null;
    private ObjectInputStream objIn = null;
    
    public void abrir() throws FileNotFoundException, IOException {
        fin = new FileInputStream("informacoes_turma.txt");
        objIn = new ObjectInputStream(fin);
    }

    public void fechar() {
        try {
            objIn.close();
            fin.close();
        } catch (IOException ex) {
            Logger.getLogger(ArquivoInTurma.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Turma get() throws IOException, ClassNotFoundException {
        Turma obj = null;
        try {
            obj = (Turma) objIn.readObject();
        } catch (EOFException ex) {
            obj = null;
        }
        return obj;
    }

    public List getTodos() {
        List<Turma> lista = new ArrayList<Turma>();

        try {
            abrir();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArquivoInTurma.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ArquivoInTurma.class.getName()).log(Level.SEVERE, null, ex);
        }

        boolean continua = true;
        Turma obj = null;
        while (continua) {
            try {
                obj = (Turma) objIn.readObject();
                lista.add(obj);
            } catch (EOFException ex) {
                continua = false;
            } catch (IOException ex) {
                continua = false;
            } catch (ClassNotFoundException ex) {
                continua = false;
                Logger.getLogger(ArquivoInTurma.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        fechar();
        return lista;
    }
    
    
    
}
