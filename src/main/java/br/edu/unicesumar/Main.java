package br.edu.unicesumar;

public class Main {
    public static void main(String[] args) {
        Pessoa pesaoda = new Pessoa("Carlos");
        Endereço rua = new Endereço("123");

        pesaoda.setEndereço(rua);

        System.out.println(pesaoda.getEndereço().getRua());



        Aluno al= new Aluno("angelo");
        Aluno al1= new Aluno("angel");
        Aluno al2= new Aluno("ange");

        Curso c = new Curso("ovo");
        c.alunos(al, 0);
        c.alunos(al1, 1);
        c.alunos(al2,2);
        System.out.printf("\n%s\n",c.getAluno2().getNome());

        for (int i = 0; i < 3; i++) {
            System.out.println(c.getAluno()[i].getNome());
        }



        Pedido def= new Pedido(134,new Cliente("no", "dade"));
        System.out.printf("%s %s %s", def.getNumero(), def.getCliente().getEmail(), def.getCliente().getNome());

        Prefessor ord=new Prefessor("cris", "portugues");
        Escola escola = new Escola("nomeescola", ord);
        System.out.printf("\n%s %s %s", escola.getNome(), escola.getPrefessor().getDiciplina(), escola.getPrefessor().getNome());


        Carro car = new Carro("civic", "32");
        System.out.printf("%s %s", car.getModelo(),car.getMotor().getPotencia());

        Daumata da = new Daumata("oda");
        System.out.printf("\n%s", da.getNome());
        Cachorro ca = new Cachorro("osz");
        System.out.printf("\n%s", ca.getNome());
    }
}