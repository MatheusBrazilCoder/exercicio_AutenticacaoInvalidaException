/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package br.edu.ifba.saj.ads.poo;

public class App {
    
    public static void main(String[] args) throws AutenticacaoInvalidaException {
        try {
            Usuario u = new Usuario("Men", "123");
            BancoDeUsuarios.addUsuario(u);
            System.out.println(BancoDeUsuarios.autenticar("Mn", "123"));
    
        }catch (AutenticacaoInvalidaException e) {
            System.out.println(e.getMessage());
        }
    }    
}
