package br.com.sample;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.io.IOException;

public class SampleTest {

    public static void main(String[] args) {

        // criação do objeto documento
        Document document = new Document();

        try {

            PdfWriter.getInstance(document, new FileOutputStream("/home/wolmir/pdf_ReceitasDeCodigo.pdf"));
            document.open();

            // adicionando um parágrafo ao documento
            document.add(new Paragraph("Gerando um PDF usando iText em Java"));

            // adicionando um parágrafo com fonte diferente ao arquivo
            document.add(new Paragraph("Adicionando outro paragrafo", FontFactory.getFont(FontFactory.COURIER, 12)));

        } catch(DocumentException de) {
            System.err.println(de.getMessage());
        } catch(IOException ioe) {
            System.err.println(ioe.getMessage());
        } finally {
            document.close();
        }
    }
}
