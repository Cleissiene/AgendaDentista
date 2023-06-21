package Questao1;

import javax.xml.crypto.Data;

public class Agenda {
    private String dia;
    private Integer disponivel;
    private Integer ocupados;

    public Agenda() {
    }

    public Agenda(String dia, Integer disponivel, Integer ocupados) {
        this.dia = dia;
        this.disponivel = disponivel;
        this.ocupados = ocupados;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public Integer getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(Integer disponivel) {
        this.disponivel = disponivel;
    }

    public Integer getOcupados() {
        return ocupados;
    }

    public void setOcupados(Integer ocupados) {
        this.ocupados = ocupados;
    }

    public int semagendamento(){
        return disponivel - ocupados;
    }

}