public class Principal {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Luan", 17, "Perto do Oswaldo", "5º Semestre", "Informática");
        Professor professor = new Professor("Isaque", 39, "Palmital", 15000.50, "PW2");
        FuncAdm funAdm = new FuncAdm("Paulo", 34, "De frente com a igreja", 2469.85, "Biblioteca", "Bibliotecário");

        System.out.println("\n" + "Nome do aluno: " + aluno1.getNome());
        System.out.println("Idade do aluno: " + aluno1.getIdade());
        System.out.println("Endereço do aluno: " + aluno1.getEndereco());
        System.out.println("Semestre do aluno: " + aluno1.getSemestre());
        System.out.println("Curso do aluno: " + aluno1.getCurso() + "\n");

        System.out.println("Nome do professor: " + professor.getNome());
        System.out.println("Idade do professor: " + professor.getIdade());
        System.out.println("Endereço do professor: " + professor.getEndereco());
        System.out.println("Salário do professor: " + professor.getSalario());
        System.out.println("Disciplina do professor: " + professor.getDisciplina() + "\n");

        System.out.println("Nome do funcionário administrativo: " + funAdm.getNome());
        System.out.println("Idade do funcionário administrativo: " + funAdm.getIdade());
        System.out.println("Endereço do funcionário administrativo: " + funAdm.getEndereco());
        System.out.println("Salário do funcionário administrativo: " + funAdm.getSalario());
        System.out.println("Setor do funcionário administrativo: " + funAdm.getSetor());
        System.out.println("Função do funcionário administrativo: " + funAdm.getFuncao() + "\n");

    }
    
}
