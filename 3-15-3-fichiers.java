//code de M. Laurent Boyer

// exemple d'utilisation de la lecture dans un fichier
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

        public class testReadFile {
            public static void main(String[] args) throws IOException {
            // On crée un BufferedReader à partir d'un FileReader.
                // pour résumer un FileReader lit caractère par caractère
                // et le BufferedReader gère un buffer qui permet notamment de
                // récupérer des lignes de texte avec la méthode readLine().
            BufferedReader reader = new BufferedReader(
                    new FileReader("/home/laurent/hello2.txt"));
            String line="";

            // on l'utiliser avec par exemple une boucle de cette forme :
                // Chaque appel à readLine() retourne une nouvelle ligne du fichier.
                // readLine retourne null lorsqu'on arrive au bout du fichier.

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // On ferme ensuite le BufferedReader.
            reader.close();
            }
