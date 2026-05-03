package patron_builder;

public class Reporte {
     private String titulo;
        private String autor;
        private String fecha;
        private String contenido;
        private boolean incluirGraficas = false;
        private String pieDePagina;
        public Reporte(String titulo, String autor, String fecha, String contenido) {
            this.titulo = titulo;
            this.autor = autor;
            this.fecha = fecha;
            this.contenido = contenido;
        }
        public void titulo(String titulo) {
            this.titulo = titulo;
        }
        public void autor(String autor) {
            this.autor = autor;
        }
        public void fecha(String fecha) {
            this.fecha = fecha;
        }
        public void contenido(String contenido) {
            this.contenido = contenido;
        }
        public void incluirGraficas(boolean incluirGraficas) {
            this.incluirGraficas = incluirGraficas;
        }
        public void pieDePagina(String pieDePagina) {
            this.pieDePagina = pieDePagina;
        }
        public String getTitulo() {
            return titulo;
        }
        public String getAutor() {
            return autor;
        }
        public String getFecha() {
            return fecha;
        }
        public String getContenido() {
            return contenido;
        }
        public boolean isIncluirGraficas() {
            return incluirGraficas;
        }
        public String getPieDePagina() {
            return pieDePagina;
        }
        
    
}