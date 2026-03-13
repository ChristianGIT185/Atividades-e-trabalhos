public class Recepcionista {
    public String nome;
    public String cpf;
    public String telefone;
    public String senha;

    public Recepcionista() {
        nome = "João";
        cpf = "544";
        telefone = "11 951";
        senha = "321";
    }

    public Recepcionista(String nome, String cpf, String telefone, String senha) {
        try {
            if (nome == null || cpf == null || telefone == null || senha == null) {
                throw new Exception("Dados inválidos");
            }
            this.nome = nome;
            this.cpf = cpf;
            this.telefone = telefone;
            this.senha = senha;
        } catch (Exception e) { /*para excessões*/
            System.out.println("Ocorreu uma exceção - Valores padrões definidos"); /*caso haja erro os valores são redefinidos*/
            this.nome = null;
            this.cpf = null;
            this.telefone = null;
            this.senha = null;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void acessar() {

    }

    void mostrar () {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Telefone: " + nome);
        System.out.println("Senha: " + senha);
    }
}
