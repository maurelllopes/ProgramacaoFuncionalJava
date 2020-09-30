package programa;

/*__________________________________________________VERSÃO 1_______________________________________________________*/

//ORDENAÇÃO COM IMPLEMENTAÇÃO DA INTERFACE COMPARATOR - SE POR ACASO O CRITÉRIO DE ORDENAÇÃO MUDAR PRECISAREMOS ALTERAR
// A CLASSE UNIFORMES. EM TERMOS DE MANUTENÇÃO É INDESEJÁVEL
/*
import java.io.IOException;
import java.util.*;
import java.lang.*;

public class Uniformes implements Comparable<Uniformes>{

    private String cor;
    private String tamanho;
    private String nome;

    public Uniformes(String cor, String tamanho, String nome){
        this.cor = cor;
        this.tamanho = tamanho;
        this.nome = nome;
    }
    public String getCor(){
        return cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public String getTamanho(){
        return tamanho;
    }
    public void setTamanho(String tamanho){
        this.tamanho = tamanho;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Uniformes{" +
                "cor='" + cor + '\'' +
                ", tamanho='" + tamanho + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }

    @Override
    public int compareTo(Uniformes u){
        return nome.toUpperCase().compareTo(u.getNome().toUpperCase());
    }
    public static void main(String[] args) throws IOException {

        List<Uniformes> lista = new ArrayList<>();
        lista.add(new Uniformes("vermelho", "G", "Zuenir Ventura"));
        lista.add(new Uniformes("branco", "P", "Alexandre Maurell"));
        lista.add(new Uniformes("vermelho", "M", "Joao Moreira"));
        lista.add(new Uniformes("branco", "G", "Marcia Maria"));

        Collections.sort(lista);

        for (Uniformes u : lista) {
            System.out.println(u);
        }}}
        */

/*__________________________________________________VERSÃO 2_______________________________________________________*/

//ORDENAÇÃO COM MÉTODO SORT DA INTERFACE LIST QUE RECEBE A INTERFACE FUNCIONAL COMPARATOR COMO ARGUMENTO CUJO MÉTODO
// COMPARE DEVE SER IMPLEMENTADO

/*
import java.io.IOException;
import java.util.*;
import java.lang.*;

public class Uniformes {

    private String cor;
    private String tamanho;
    private String nome;

    public Uniformes(String cor, String tamanho, String nome){
        this.cor = cor;
        this.tamanho = tamanho;
        this.nome = nome;
    }
    public String getCor(){
        return cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public String getTamanho(){
        return tamanho;
    }
    public void setTamanho(String tamanho){
        this.tamanho = tamanho;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Uniformes{" +
                "cor='" + cor + '\'' +
                ", tamanho='" + tamanho + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }

    public static void main(String[] args) throws IOException {

        List<Uniformes> lista = new ArrayList<>();
        lista.add(new Uniformes("vermelho", "G", "Zuenir Ventura"));
        lista.add(new Uniformes("branco", "P", "Alexandre Maurell"));
        lista.add(new Uniformes("vermelho", "M", "Joao Moreira"));
        lista.add(new Uniformes("branco", "G", "Marcia Maria"));

         class MyComparator implements Comparator<Uniformes>{
            @Override
            public int compare(Uniformes u1, Uniformes u2){
                return u1.getNome().toUpperCase().compareTo(u2.getNome().toUpperCase());
            }
        }

        lista.sort(new MyComparator());

        for (Uniformes u : lista) {
            System.out.println(u);
        }

    }
}
/*

/*__________________________________________________VERSÃO 3_______________________________________________________*/

//ORDENAÇÃO COM IMPLEMENTAÇÃO DE CLASSE ANÔNIMA ENTRE CHAVES

/*
import java.io.IOException;
import java.util.*;
import java.lang.*;

public class Uniformes {

    private String cor;
    private String tamanho;
    private String nome;

    public Uniformes(String cor, String tamanho, String nome){
        this.cor = cor;
        this.tamanho = tamanho;
        this.nome = nome;
    }
    public String getCor(){
        return cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public String getTamanho(){
        return tamanho;
    }
    public void setTamanho(String tamanho){
        this.tamanho = tamanho;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Uniformes{" +
                "cor='" + cor + '\'' +
                ", tamanho='" + tamanho + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }

    public static void main(String[] args) throws IOException {

        List<Uniformes> lista = new ArrayList<>();
        lista.add(new Uniformes("vermelho", "G", "Zuenir Ventura"));
        lista.add(new Uniformes("branco", "P", "Alexandre Maurell"));
        lista.add(new Uniformes("vermelho", "M", "Joao Moreira"));
        lista.add(new Uniformes("branco", "G", "Marcia Maria"));

        class MyComparator implements Comparator<Uniformes>{
            @Override
            public int compare(Uniformes u1, Uniformes u2){
                return u1.getNome().toUpperCase().compareTo(u2.getNome().toUpperCase());
            }
        }
        //CLASSE VERBOSA E DESAJEITADA
    Comparator<Uniformes> comp = new Comparator<Uniformes>() {
    @Override
    public int compare(Uniformes u1, Uniformes u2) {
        return u1.getNome().toUpperCase().compareTo(u2.getNome().toUpperCase());
    }
};
        lista.sort(comp);

        for (Uniformes u : lista) {
            System.out.println(u);
        }

    }
}
*/

/*__________________________________________________VERSÃO 4_______________________________________________________*/

//ORDENAÇÃO COM COMPARATOR VERSÃO 4 - COMPARATOR EXPRESSÃO LAMBDA DIRETO NO ARGUMENTO


import java.io.IOException;
import java.util.*;
import java.lang.*;

public class Uniformes {

    private String cor;
    private String tamanho;
    private String nome;

    public Uniformes(String cor, String tamanho, String nome){
        this.cor = cor;
        this.tamanho = tamanho;
        this.nome = nome;
    }
    public String getCor(){
        return cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public String getTamanho(){
        return tamanho;
    }
    public void setTamanho(String tamanho){
        this.tamanho = tamanho;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Uniformes{" +
                "cor='" + cor + '\'' +
                ", tamanho='" + tamanho + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
    public static void main(String[] args) throws IOException {

        List<Uniformes> lista = new ArrayList<>();
        lista.add(new Uniformes("vermelho", "G", "Zuenir Ventura"));
        lista.add(new Uniformes("branco", "P", "Alexandre Maurell"));
        lista.add(new Uniformes("vermelho", "M", "Joao Moreira"));
        lista.add(new Uniformes("branco", "G", "Marcia Maria"));


        // COMPARATOR EXPRESSÃO LAMBDA DIRETO NO ARGUMENTO
        lista.sort((u1, u2) -> u1.getNome().toUpperCase().compareTo(u2.getNome().toUpperCase()));

        for (Uniformes u : lista) {
            System.out.println(u);
        }

    }
}
 
