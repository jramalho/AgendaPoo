/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agenda;

import java.util.Date;

/**
 *
 * @author Jol
 */
public class Contato {

    private String nome;
    private String tel;
    private String e_mail;
//Construtor Contatos
    Contato(String nome, String tel, String e_mail) {
        this.nome = nome;
        this.tel = tel;
        this.e_mail = e_mail;

    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the tel
     */
    public String getTel() {
        return tel;
    }

    /**
     * @param tel the tel to set
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * @return the e_mail
     */
    public String getE_mail() {
        return e_mail;
    }

    /**
     * @param e_mail the e_mail to set
     */
    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }
//To string dos contatos
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nome);
        sb.append(",");
        sb.append(tel);
        sb.append(",");
        sb.append(e_mail);
        sb.append("\n");
        return sb.toString();
    }

}
