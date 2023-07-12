package br.edu.ifba.saj.ads.poo;

import java.util.ArrayList;

public class BancoDeUsuarios {


    static ArrayList<Usuario> ListaUsuarios = new ArrayList<Usuario>();

    public static void addUsuario(Usuario user){
        ListaUsuarios.add(user);
    };

    public static String autenticar(String login, String senha ) throws AutenticacaoInvalidaException{
        for (Usuario user : ListaUsuarios) {
                if(user.getLogin().equals(login) && user.getSenha().equals(senha)){
                    return "Usuário Identificado: " + user.getLogin();
        }

        throw new AutenticacaoInvalidaException("Usuário " + login + " não foi encontrado ou a senha está errada");
        
    };

    return null;
    
    };
};