import java.time.LocalDate;

import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();

        curso1.setCargaHoraria(8);
        curso1.setDescricao("curso de java para iniciantes");
        curso1.setTitulo("curso java");

        Curso curso2 = new Curso();

        curso2.setCargaHoraria(4);
        curso2.setDescricao("curso de javascript para iniciantes");
        curso2.setTitulo("curso javascript");

        Mentoria mentoria = new Mentoria();

        mentoria.setData(LocalDate.of(2024, 07, 23));
        mentoria.setDescricao("mentoria para iniciantes em java");
        mentoria.setTitulo("mentoria java");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Desenvolvimento Back-end com JAVA");
        bootcamp.setDescricao("bootcamp para iniciantes em java");
        bootcamp.getConteudos().add(mentoria);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);

        Dev devKaren = new Dev();
        devKaren.setNome("Karen");
        devKaren.inscrevverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de " + devKaren.getNome() + ": " + devKaren.getConteudosInscritos());
        devKaren.progredir();
        System.out.println(" ");
        System.out.println("Progresso! YAY!");
        System.out.println("Conteúdos concluídos de " + devKaren.getNome() + ": " + devKaren.getConteudosConcluidos());
        devKaren.progredir();
        System.out.println(" ");
        System.out.println("Progresso! YAY!");
        System.out.println("Conteúdos concluídos de " + devKaren.getNome() + ": " + devKaren.getConteudosConcluidos());
        System.out.println("XP: " + devKaren.calcularTotalXP());

        System.out.println(" ");
        System.out.println("------------------------------------");
        System.out.println(" ");

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscrevverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de " + devMaria.getNome() + ": " + devMaria.getConteudosInscritos());
        System.out.println(" ");
        devMaria.progredir();
        System.out.println("Progresso! YAY!");
        System.out.println("Conteúdos concluídos de " + devMaria.getNome() + ": " + devMaria.getConteudosConcluidos());
        System.out.println("XP: " + devMaria.calcularTotalXP());


    }
}

