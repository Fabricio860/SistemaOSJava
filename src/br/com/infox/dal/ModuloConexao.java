/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infox.dal;

import java.sql.*;

/**
 *
 * @author usuario
 */
public class ModuloConexao {

    //Método responsavel por estabelecer a conexão com o banco
    public static Connection conector() { //Método é o conector
        Connection conexao = null; // conexao é a variável
        // A linha abaixo chama o drive - baixado connector
        String driver = "com.mysql.cj.jdbc.Driver"; // Tipos de banco de dados
        //Armazenando infomações referene ao banco
        String url = "jdbc:mysql://localhost:3306/dbinfox?characterEncoding=utf-8"; //Qual o caminho
        String user = "dba"; //Qual usuário que pode acessar o banco
        String password = "Tobinha1@"; //senha padrão do chapion
        //Estabelecendo a conexão com o banco
        
        try {//se dar tudo certo
            Class.forName(driver);// Executa arquivo do drive
            conexao = DriverManager.getConnection(url, user, password);//caminho,user, senha           
            return conexao;           
            
        } catch (Exception e) { //caso de errado
            // System.out.println(e); imprimir o erro da exeção
            return null;
        }
    }
}
