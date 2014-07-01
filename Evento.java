/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agenda;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Jol
 */
//Classe evento, classe pai dos eventos
public class Evento extends Agenda {

    private int idEvento;
    private String nomeEvento;
    private String desc;
    Date dataevent = new Date();
    //DateFormat para mais facil impressão do formato data
    DateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm");
//Construtor
    public Evento(int idEvento, String nomeEvento, String desc, Date dataevent) {
        this.idEvento = idEvento;
        this.nomeEvento = nomeEvento;
        this.desc = desc;
        this.dataevent = dataevent;

    }

    public String getDesc() {
        return desc;
    }

    /**
     * @param desc the desc to set
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }


      //@return the idEvento
    public int getIdEvento() {
        return idEvento;
    }

    /**
     * @param idEvento the idEvento to set
     */
    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    /**
     * @return the nomeEvento
     */
    public String getNomeEvento() {
        return nomeEvento;
    }

    /**
     * @param nomeEvento the nomeEvento to set
     */
    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    /**
     * @return the data
     */
    /**
     * @param data the data to set
     */
    /**
     * @return the dataevent
     */
    //return no dataEvent formatada no padrão escolhido
    public String getDataevent() {
        DateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        return formato.format(dataevent);
    }

    /**
     * @param dataevent the dataevent to set
     */
    public void setDataevent(Date dataevent) {
        this.dataevent = dataevent;
    }
//Escreve arquivo de cada evento, o evento Reuniao tem um metodo do mesmo nome so que diferente
    public void escreveArquivo() throws FileNotFoundException {
        StringBuilder sb = new StringBuilder();
        Scanner s = new Scanner(toString());
        PrintStream ps = new PrintStream(getIdEvento() + ".txt");
        while (s.hasNextLine()) {
            ps.println(s.nextLine());
        }

        ps.close();
    }
//deleta arquivo do evento
    public void deletaEvento() {
        File file;
        file = new File(getIdEvento() + ".txt");
        file.delete();
    }
//metodo tostring
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getNomeEvento());
        sb.append(" ");
        sb.append(getDesc());
        sb.append(" ");
        sb.append(getDataevent());
        sb.append("\n");
        return sb.toString();
    }
}
