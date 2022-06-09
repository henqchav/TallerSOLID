# TallerSOLID

## Integrantes:

#### Andres Moscoso
#### Henry Quinonez
#### Nicolas Coronel


# Parte 1 
La primera parte incumple el "Open/closed principle" ya que al encontrarse dos clases muy similares al agregar algun otro tipo de postres se va a modificar el codigo fuente o directamente crea otra clase con el postre que se desea añadir, para luego volver a repetir el codigo, para esto se creo una clase padre llamada postre de las cuales se crean los tipos de postre.
![image](https://user-images.githubusercontent.com/93171012/172742196-3fc2f8fb-fee8-4ad7-ad36-2b068aa8d857.png)  ![image](https://user-images.githubusercontent.com/93171012/172742236-7643405b-d57e-438d-b303-d9a65ebef2da.png)  ![image](https://user-images.githubusercontent.com/93171012/172742262-4e3572e2-ae42-4e3b-bca1-09170a993434.png)
# Parte 2 
En la segunda parte se incumple el "Open/closed principle" ya que al agregar o quitar aderezo a un postre exitente o uno nuevo se modifica el codigo fuente, asi mismo incumple el "Single responsibility principle" ya que la responsabilidad se comparte en otras clases.
![image](https://user-images.githubusercontent.com/93171012/172743172-3d812de7-8ae8-4a6b-ad2a-dcadadc5ac3c.png)
# Parte 3
La tercera parte incumnple "Single responsibility principle" ya que en clases como postre existen varias responsabilidades como la de los postres respectivamente y la de los precios que no corresponderia a esa clases por lo que se creo una clases especifica para esos metodos.
![image](https://user-images.githubusercontent.com/93171012/172743900-83de0fad-3384-49ae-87b7-7bdca5590eef.png)
 # Parte 4 
 La cuarta parte incumple con "Dependency inversion principle" ya que en clases aderezos los 3 enums que se encuentran no podian depender de esa clase al momento de hacer alguna modificacion por lo que se hizo un cambio para que los demas aderezos que se agregen dependan de la clase aderezo.
 ![image](https://user-images.githubusercontent.com/93171012/172744327-aac26d10-7e57-4406-8961-1e817ba8fa6c.png)
# Parte 5 
En la parte 5 incumple con "Liskov substitution principle" y "Open/closed principle" ya que al hacer la superclase saltaba un error al hallar un tipo de leche, por lo que de paso incumplia tambien con el principio de abierto y cerrado al querer añadir algun otro tipo de leche o postre, y de paso se soluciono el error que saltaba al querer usar la leche descremada.
![image](https://user-images.githubusercontent.com/93171012/172745571-1281f04d-0b08-4504-b706-e0ed2e839d55.png)
# Parte 6
![image](https://user-images.githubusercontent.com/93171012/172746639-66817447-3276-40dd-a6e3-c95809df08c4.png)


