# assestment-backend
Assestment de back end, un poco de MySql, Java Git y Docker 

Para la parte de Docker:
1 . Run docker Continer(alpine 3.14)  
2.Create file (“test.txt”) in Continer
  Estos dos puntos se hacen creando un dockerfile con el siguiente contenido: FROM alpine:3.14 RUN touch test.txt
3. Create image “Test”
4.Add Tag “myTest” to image
  Estos dos puntos se hacen en la consola con el siguiente comando: docker build -t test:myTest
  Siendo test el nombre de la imagen, y myTest el tag de la imagen
