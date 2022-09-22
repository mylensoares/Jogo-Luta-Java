public class Lutador {
    // Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    private int life;

    // Métodos Públicos
    public void apresentar(){
        System.out.println("==========================================");
        System.out.println("Apresentamos o lutador " + this.getNome());
        System.out.println("Diretamente de " + this.getNacionalidade());
        System.out.println("Com " + this.getIdade() + " anos");
        System.out.println("Altura: " + this.getAltura() + " Peso: " + this.getPeso());
        System.out.println("Possui " + this.getVitorias() + " Vitórias, " + this.getDerrotas() +
                                " Derrotas e " + this.getEmpates() + " Empates");

    }

    public void status(){
        System.out.println(this.getNome() + " está na categoria " + this.getCategoria());
        System.out.println("Ganhou " + this.getVitorias() + " Lutas");
        System.out.println("Empatou " + this.getEmpates() + " Vezes");
        System.out.println("E possui " + this.getDerrotas() + " Derrotas");

    }

    public void ganharLuta(){
        this.setVitorias(getVitorias() + 1 );
    }

    public void perderLuta(){
        this.setDerrotas(getDerrotas() + 1 );
    }

    public void empatarLuta(){
        this.setEmpates(getEmpates() + 1 );
    }

    // Construtor
    
    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso,
                    int vitorias, int derrotas, int empates, int life) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        this.life = life;
    }

    // Métodos Especiais
    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNacionalidade(){
        return this.nacionalidade;
    }

    public void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public float getAltura(){
        return this.altura;
    }

    public void setAltura(float altura){
        this.altura = altura;
    }

    public float getPeso(){
        return this.peso;
    }

    public void setPeso(float peso){
        this.peso = peso;
        setCategoria();
    }

    public String getCategoria(){
        return this.categoria;
    }

    private void setCategoria(){
        if (getPeso() < 52.2){
            this.categoria = "INVÁLIDO";
        }else if (getPeso() <= 70.3){
            this.categoria = "PESO LEVE";
        }else if (getPeso() <= 83.9){
            this.categoria = "PESO MÉDIO";
        }else if (getPeso() <= 120.2){
            this.categoria = "PESO PESADO";
        }else{
            this.categoria = "INVÁLIDO";
        }
    }

    public int getVitorias(){
        return this.vitorias;
    }

    public void setVitorias(int vitorias){
        this.vitorias = vitorias;
    }

    public int getDerrotas(){
        return this.derrotas;
    }
    
    public void setDerrotas(int derrotas){
        this.derrotas = derrotas;
    }

    public int getEmpates(){
        return this.empates;
    }

    public void setEmpates(int empates){
        this.empates = empates;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    

    
}
