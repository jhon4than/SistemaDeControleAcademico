/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uniacademia.sca.modelo;


/**
 *
 * @author jhon4
 */
public class Usuario {

    private String Matricula;
    private String Senha;

    public Usuario() {
        this.Matricula = "admin";
        this.Senha = "1234567";
    }
    
    public boolean validarSenha(String Sen) {
        if (Sen.equalsIgnoreCase("") || Sen.length() < 6) {
            return false;
        } else {
            return true;
        }
    }

    public boolean validarMatricula(String Mat) {
        if (Mat.equalsIgnoreCase("")) {
            return false;
        } else {
            return true;
        }
    }

    public boolean validarLogin(String Mat, String Sen) {

        if (Mat.equalsIgnoreCase(this.Matricula) && Sen.equalsIgnoreCase(this.Senha)) {
            return true;
        } else {
            return false;
        }
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

}
