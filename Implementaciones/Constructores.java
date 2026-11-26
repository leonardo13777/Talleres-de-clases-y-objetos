package Implementaciones;
public class Constructores {
    private String firtsName;
    
    public Constructores ( String newfirtsName){
        firtsName = newfirtsName;
    }
    
    public void setFirtsName(String firtsName) {
        if (firtsName.charAt(0) >= 'A' && firtsName.charAt(0) <= 'Z') {
            for (int i = 1; i < firtsName.length(); i++){
                if (firtsName.charAt(i) >= 'a' && firtsName.charAt(i) <= 'z') {
                    this.firtsName = firtsName;
                } else {
                    break;
                }
            }
            System.out.println("El nombre es invalido");
            }
        }
    public String getFirtsName() {
        return firtsName;
    }
}
