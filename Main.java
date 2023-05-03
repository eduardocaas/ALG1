package com.efc;

public class Main {

    public static void main(String[] args) {

        Desktop desktop = new Desktop();
        Notebook notebook = new Notebook();

        desktop.cadastrar("Dell" , "Cinza", 3000.00, 600);
        notebook.cadastrar("Lenovo", "Preto", 4500.00, 14);

        desktop.getInformacoes();
        notebook.getInformacoes();

    }
}
