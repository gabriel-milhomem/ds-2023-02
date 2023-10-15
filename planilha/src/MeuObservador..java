class MeuObservador implements Observer {
    private String nome;
    private String log;

    public MeuObservador(String nome) {
      this.nome = nome;
      this.log = "";
    }

    @Override
    public void update(Subject celula) {
      log += "Reavaliar " + nome + " por mudança ocorrida em " + ((Celula) celula).getNome() + "\n";
    }

    public String getLog() {
      return log;
    }
}