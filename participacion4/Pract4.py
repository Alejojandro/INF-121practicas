from math import sqrt, pi
from multimethod import multimethod
class Circulo2D:
    def __init__(self, x=0.0, y=0.0, radio=1.0):
        self.__x = x
        self.__y = y
        self.__radio = radio
    def getX(self):
        return self.__x
    def getY(self):
        return self.__y
    def getRadio(self):
        return self.__radio
    def getArea(self):
        return pi*(self.__radio*self.__radio)
    def getPerimetro(self):
        return 2*pi*(self.__radio)
    @multimethod
    def contiene(self, cx=0.0, cy=0.0):
        distancia= sqrt((cx-self.__x)**2 + (cy-self.__y)**2)
        return distancia <= self.__radio
    @multimethod
    def contiene(self, other: 'Circulo2D'):
        distancia =sqrt((other.getX()-self.__x)**2 + (other.getY()-self.__y)**2)
        return distancia + other.getRadio() <=self.__radio
    @multimethod
    def sobrepone(self, other: 'Circulo2D'):
        distancia = sqrt((other.getX() - self.__x) ** 2 + (other.getY() - self.__y) ** 2)
        return distancia <(self.__radio+other.getRadio()) and distancia > abs(self.__radio-other.getRadio())
    def mostrar(self):
        print("El centro del circulo es:","(",self.__x,",",self.__y,")","y el radio es:",self.__radio)
class Main:
    c0 = Circulo2D()
    c1 = Circulo2D(2,0,1)
    c2 = Circulo2D(2,0,0.5)
    c3 = Circulo2D(0,0,2)
    print("Area de c1 es: ", c1.getArea())
    print("Perimetro de c1 es: ", c1.getPerimetro())
    print("El circulo c1 tiene en su interior los puntos (2.5,0)?: ",c1.contiene(2.5, 0))
    print("El circulo c1 tiene en su interior el circulo c3=(2,0,0.5)?: ",c1.contiene(c2))
    print("El circulo c1 se sobrepone al circulo c4=(0,0,2)?: ",c1.sobrepone(c3))


