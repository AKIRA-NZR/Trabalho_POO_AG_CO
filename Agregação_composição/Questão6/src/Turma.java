public class Turma {
    private String codigo;
    private Professor professor;

    public Turma(String codigo){
        this.codigo = codigo;
        this.professor = null;
    }
    public void setProfessor(Professor p){
        this.professor = p;
    }
    public void resumo(){
        System.out.println("O código do professor é: " + this.codigo);
        if(this.professor != null){
            System.out.println("O professor é: " + this.professor.getNome());
        }
        else{
            System.out.println("Sem professor!");
        }
    }
}
