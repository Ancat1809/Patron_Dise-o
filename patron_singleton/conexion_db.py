import threading
class ConexionDB:
    instancia = None

    def __new__(cls):
        if cls._instancia is None:
            cls._instancia = super().__new__(cls)
            print("Conexión establecida")
        return cls._instancia

    def ejecutar_query(self, query):
        print(f"Ejecutando: {query}")

    def get_connection(self):
        return self.connection
    
# Ejemplo de uso
if __name__ == "__main__":
    conexion1 = ConexionDB()
    conexion2 = ConexionDB()

    print(conexion1 is conexion2)  # True, ambas variables apuntan a la misma instancia
