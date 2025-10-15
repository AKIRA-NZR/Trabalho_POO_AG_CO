public class Main {
    public static void main(String[] args) throws Exception {
        Professor p = new Professor("Gustavo");
        Turma turma1 = new Turma("12345");
        turma1.setProfessor(p);
        turma1.resumo();
        Professor p2 = new Professor("Samara");
        turma1.setProfessor(p2);
        turma1.resumo();
        
    }
}
