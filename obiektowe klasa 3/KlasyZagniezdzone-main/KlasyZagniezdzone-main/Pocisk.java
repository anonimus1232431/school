import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Random;

public class Pocisk {
    private int numerPocisku;
    Random random = new Random();

    public Pocisk(int numer) {
        this.numerPocisku = numer;
    }

    public void generujOdlamki() {
        Random random = new Random();
        int liczbaOdlamkow = random.nextInt(1, 5);
        for (int i = 1; i <= liczbaOdlamkow; ++i) {
            Odlamek odlamek = new Odlamek(i);

            odlamek.komunikat();
            odlamek.komunikatt();
            odlamek.sprawdzKolizje();  // Check for collisions between vectors
        }
    }

    class Odlamek {
        ArrayList<Vector> wektoryOdlamkow;  // ArrayList for vectors of the Odlamek
        int numerOdlamka;
        int wektorX;
        int wektorY;

        public Odlamek(int numer) {
            this.numerOdlamka = numer;
            this.wektorX = random.nextInt(-10, 10);
            this.wektorY = random.nextInt(-10, 10);
            this.wektoryOdlamkow = new ArrayList<>();  // Initialize the list for vectors
            wektoryOdlamkow.add(new Vector(wektorX, wektorY));  // Add initial vector to the list
        }

        public void komunikat() {
            System.out.println("Pocisk " + Pocisk.this.numerPocisku +
                    " - wygenerowano odłamek " + this.numerOdlamka +
                    " o wektorze przesunięcia (x: " + wektorX + ", y: " + wektorY + ")");
        }

        public void komunikatt() {
            int liczbaOdlamkow = random.nextInt(5) + 1;
            for (int i = 1; i <= liczbaOdlamkow; ++i) {
                wektorX = random.nextInt(-10, 10);
                wektorY = random.nextInt(-10, 10);
                wektoryOdlamkow.add(new Vector(wektorX, wektorY));  // Add new vector to the list

                System.out.println("Wygenerowano odlamek odlamka " + i +
                        " o wektorze przesunięcia (x: " + wektorX + ", y: " + wektorY + ")");
            }

            // Optional: print all the vectors in the list
            System.out.println("Wszystkie wektory dla odłamka " + this.numerOdlamka + ": ");
            for (Vector v : wektoryOdlamkow) {
                System.out.println("Vector (x: " + v.x + ", y: " + v.y + ")");

            }
            System.out.println();
        }


        // Method to check for collisions
        public void sprawdzKolizje() {
            double threshold = 10.0;  // Distance threshold for collision
            for (int i = 1; i <= wektoryOdlamkow.size(); i++) {
                for (int j = i + 1; j < wektoryOdlamkow.size(); j++) {
                    Vector v1 = wektoryOdlamkow.get(i);
                    Vector v2 = wektoryOdlamkow.get(j);
                    double distance = obliczOdleglosc(v1, v2);
                    if (distance < threshold) {

                        System.out.println("Kolizja! Odłamek " + i + " z odłamkiem " + j +
                                " kolidują na dystansie " + distance);
                    } else {

                        System.out.println("Nie ma kolizji");
                    }
                }
            }
        }

        // Method to calculate the distance between two vectors
        private double obliczOdleglosc(Vector v1, Vector v2) {
            return Math.sqrt(Math.pow(v2.x - v1.x, 2) + Math.pow(v2.y - v1.y, 2));
        }
    }
    class Vector {
        int x;
        int y;

        public Vector(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}












