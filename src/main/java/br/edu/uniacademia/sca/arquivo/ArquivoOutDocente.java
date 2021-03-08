/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uniacademia.sca.arquivo;

import br.edu.uniacademia.sca.modelo.Docente;
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
public class ArquivoOutDocente {
    //Metodo responsável por gravar o arquivo na máquina;
    private FileOutputStream fout = null;
    private ObjectOutputStream objOut = null;
    private List<Docente> lista = new ArrayList<Docente>();
   
    public void abrir() throws FileNotFoundException, IOException {
        preparar();
        fout = new FileOutputStream("informacoes_docente.txt");
        objOut = new ObjectOutputStream(fout);
        for (int i = 0; i < lista.size(); i++) {
            objOut.writeObject(lista.get(i));
        }
        
        
    }
    
     public void preparar() {
        ArquivoInDocente arq = new ArquivoInDocente();
        try {
            arq.abrir();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArquivoOutDocente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ArquivoOutDocente.class.getName()).log(Level.SEVERE, null, ex);
        }


        boolean continua = true;
        Docente obj = null;
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
                Logger.getLogger(ArquivoOutDocente.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        arq.fechar();
    }
     
      public void fechar() throws IOException {
        objOut.close();
        fout.close();
    }

    public void Adicionar(Docente obj) throws IOException {
        objOut.writeObject(obj);//grava o objeto todo
    }
    
    
    
    
     public void recadastrar_todos(ArrayList<Docente> listac) throws IOException {
        fout = new FileOutputStream("informacoes_docente.txt");
        objOut = new ObjectOutputStream(fout);

        for (int i = 0; i < listac.size(); i++) {
            objOut.writeObject(listac.get(i));
        }

    }
     
   

}
