package patron_builder;

public class reportePruebas {
    reportePruebas() {
        Reporte reporte = new Reporte("Reporte de Ventas", "Juan Pérez", "2024-06-01", "Contenido del reporte...");
        reporte.incluirGraficas(true);
        reporte.pieDePagina("Confidencial - No distribuir");
        
        System.out.println("Título: " + reporte.getTitulo());
        System.out.println("Autor: " + reporte.getAutor());
        System.out.println("Fecha: " + reporte.getFecha());
        System.out.println("Contenido: " + reporte.getContenido());
        System.out.println("Incluir Gráficas: " + reporte.isIncluirGraficas());
        System.out.println("Pie de Página: " + reporte.getPieDePagina());
    }
    public static void main(String[] args) {
        new reportePruebas();
    }
    
}
