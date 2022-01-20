package br.com.dio.desafio.dominio;

public class Curso {

    private
    String titulo;
    String descricao;
    Integer cargaHoraria;

    public Curso() {
        this.titulo = titulo;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
    }

    public void imprimir(){
        System.out.println("\n"
                +"Curso" + "\n"
        + "Titulo: " + titulo + "\n"
        + "Descrição do curso: " + descricao + "\n"
        + "Carga horária do curso: " + cargaHoraria);
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

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}
