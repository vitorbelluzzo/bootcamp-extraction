import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Course curso1 = new Course();
        curso1.setName("curso java");
        curso1.setDescription("descrição curso java");
        curso1.setWorkload(8);

        Course curso2 = new Course();
        curso2.setName("curso js");
        curso2.setDescription("descrição curso js");
        curso2.setWorkload(4);

        Mentorship mentoria = new Mentorship();
        mentoria.setName("mentoria de java");
        mentoria.setDescription("descrição mentoria java");
        mentoria.setDate(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Developer");
        bootcamp.setDescription("Descrição Bootcamp Java Developer");
        bootcamp.getContentList().add(curso1);
        bootcamp.getContentList().add(curso2);
        bootcamp.getContentList().add(mentoria);

        Dev devVitor = new Dev();
        devVitor.setName("Vitor");
        devVitor.subscribeBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Vitor:" + devVitor.getSubscribedContent());
        devVitor.progress();
        devVitor.progress();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Vitor:" + devVitor.getSubscribedContent());
        System.out.println("Conteúdos Concluídos Vitor:" + devVitor.getSubscribedContent());
        System.out.println("XP:" + devVitor.calcXP());

        System.out.println("-------");

        Dev devSophia = new Dev();
        devSophia.setName("Sophia");
        devSophia.subscribeBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Sophia:" + devSophia.getSubscribedContent());
        devSophia.progress();
        devSophia.progress();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Sophia:" + devSophia.getSubscribedContent());
        System.out.println("Conteúdos Concluídos Sophia:" + devSophia.getSubscribedContent());
        System.out.println("XP:" + devSophia.calcXP());

    }
}