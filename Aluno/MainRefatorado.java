package Aluno;

import java.util.Scanner;

public class MainRefatorado {
    public static void main(String[] args) {
        Scanner tc=new Scanner(System.in);
        AlunoDao ad=new AlunoDao();
        int op;
        do {
            System.out.println("Menu");
            System.out.println("1-Listar os Alunos");
            System.out.println("2-Adicionar Alunos");
            System.out.println("3-Excluir Alunos");
            System.out.println("4-Atualizar Aluno");
            System.out.println("5-Sair");

            op=tc.nextInt();

            switch (op){
                case 1:{
                    ad.list();
                    break;
                }
            }
        }while (op!=5);


        DbUtils banco = new DbUtils();
        banco.criarDB();

        //DbHelper sqlLite= new DbHelper();
        //sqlLite.executarSQL("INSERT NTO ALUNO (NOME,IDADE,CODIGO,SALARIO) VALUES ('Ramon', 32, '021131000', 200 )");

        Aluno a= new Aluno("Sadi",34,"0034",30.0);
        AlunoDao daoAluno = new AlunoDao();
        daoAluno.save(a);
        daoAluno.list();
    }
}