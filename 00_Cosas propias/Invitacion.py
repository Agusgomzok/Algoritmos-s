import sys
import random
from PyQt5.QtWidgets import QApplication, QMainWindow, QLabel, QPushButton, QVBoxLayout, QWidget, QHBoxLayout
from PyQt5.QtGui import QPixmap, QIcon
from PyQt5.QtCore import Qt

class MainWindow(QMainWindow):
    def __init__(self):
        super().__init__()
        self.setWindowTitle("14 de Febrero")
        self.setGeometry(0, 0, 1280, 720)  # Tamaño de la ventana

        # Escena inicial
        self.escena_actual = 1
        self.frases = ["¿Qué aburrida?", "¿Qué, no te da pelirroja?", "Mirimirimi", "Te amo mucho, pero apretá el Sí"]
        self.contador_clics = 0

        # Configurar la escena inicial
        self.mostrar_escena_1()

    def mostrar_escena_1(self):
        # Limpiar la ventana
        self.escena_actual = 1
        self.contador_clics = 0
        self.setCentralWidget(QWidget())
        layout = QVBoxLayout()

        # Texto
        texto = QLabel("¿Querés ser mi 14 de febrero?❤️‍🩹")
        texto.setAlignment(Qt.AlignCenter)
        texto.setStyleSheet("font-size: 24px; font-weight: bold;")
        layout.addWidget(texto)

        # Layout horizontal para los botones
        botones_layout = QHBoxLayout()

        # Botón "Sí"
        boton_si = QPushButton("Sí")
        boton_si.setStyleSheet("font-size: 18px; padding: 10px 20px;")  # Tamaño más pequeño
        boton_si.clicked.connect(self.mostrar_escena_2)
        botones_layout.addWidget(boton_si)

        # Botón "No"
        self.boton_no = QPushButton("No")
        self.boton_no.setStyleSheet("font-size: 18px; padding: 10px 20px;")  # Tamaño más pequeño
        self.boton_no.clicked.connect(self.mover_boton_no)
        botones_layout.addWidget(self.boton_no)

        # Centrar los botones
        layout.addLayout(botones_layout)
        layout.setAlignment(botones_layout, Qt.AlignCenter)

        # Configurar el layout
        widget = QWidget()
        widget.setLayout(layout)
        self.setCentralWidget(widget)

    def mover_boton_no(self):
        # Mover el botón "No" aleatoriamente
        if self.escena_actual == 1:
            x = random.randint(0, self.width() - self.boton_no.width())
            y = random.randint(0, self.height() - self.boton_no.height())
            self.boton_no.move(x, y)

    def mostrar_escena_2(self):
        # Limpiar la ventana
        self.escena_actual = 2
        self.setCentralWidget(QWidget())
        layout = QVBoxLayout()

        # Texto
        texto = QLabel("Pero vamos hacerlo un poco más nuestro 💕")
        texto.setAlignment(Qt.AlignCenter)
        texto.setStyleSheet("font-size: 24px; font-weight: bold;")
        layout.addWidget(texto)

        # Layout horizontal para los botones
        botones_layout = QHBoxLayout()

        # Botón "Sí"
        boton_si = QPushButton("Sí")
        boton_si.setStyleSheet("font-size: 18px; padding: 10px 20px;")  # Tamaño más pequeño
        boton_si.clicked.connect(self.mostrar_escena_3)
        botones_layout.addWidget(boton_si)

        # Botón "No"
        self.boton_no = QPushButton("No")
        self.boton_no.setStyleSheet("font-size: 18px; padding: 10px 20px;")  # Tamaño más pequeño
        self.boton_no.clicked.connect(self.cambiar_texto_y_imagen)
        botones_layout.addWidget(self.boton_no)

        # Centrar los botones
        layout.addLayout(botones_layout)
        layout.setAlignment(botones_layout, Qt.AlignCenter)

        # Configurar el layout
        widget = QWidget()
        widget.setLayout(layout)
        self.setCentralWidget(widget)

    def mostrar_escena_3(self):
        # Limpiar la ventana
        self.escena_actual = 3
        self.setCentralWidget(QWidget())
        layout = QVBoxLayout()

        # Texto
        texto = QLabel("Que te diviertas mi Vidaaa")
        texto.setAlignment(Qt.AlignCenter)
        texto.setStyleSheet("font-size: 24px; font-weight: bold;")
        layout.addWidget(texto)

        # Imagen
        try:
            imagen = QLabel(self)
            pixmap = QPixmap("ultima_imagen.jpg")

            # Escalar la imagen al tamaño deseado (por ejemplo, 500x500)
            pixmap = pixmap.scaled(500, 500, Qt.KeepAspectRatio, Qt.SmoothTransformation)

            imagen.setPixmap(pixmap)
            imagen.setAlignment(Qt.AlignCenter)
            layout.addWidget(imagen)
        except Exception as e:
            print("Error al cargar la imagen:", e)

        # Configurar el layout
        widget = QWidget()
        widget.setLayout(layout)
        self.setCentralWidget(widget)

    def cambiar_texto_y_imagen(self):
        # Cambiar el texto del botón "No" y luego mostrar la imagen
        if self.contador_clics < len(self.frases):
            self.boton_no.setText(self.frases[self.contador_clics])
            self.contador_clics += 1
        else:
            try:
                # Cargar la imagen y asignarla al botón
                pixmap = QPixmap("no_button_image.jpg")
                icon = QIcon(pixmap)
                self.boton_no.setIcon(icon)
                self.boton_no.setIconSize(pixmap.size())
                self.boton_no.setText("")
                self.boton_no.setEnabled(False)
            except Exception as e:
                print("Error al cargar la imagen:", e)

# Iniciar la aplicación
if __name__ == "__main__":
    app = QApplication(sys.argv)
    window = MainWindow()
    window.show()
    sys.exit(app.exec_())