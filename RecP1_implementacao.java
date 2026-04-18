public class Cliente {
    private int id;
    private String nome;
    private String endereco;
 
    public Cliente(int id, String nome, String endereco) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
    }
 
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
 
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
 
    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }
}


 // Produto serve como base para herança
public class Produto {
    private int id;
    private String nome;
    private double preco;
 
    public Produto() {}
 
    public Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }
 
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
 
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
 
    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }
  
}



public class Pizza extends Produto {
    private String tamanho;
    private String sabor;
 
    public Pizza(int id, String nome, double preco, String tamanho, String sabor) {
        super(id, nome, preco);
        this.tamanho = tamanho;
        this.sabor = sabor;
    }
 
    public String getTamanho() { return tamanho; }
    public void setTamanho(String tamanho) { this.tamanho = tamanho; }
 
    public String getSabor() { return sabor; }
    public void setSabor(String sabor) { this.sabor = sabor; }
}


public class Bebida extends Produto {
    private double volume;
 
    public Bebida(int id, String nome, double preco, double volume) {
        super(id, nome, preco);
        this.volume = volume;
    }
 
    public double getVolume() { return volume; }
    public void setVolume(double volume) { this.volume = volume; }
}



public class ItemPedido {
    private Produto produto;
    private int quantidade;
 
    public ItemPedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }
 
    public Produto getProduto() { return produto; }
    public void setProduto(Produto produto) { this.produto = produto; }
 
    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }
 
    public double calcularSubtotal() {
        return produto.getPreco() * quantidade;
    }
}

public class Pagamento {
    private String tipo;
    private double valor;
 
    public Pagamento(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }
 
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
 
    public double getValor() { return valor; }
    public void setValor(double valor) { this.valor = valor; }
}


import java.util.ArrayList;
import java.util.List;

// Utilizando composição e associação
public class Pedido {
    private int id;
    private String status;
    private Cliente cliente;
    private Pagamento pagamento;
    private List<ItemPedido> itens = new ArrayList<>();
 
    public Pedido(int id, String status, Cliente cliente) {
        this.id = id;
        this.status = status;
        this.cliente = cliente;
    }
 
    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }
 
    public double calcularTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.calcularSubtotal();
        }
        return total;
    }
 
    public int getId() { return id; }
    public String getStatus() { return status; }
 
    public void setStatus(String status) { this.status = status; }
 
    public Cliente getCliente() { return cliente; }
 
    public Pagamento getPagamento() { return pagamento; }
    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }
 
    public List<ItemPedido> getItens() { return itens; }
}




















