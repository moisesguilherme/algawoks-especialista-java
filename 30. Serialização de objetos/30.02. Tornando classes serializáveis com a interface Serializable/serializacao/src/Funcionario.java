import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

// Serializable é uma interface de marcação não tem nenhum método
public class Funcionario implements Serializable {

    private String nome;
    private LocalDate dataNascimento;
    // propriedade transient (não vai serializar essa propriedade)
    // não vai salvar esse dado e vai desserializar vai aparecer como null
    // salario=null
    private transient BigDecimal salario;

    public Funcionario(String nome, LocalDate dataNascimento, BigDecimal salario) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", salario=" + salario +
                '}';
    }
    
}