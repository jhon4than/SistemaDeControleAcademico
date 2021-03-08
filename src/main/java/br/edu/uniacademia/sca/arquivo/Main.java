/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uniacademia.sca.arquivo;

import br.edu.uniacademia.sca.modelo.Discente;
import br.edu.uniacademia.sca.modelo.DisciplinaC;
import br.edu.uniacademia.sca.modelo.Docente;
import br.edu.uniacademia.sca.modelo.Turma;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jhon4
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Main m = new Main();
        m.criarDocente();
        m.criarDiscente();
        m.criarDisciplina();
        m.criarTurma();

    }

    public void criarDocente() {
        FileOutputStream fin;
        try {
            fin = new FileOutputStream("informacoes_docente.txt");

            ObjectOutputStream objIn = new ObjectOutputStream(fin);

            Docente doc = new Docente();

            doc.setCpf("100.000.000-01");
            doc.setRg("MG13653234");
            doc.setBairro("Bairro");
            doc.setCep("36120-000");
            doc.setCidade("Cidade");
            doc.setComplemento("A111");
            doc.setDataNasc("09/12/1990");
            doc.setEstado("MG");
            doc.setLogradouro("Rua A");
            doc.setNome("Tassio");
            doc.setNumero("123");
            doc.setSexo("Masculino");
            doc.setSituacao("Ativo");
            doc.setTitulacao("Doutorado");

            objIn.writeObject(doc);

            objIn.close();
            fin.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void criarDiscente() {
        FileOutputStream fin;
        try {
            fin = new FileOutputStream("informacoes_discente.txt");

            ObjectOutputStream objIn = new ObjectOutputStream(fin);

            Discente disc = new Discente();

            disc.setMatricula("1000000-2010");
            disc.setCpf("100.000.000-01");
            disc.setRg("MG13653234");
            disc.setBairro("Bairro");
            disc.setCep("36120-000");
            disc.setCidade("Cidade");
            disc.setComplemento("A111");
            disc.setDataNasc("09/12/1990");
            disc.setEstado("MG");
            disc.setLogradouro("Rua A");
            disc.setNome("Jhonathan");
            disc.setNumero("123");
            disc.setSexo("Masculino");
            disc.setSituacao("Ativo");

            objIn.writeObject(disc);

            objIn.close();
            fin.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void criarDisciplina() {
        FileOutputStream fin;
        try {
            fin = new FileOutputStream("informacoes_disciplina.txt");

            ObjectOutputStream objIn = new ObjectOutputStream(fin);

            DisciplinaC doc = new DisciplinaC();

            doc.setCurso("Engenharia de Software");
            doc.setDisciplina("Interface Homeme Maquina");
            doc.setDuracao("38horas");
            doc.setCargahoraria("3256 horas");
            doc.setTitulacao("Graduação");
            doc.setUnidade("Juiz Defora");
            

            objIn.writeObject(doc);

            objIn.close();
            fin.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void criarTurma() {
        FileOutputStream fin;
        try {
            fin = new FileOutputStream("informacoes_turma.txt");

            ObjectOutputStream objIn = new ObjectOutputStream(fin);

            Turma tur = new Turma();

            tur.setCodigo("T102");
            tur.setHorario("12:30");
            tur.setAluno("Jhonzin");
            tur.setCurso("Engenharia Eletrica");
            tur.setDisciplina("Calculo Numerico");
            tur.setProfessor("Roberto");
       

            objIn.writeObject(tur);

            objIn.close();
            fin.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

   
}
