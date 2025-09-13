package eci.edu.dosw.parcial;

import java.util.Scanner;

public class EciReports {

    public Report createAcademicReport(){
        Scanner scanner = new Scanner(System.in);
        AcademicReportBuilder builder = new AcademicReportBuilder();

        boolean continueAdding = true;
        while (continueAdding) {
            System.out.println("¿Qué feature desea agregar? (1.tabla, 2.gráficos, 3.diagrama, 4.salir):");
            String input = scanner.nextLine().toLowerCase();
            Feature feature = null;

            switch (input) {
                case "1":
                    feature = new Table();
                    feature.setFeatureType("Tabla");
                    builder.addFeaturesToReport(feature);
                    break;
                case "2":
                    feature = new Graphics();
                    feature.setFeatureType("Grafica");
                    builder.addFeaturesToReport(feature);
                    break;
                case "3":
                    feature.setFeatureType("Diagrama");
                    builder.addFeaturesToReport(feature);
                    feature = new Diagram();
                    break;
                case "4":
                    continueAdding = false;
                    continue;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
                    continue;
            }

            if (feature != null) {
                builder.addFeaturesToReport(feature);
                System.out.println("Feature " + feature.getFeatureType() + " agregado.");
            }
        }
        scanner.close();
        return builder.getReport();
    }
}
