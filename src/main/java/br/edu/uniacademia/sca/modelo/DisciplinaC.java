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
public class DisciplinaC implements Serializable {
    private String curso;
    private String cargahoraria;
    private String disciplina;
    private String unidade;
    private String duracao;
    private String titulacao;

    public DisciplinaC() {
    }

    public DisciplinaC(String curso, String cargahoraria, String disciplina, String unidade, String duracao, String titulacao) {
        this.curso = curso;
        this.cargahoraria = cargahoraria;
        this.disciplina = disciplina;
        this.unidade = unidade;
        this.duracao = duracao;
        this.titulacao = titulacao;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCargahoraria() {
        return cargahoraria;
    }

    public void setCargahoraria(String cargahoraria) {
        this.cargahoraria = cargahoraria;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
   
     public Object dadosDiscip() {
        Object discip[] = {curso, disciplina, duracao, cargahoraria, titulacao, unidade};
        return discip;
    }
     
     public Object dadosDisc() {
        Object disc[] = {curso, disciplina};
        return disc;
    }
    
}
