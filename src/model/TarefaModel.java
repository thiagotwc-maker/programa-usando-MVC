package model;

public class TarefaModel {
    
   private String nome;
   private boolean concluida;
   
   public TarefaModel(String nome) {
       this.nome = nome;
       this.concluida = false;
   }
   public String getNome() {
       return nome;
   }
   public boolean isConcluida() {
       return concluida;
   }
   public void concluir() {
       concluida = true;
   }

    @Override
    public String toString() {
        return "Tarefa: " + "nome: " + nome + ", concluida: " + concluida ;
    }
   
   
  
}