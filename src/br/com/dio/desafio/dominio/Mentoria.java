package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {

    private
    String titulo;
    String descricao;
    LocalDate data;

    public Mentoria() {
        this.titulo = titulo;
        this.descricao = descricao;
        this.data = data;
    }

    public void imprimir(){
        System.out.println("\n"
                + "Mentoria" + "\n"
                + "Titulo: " + titulo + "\n"
                + "Descrição da mentoria: " + descricao + "\n"
                + "Data: " + data);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}
