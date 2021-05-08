package ro.ase.cts.Exercitiu16.Clase;

public class ContCurent extends Cont{

    public ContCurent(float sold) {
        super(sold);
    }

    @Override
    public void realizeazaPlata(float suma) {
        if(super.getSold() >= suma){
            System.out.println("se realizeaza plata din contul curent"+suma);
            super.setSold(super.getSold()-suma);
        }
        else if (super.getSuccesorCont() !=null){
                super.getSuccesorCont().realizeazaPlata(suma);
            }

        else {
            System.out.println("nu se poate realiza plata");
        }
    }
}
