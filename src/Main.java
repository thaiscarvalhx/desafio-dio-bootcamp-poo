import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Linguagem Java");
        curso1.setCargaHoraria(6);
        curso1.setDescricao("Programação Orientada a Objetos");

        Curso curso2 = new Curso();
        curso2.setTitulo("Linguagem Java");
        curso2.setCargaHoraria(4);
        curso2.setDescricao("Collections Java");

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Como se dedicar a aprender uma linguagem");
        mentoria1.setData(LocalDate.now());

        curso1.imprimir();
        mentoria1.imprimir();

    }
}
