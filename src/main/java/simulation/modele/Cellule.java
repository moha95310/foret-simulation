package simulation.modele;

public class Cellule {

    private int x;
    private int y;
    private EtatCellule etat;
    private double humidite;           // % ex: 0.75 = 75% humide
    private double inflammabilite;     // % ex: 0.90 = 90% inflammable
    private double resistance;         // % ex: 0.20 = 20% résistant
    private double densiteVegetation;  // quantité de matière à brûler (0.0 à 1.0)
    private double temperature;        // en °C

    public Cellule(int x, int y) {
        this.x = x;
        this.y = y;
        this.etat = EtatCellule.INTACT;
        this.humidite = 0.30;
        this.inflammabilite = 0.50;
        this.resistance = 0.50;
        this.densiteVegetation = 1.0;
        this.temperature = 20.0;
    }

    // Getters
    public int getX() { return x; }
    public int getY() { return y; }
    public EtatCellule getEtat() { return etat; }
    public double getHumidite() { return humidite; }
    public double getInflammabilite() { return inflammabilite; }
    public double getResistance() { return resistance; }
    public double getDensiteVegetation() { return densiteVegetation; }
    public double getTemperature() { return temperature; }

    // Setters avec vérification entre 0.0 et 1.0
    public void setEtat(EtatCellule etat) { this.etat = etat; }

    public void setHumidite(double humidite) {
        if (humidite < 0.0) humidite = 0.0;
        if (humidite > 1.0) humidite = 1.0;
        this.humidite = humidite;
    }

    public void setInflammabilite(double inflammabilite) {
        if (inflammabilite < 0.0) inflammabilite = 0.0;
        if (inflammabilite > 1.0) inflammabilite = 1.0;
        this.inflammabilite = inflammabilite;
    }

    public void setResistance(double resistance) {
        if (resistance < 0.0) resistance = 0.0;
        if (resistance > 1.0) resistance = 1.0;
        this.resistance = resistance;
    }

    public void setDensiteVegetation(double densite) {
        if (densite < 0.0) densite = 0.0;
        if (densite > 1.0) densite = 1.0;
        this.densiteVegetation = densite;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}
// TODO
