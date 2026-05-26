package simulation.modele;

public class Grille {

    // 1. Attributs
    private int largeur;
    private int hauteur;
    private Cellule[][] cellules;

    public static final int LARGEUR_DEFAUT = 50;
    public static final int HAUTEUR_DEFAUT = 50;

    // 2. Constructeurs
    public Grille(int largeur, int hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
        this.cellules = new Cellule[hauteur][largeur];
        initialiser();
    }

    public Grille() {
        this(LARGEUR_DEFAUT, HAUTEUR_DEFAUT);
    }

    // 3. Méthodes métier
    private void initialiser() {
        for (int y = 0; y < hauteur; y++) {
            for (int x = 0; x < largeur; x++) {
                cellules[y][x] = new Cellule(x, y);
            }
        }
    }

    public Cellule getCellule(int x, int y) {
        if (estValide(x, y)) {
            return cellules[y][x];
        }
        return null;
    }

    public void setCellule(int x, int y, Cellule c) {
        if (estValide(x, y)) {
            cellules[y][x] = c;
        }
    }

    public boolean estValide(int x, int y) {
        return x >= 0 && x < largeur && y >= 0 && y < hauteur;
    }

    // 4. Getters / Setters
    public int getLargeur() { return largeur; }
    public int getHauteur() { return hauteur; }
}

// TODO
