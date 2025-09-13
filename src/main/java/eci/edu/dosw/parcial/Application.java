package eci.edu.dosw.parcial;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {
		public static void main(String[] args) {
			SpringApplication.run(Application.class, args);
		}

		@Override
		public void run(String... args) {
			EciReports eciReports = new EciReports();
			Report report = eciReports.createAcademicReport();
			System.out.println(report.getFormatType());
			report.getFeatures().stream().forEach(f->System.out.println(f.getFeatureType()));
		}
}


