/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uniacademia.sca.arquivo;

import br.edu.uniacademia.sca.modelo.DisciplinaC;
import br.edu.uniacademia.sca.telas.Disciplina;
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
public class ArquivoOutDisciplina {
    
    private FileOutputStream fout = null;
    private ObjectOutputStream objOutD = null;
    private List<DisciplinaC> lista = new ArrayList<DisciplinaC>();

    public void abrir() throws FileNotFoundException, IOException {
        preparar();
        fout = new FileOutputStream("informacoes_disciplina.txt");
        objOutD = new ObjectOutputStream(fout);
        for (int i = 0; i < lista.size(); i++) {
            objOutD.writeObject(lista.get(i));
        }
    }
    
     private void preparar() {
        ArquivoInDisciplina arq = new ArquivoInDisciplina();
        try {
            arq.abrir();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArquivoOutDisciplina.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ArquivoOutDisciplina.class.getName()).log(Level.SEVERE, null, ex);
        }


        boolean continua = true;
        DisciplinaC obj = null;
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
                Logger.getLogger(ArquivoOutDisciplina.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        arq.fechar();
    }
     
      public void fechar() throws IOException {
        objOutD.close();
        fout.close();
    }

    public void Adicionar(DisciplinaC obj) throws IOException {
        objOutD.writeObject(obj);//grava o objeto todo
    }
    
     public void recadastrar_todos(ArrayList<DisciplinaC> listac) throws IOException {
        fout = new FileOutputStream("informacoes_disciplina.txt");
        objOutD = new ObjectOutputStream(fout);

        for (int i = 0; i < listac.size(); i++) {
            objOutD.writeObject(listac.get(i));
        }

    }
    
}
