package Questao1;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scn = new Scanner(System.in);

        Agenda agenda = new Agenda();

        String dia = JOptionPane.showInputDialog(null, "Informe dia para atendimento ", " Dia/Semana", JOptionPane.PLAIN_MESSAGE);

        agenda.setDia(dia);

        int disp = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe quantidade de horarios para atendimento", "Horários Disponíveis para atendimento"
                , JOptionPane.PLAIN_MESSAGE));

        agenda.setDisponivel(disp);

        int ocup = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe quantidade de horarios ocupados", "Horários Indisponíveis"
                , JOptionPane.PLAIN_MESSAGE));

        agenda.setOcupados(ocup);

        int agendar = agenda.semagendamento();

        JOptionPane.showMessageDialog(null, "Agenda livre do " + dia + " para os horários " + agendar + " horários", "Disponíveis para agendamento:", JOptionPane.PLAIN_MESSAGE);

        scn.close();

    }
}
