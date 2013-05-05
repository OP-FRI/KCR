/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fri.kcr;

/**
 *
 * @author Adrian Jarc
 */

public class Oseba {
    private String ime;
    private String priimek;
    private String geslo;
    private Racun[] racuni;
    
    public Oseba(String ime, String priimek, String geslo, int n){
        this.ime = ime;
        this.priimek = priimek;
        this.geslo = geslo;
        narediRacune(n);
    }
    
    public final void narediRacune(int n){
        racuni = new Racun[n];
        if (n == 3){
            racuni[0] = new Racun("Domači račun", "sda", 217.45);
            racuni[1] = new Racun("Službeni račun", "sda", -12540);
            racuni[2] = new Racun("Neobdavčeni račun", "sda", 220364.01);
        } else if(n == 1){
            racuni[0] = new Racun("Domači račun", "SI56 987654321098765", 200);
        }
    }
    
    public String dobiIme(){
        return this.ime + " " + this.priimek;
    }
    
    public String dobiGeslo(){
        return this.geslo;
    }
    
    public Racun[] vrniRacune(){
        return this.racuni;
    }
}
