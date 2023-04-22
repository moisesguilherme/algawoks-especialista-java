public class Produto {

    int quantidadeEstoque;
    // no java mesmo se não criar o construtor principal ele vai criar um padrão ao rodar o projeto
    Produto(){
        this.quantidadeEstoque = 10;
        System.out.println("Construido um protudo");
    }

    // Se tiver um retorno ele não é mais um construtor e sim um método
    void Produto(){
        System.out.println("Isso é um método, com retorno void");
    }
}
