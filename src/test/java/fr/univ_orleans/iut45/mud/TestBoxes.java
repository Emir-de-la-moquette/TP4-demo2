package fr.univ_orleans.iut45.mud;

import static org.junit.Assert.assertTrue;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.io.IOException;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class TestBoxes {

    @Test
    public void testBoxFromJSONSimple() throws IOException{
    // use the file test1.json in ressources folder
//        String path = TestBoxes.class.getClassLoader().getResource("test1.json").getFile();
        Path path2 = Paths.get("C:\\Users\\shank\\OneDrive\\Bureau\\Travail\\qualité dev\\demo2\\src\\test\\ressources\\test1.json");
//        Path path3 = Paths.get("/Users/shank/OneDrive/Bureau/Travail//qualité dev//demo2/src/test/ressources//test1.json");
        String content = String.join("",Files.readAllLines(path2));
        Box b = Box.fromJSON(content);
        assertEquals(b.capacity(), 5);
        assertTrue(b.isOpen());
 }
}

