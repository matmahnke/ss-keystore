/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ss_keystore;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mathe
 */
public class Ss_keystore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            app();
        } catch (Exception e) {

        }

    }

    public static void app() throws FileNotFoundException, IOException, NoSuchAlgorithmException, CertificateException, KeyStoreException {
        InputStream inputStream = null;
        inputStream = new FileInputStream("C:\\Users\\mathe\\Downloads\\certificados\\keystorage");
        KeyStore keystore = null;
        String senha = "A";
        keystore = KeyStore.getInstance("JKS");
        keystore.load(inputStream, senha.toCharArray());

        Certificate certificate = keystore.getCertificate("c1");
        X509Certificate x509Cert = (X509Certificate) certificate;
        System.out.println(x509Cert.getSubjectDN().getName());
        System.out.println(x509Cert.getIssuerDN());
        //System.out.println(x509Cert.);
    }

}
