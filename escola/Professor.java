package escola;

public class Professor extends Pessoa implements Secretaria {
    public int cargaHoraria;
    private String fone;

    public Professor(int cargaHoraria, String fone, String nome, int idade, String cpf) {
        super(nome, idade, cpf);
        this.cargaHoraria = cargaHoraria;
        this.fone = fone;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public void info(){
        System.out.println("INFORMAÇÕESMDO SISTEMA");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Carga horária: " + this.cargaHoraria);
        System.out.println("");
        System.out.println("FIM DAS INFORMAÇÕES");

    }
}
