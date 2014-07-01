/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agenda;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Jol
 */
public class Agenda {

    private List<Contato> contatos;
//Construtor agenda
    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    /**
     * @return the contatos
     */
    public List<Contato> getContatos() {
        return contatos;

    }
//Adiciona o contato
    void addContato(Contato contato) {
        contatos.add(contato);
    }

    /**
     *
     * Escreve o arquivo contatos.txt
     */
    public void escreveContato() throws FileNotFoundException {
        Scanner s = new Scanner(toString());
        PrintStream ps = new PrintStream("Contatos.txt");
        while (s.hasNextLine()) {
            ps.println(s.nextLine());
        }
    }
//Exclui um certo contato
    public void excluiContato(Contato contato) throws FileNotFoundException {
        contatos.remove(contato);
        escreveContato();
    }
//impressao dos contatos
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getContatos());
        return sb.toString();

    }
}


