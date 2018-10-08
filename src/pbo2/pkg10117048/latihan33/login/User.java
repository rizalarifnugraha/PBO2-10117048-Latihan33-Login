/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117048.latihan33.login;

/**
 *
 * @author 
 * Nama  : Rizal Arif Nugraha
 * Nim   : 10117048
 * Kelas : PBO2
 * Deskripsi Program : Program ini tentang user login yang berisi username dan 
 *                     password dengan OO.
 */
public class User {

    private final String username = "Rizal";
    private final String password = "rahasia";
    private boolean statusAkun;

    private boolean cekAkun(String parUserName, String parPassword) {
        statusAkun = false;
        if (parUserName.equals(username) && parPassword.equals(password)) {
            statusAkun = true;
        }
        return statusAkun;
    }

    private void hasilLogin(boolean status, String parUserName) {
        this.cekAkun(parUserName, password);
        status = this.statusAkun;
        if (status == true) {
            System.out.println("******HALLO " + parUserName.toUpperCase() 
                    + "******");
            System.out.println("Selamat Datang di Aplikasi ini");
        }
        else{
            System.out.println("Ooops, Username atau Password anda salah");
        }
    }
    public void pengecekanLogin(String parUserName, String parPassword){
        this.cekAkun(parUserName, parPassword);
        this.hasilLogin(statusAkun, parUserName);
    }

}
