
public class Clientes {
    private String nome;
    private String cpf;
    private String telefone;
    
    public Clientes (String nome,String cpf,String telefone){
        this.nome= nome;
        this.cpf= cpf;
        this.telefone= telefone;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome= nome;
    }
    public String getCpf;(){
       return cpf;
    }
    public void setCpf(String cpf){
        this.cpf= cpf;
    }
    public String getTelefone(){
        return telefone;
    }
    public void setTelefone(String telefone){
        this.telefone= telefone;
    }
    public String toString(){
        return "Cliente[Nome:"+ nome+ "CPF:"+cpf+"Telefone:"+telefone+"]"
    }
}      
        public class Profissional;
        private String nome;
        private String telefone;
        
        public Profissional{
            this.nome= nome;
            this.telefone= telefone;
        }
        public String getNome();
        return nome;
    }
    public void setNome(String nome){
        this.nome= nome;
    }
    public String getTelefone(){
        return telefone;
    }
    public void setTelefone(String telefone){
        this.telefone= telefone;
    }
    public String toString(){
        return "Profissional[Nome: "+ nome+ "Telefone: "+ telefone +"]";
    }
}

   public class Servico{
       private String tipoServico;
       public Servico(String tipoServico) {
        this.tipoServico = tipoServico;
       }
        public String getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(String tipoServico) {
        this.tipoServico = tipoServico;
    }

    public String toString() {
        return "Serviço [Tipo de Serviço: " + tipoServico + "]";
    }
}


    public class Main {
        public static void main (String [] args){
             Clientes cliente = new Clientes("Gabriela", "123.456.789-00", "(11) 91234-5678");
        Profissional profissional = new Profissional("Rosa", "(11) 98765-4321");
        Servico servico = new Servico("Depilação");
        }
    }

        
