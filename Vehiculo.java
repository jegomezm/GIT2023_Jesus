
public class Vehiculo {
  
  public String marca;
  public String modelo;
  public String matricula;
  
  Vehiculo (String marca, String modelo, String matricula) {
    this.marca = marca;
    this.modelo = modelo;
    this.matricula = matricula;
  }

  public void mostrarMarca() {
    System.out.println(marca);
  }
}

