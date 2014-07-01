/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agenda;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Jol
 */
public class Main {

    public static void main(String[] args) throws IOException, ParseException {
        //Cria um dateformat para formatação e mais facil inserção
        DateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        //cria uma agenda
        Agenda a1 = new Agenda();
       //cria os contatos
        Contato c1 = new Contato("Juvenal", "88554504", "juvenal_turmadobairo@gmail.com");
        Contato c2 = new Contato("Juvecleide", "52315588", "juvevetretinha@gmail.com");
        Contato c3 = new Contato("Alanildos", "56487799", "alan_ildos@hotmail.com");
        Contato c4 = new Contato("Clovis", "56487922", "clovis_thebestof@gmail.com");
        Contato c5 = new Contato("Kimi", "88888888", "kimilagre@yahoo.com.br");
        //adiciona os contatos a agenda
        a1.addContato(c1);
        a1.addContato(c2);
        a1.addContato(c3);
        a1.addContato(c4);
        a1.addContato(c5);
       //imprime contatos
        System.out.println(a1.getContatos());
        //cria eventos
        Lembrete e1 = new Lembrete(1, "Churismolkka", "Um evento da pesada", formato.parse("01/03/1995 10:20"));
        Lazer e2 = new Lazer(2, "lembrar", "fazer algo divertido", formato.parse("01/05/2014 02:25"));
        Reuniao e3 = new Reuniao(3, "Reuniao com os operários do tucuruvi", "Reuniao para discutir assuntos sobre o tucuruvi", formato.parse("01/07/2014 14:20"), formato.parse("01/07/2014 16:20"));
        Reuniao e4 = new Reuniao(4, "Reuniao com a galera dos mananciais", "Reuniao para discutir assuntos sobre mananciais", formato.parse("03/08/2014 14:20"), formato.parse("03/08/2014 16:20"));
        Tarefa e5 = new Tarefa(5, "Fazer", "Tarefa de casa", formato.parse("02/07/2014 22:01"));
        //escreve arquivos de evnto e de agenda
        e1.escreveArquivo();
        e2.escreveArquivo();
        e3.escreveArquivo();
        e4.escreveArquivo();
        e5.escreveArquivo();
        a1.escreveContato();
       //Exclui contatos retirando da arraylist
        a1.excluiContato(c2);
        a1.excluiContato(c4);
        a1.excluiContato(c5);
        System.out.println(a1.getContatos());
       //Deleta arquivo de eventos
        e1.deletaEvento();
        e2.deletaEvento();
        e5.deletaEvento();
    }
}
