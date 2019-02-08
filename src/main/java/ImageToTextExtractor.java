import com.asprise.ocr.Ocr;

import java.io.File;

public class ImageToTextExtractor {

    public static void main(String args[]) {
        Ocr.setUp();
        Ocr ocr = new Ocr(); // create a new OCR engine
        ocr.startEngine("eng", Ocr.SPEED_FASTEST); // English
        String s = ocr.recognize(new File[]{new File("/home/Developer/Downloads/password.png")},
                Ocr.RECOGNIZE_TYPE_ALL,
                Ocr.OUTPUT_FORMAT_PLAINTEXT);
        System.out.println("Result: " + s);
        ocr.stopEngine();
    }
}
