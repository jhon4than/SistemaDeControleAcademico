/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uniacademia.sca.arquivo;

import br.edu.uniacademia.sca.modelo.Turma;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jhon4
 */
public class ArquivoOutTurma {
    
     private FileOutputStream fout = null;
    private ObjectOutputStream objOut = null;
    private List<Turma> lista = new ArrayList<Turma>();
   
    public void abrir() throws FileNotFoundException, IOException {
        preparar();
        fout = new FileOutputStream("informacoes_turma.txt");
        objOut = new ObjectOutputStream(fout);
        for (int i = 0; i < lista.size(); i++) {
            objOut.writeObject(lista.get(i));
        }
        
        
    }
    
     public void preparar() {
        ArquivoInTurma arq = new ArquivoInTurma();
        try {
            arq.abrir();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArquivoOutTurma.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ArquivoOutTurma.class.getName()).log(Level.SEVERE, null, ex);
        }


        boolean continua = true;
        Turma obj = null;
        while (continua) {
            try {
                obj = arq.get();
                if (obj != null) {
                    lista.add(obj);
                } else {
                    continua = false;
                }
            } catch (EOFException ex) {
                continua = false;
            } catch (IOException ex) {
                continua = false;
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ArquivoOutTurma.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        arq.fechar();
    }
     
      public void fechar() throws IOException {
        objOut.close();
        fout.close();
    }

    public void Adicionar(Turma obj) throws IOException {
        objOut.writeObject(obj);//grava o objeto todo
    }
    
    
    
    
     public void recadastrar_todos(ArrayList<Turma> listaH) throws IOException {
        fout = new FileOutputStream("informacoes_turma.txt");
        objOut = new ObjectOutputStream(fout);

        for (int i = 0; i < listaH.size(); i++) {
            objOut.writeObject(listaH.get(i));
        }

    }
    
}
