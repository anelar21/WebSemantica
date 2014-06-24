package examen;

import com.hp.hpl.jena.ontology.*;
import com.hp.hpl.jena.rdf.arp.impl.AttributeLexer;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WebSemantica {

    final public static List<String> rfinal = new ArrayList<>();
    final public static List<String> listaRelaciones = new ArrayList<String>();
    final public static List<String> listaindividuos = new ArrayList<String>();
    final public static List<String> listaclases = new ArrayList<String>();

    public void obtenerDatos() {
        OntModel personaOntology = ModelFactory.createOntologyModel();
        OntModel areaOntology = ModelFactory.createOntologyModel();
        Iterator<DatatypeProperty> propiedades = areaOntology.listDatatypeProperties();
        try {
            InputStream file = new FileInputStream(System.getProperty("user.dir") + "/src/archivo/examen.rdf");
            personaOntology.read(file, "");
        } catch (FileNotFoundException ex) {
        }
        Iterator<OntClass> clases = personaOntology.listClasses();
        Iterator<ObjectProperty> relaciones = personaOntology.listObjectProperties();
        Iterator<Individual> individuos = personaOntology.listIndividuals();
        while (clases.hasNext()) {
            if((clases.next().getLocalName())!=null){
                listaclases.add(clases.next().getSubClass().getLocalName());
            }
        }
        while (relaciones.hasNext()) {
            listaRelaciones.add((String) relaciones.next().getLocalName().toString());
        }
        while (individuos.hasNext()) {
            listaindividuos.add(individuos.next().getLocalName());
        }
        System.out.println("-------------------------------------------");
        
    }
    
//    public List<String> devolverDatos() {
//        OntModel areaOntology = ModelFactory.createOntologyModel();
//        OntModel personaOntology = ModelFactory.createOntologyModel();
//
//        // areaOntology.read("http://www.daml.org/2001/10/html/airport-ont");
//        try {
//            InputStream file = new FileInputStream("C:\\Users\\usuario\\Documents\\NetBeansProjects\\ExamenWebSemantica\\src\\archivo\\examen.owl");
//            personaOntology.read(file, "");
//        } catch (FileNotFoundException ex) {
//        }
//
//        Iterator<DatatypeProperty> propiedades = areaOntology.listDatatypeProperties();
//        Iterator<OntClass> clases = personaOntology.listClasses();
//        while (propiedades.hasNext()) {
//            System.out.println(propiedades.next().getLocalName());
//        }
//        System.out.println("-------------------------------------------");
//        while (clases.hasNext()) {
//            //     rfinal.add("\n"+clases.next().getLocalName());
//            rfinal.add("\n" + clases.next().getLocalName());
//
//            //     System.out.println( clases.next().getLocalName()+"\n");
//
//            //    System.out.println("Clases y subclases" + clases.next().getSubClass());
//
//        }
//        return rfinal;
//    }
//
//    
//
////    public static void main(String[] args) {
////        WebSemantica w = new WebSemantica();
////        w.obtenerDatos();
////        // w.devolverDatos();
////    }
}
