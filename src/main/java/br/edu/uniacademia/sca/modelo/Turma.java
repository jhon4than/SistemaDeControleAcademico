/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uniacademia.sca.modelo;

import java.io.Serializable;

/**
 *
 * @author jhon4
 */
public class Turma  implements Serializable {
    private String codigo;
    private String horario;
    private String aluno;
    private String professor;
    private String curso;
    private String disciplina;
    
   

    public Turma(String codigo, String horario, String aluno, String professor,String curso,String disciplina) {
        this.codigo = codigo;
        this.horario = horario;
         this.horario = aluno;
          this.horario = professor;
          this.horario = curso;
          this.horario = disciplina;
    }

    public Turma() {
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    
    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }
    

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    
    public Object dadosTurma() {
        Object turmaCod[] = {codigo,horario,aluno,curso,disciplina,professor};
        return turmaCod;
    }
    
}
