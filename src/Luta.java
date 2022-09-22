import java.util.Random;
import java.lang.Thread;

public class Luta {
    // Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    Random r = new Random();
    // Métodos Públicos
    public void marcarLuta(Lutador l1, Lutador l2) throws InterruptedException{
        if (l1.getCategoria() == l2.getCategoria() && l1 != l2){
            this.aprovada = true;
            System.out.println(l1.getNome() + l1.getLife());
            System.out.println(l2.getNome() + l2.getLife());
            lutar(l1, l2);
        }else{
            this.aprovada = false;
            this.desafiante = null;
            this.desafiado = null;
        }
    }

    public void lutar(Lutador l1, Lutador l2) throws InterruptedException {
        if (this.aprovada == true){
            l1.apresentar();
            l2.apresentar();
            int ataque = r.nextInt(2);
            while (true){
            if (l1.getLife() > 0 && l2.getLife() > 0){
                if (ataque == 1){
                    atacar(l2);
                    System.out.println(l1.getNome() + " ESTÁ ATACANDO... " + " E A LIFE DE " + l2.getNome() + " É: " + l2.getLife());
                    Thread.sleep(1500);
                    ataque = r.nextInt(2);
                }else{
                    atacar(l1);
                    System.out.println(l2.getNome() + " ESTÁ ATACANDO... " + " E A LIFE DE " + l1.getNome() + " É: " + l1.getLife());
                    Thread.sleep(1500);
                    ataque = r.nextInt(2);
                }
            }else{
                if (l1.getLife() == 0){
                    wins(l2);
                    loser(l1);
                    break;
                }else{
                    wins(l1);
                    loser(l2);
                    break;
                }
            
            }
        }
        }else{
            System.out.println("A luta não pode acontecer!");
        }


    }

    // Métodos Especiais
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public void atacar(Lutador l) {
        l.setLife(l.getLife() - 10);
    }

    public void wins(Lutador l){
            System.out.println("O VENCEDOR É " + l.getNome());
            l.ganharLuta();
        }

    public void loser(Lutador l){
        System.out.println("O Lutador " + l.getNome() + " Perdeu a Luta");
        l.perderLuta();
    }
    }
