from multimethod import multimethod
import math
class Vector3D:
    def __init__(self, x, y, z):
        self.x = float(x)
        self.y = float(y)
        self.z = float(z)

    def __add__(self, other):
        return Vector3D(self.x + other.x, self.y + other.y, self.z + other.z)
    def __mul__(self, r:float):
        return Vector3D(self.x * r, self.y * r, self.z * r)
    def __rmul__(self, r):
        return self.__mul__(r)
    def __abs__(self):
        return math.sqrt(self.x**2 + self.y**2 + self.z**2)
    def norma(self):
        norm = abs(self)
        if norm == 0:
            raise ValueError("No se puede normalizar el vector nulo")
        return Vector3D(self.x / norm, self.y / norm, self.z / norm)
    def proPunt(self, other):
        return self.x * other.x + self.y * other.y + self.z * other.z
    def proCruz(self, other: "Vector3D"):
        return Vector3D(
            self.y * other.z - self.z * other.y,
            self.z * other.x - self.x * other.z,
            self.x * other.y - self.y * other.x
        )
    @multimethod
    def __str__(self):
        return f"({self.x:.2f}, {self.y:.2f}, {self.z:.2f})"
class Main:
    a = Vector3D(3, 4, 0)
    b = Vector3D(6, 8, 0)
    r = 2
    print("Vector a:", a)
    print("Vector b;", b)
    print("Suma de vectores", a + b)
    print("Vector por un escalar", r * a)
    print("La norma de a:", abs(a))
    print("Normal de a es:", a.norma())
    print("El producto punto es:", a.proPunt(b))
    print("El producto cruz es:", a.proCruz(b))