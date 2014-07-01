/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agenda;

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
public class Reuniao extends Evento {

    private Date dataFimEvento = new Date();

    public Reuniao(int idEvento, String nomeEvento, String desc, Date dataevent, Date dataFimEvento) {
        super(idEvento, nomeEvento, desc, dataevent);
        this.dataFimEvento = dataFimEvento;

    }

    /**
     * @return the dataFimEvento
     */
    public Date getDataFimEvento() {
        return dataFimEvento;
    }

    /**
     * @param dataFimEvento the dataFimEvento to set
     */
    public void setDataFimEvento(Date dataFimEvento) {
        this.dataFimEvento = dataFimEvento;
    }
    DateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm");

    public String getDataFimEventoString() {
        return format.format(getDataFimEvento());
    }


    public void escreveArquivo() throws FileNotFoundException {
        StringBuilder sb = new StringBuilder();
        Scanner s = new Scanner(toString());
        PrintStream ps = new PrintStream(getIdEvento() + ".txt");
        while (s.hasNextLine()) {
            ps.println(s.nextLine());
        }

        ps.close();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getNomeEvento());
        sb.append(" ");
        sb.append(getDesc());
        sb.append(" ");
        sb.append(getDataevent());
        sb.append(" ");
        sb.append(getDataFimEventoString());
        return sb.toString();
    }
}
