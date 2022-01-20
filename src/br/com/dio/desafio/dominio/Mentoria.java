package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    private
    LocalDate data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public Mentoria() {    }

    @Override
    public String toString() {
        return "\n" + "Mentoria" + "\n" +
                "Título: " + getTitulo() + "\n" +
                "Descricao: " + descricao + "\n" +
                "Data da Mentoria: " + data;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }


}
