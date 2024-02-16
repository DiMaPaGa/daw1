
Este trabajo ha sido realizado por:

Alberto Márquez Flores
Alejandro Navarro García
Diana Mª Pascual García
Teresa Charlo Millán

Situación:

Tras la búsqueda del primer día en clase, encontramos un par de XML que cumplían los requisitos de
la actividad: Información sobre donantes de sangre y listado de licitaciones.

- En el primer archivo [DonantesSangre], lo único que encontramos "diferente" fue un campo con atributos simples y un
campo con fuente ""xs:anyURI". Nos pareció muy breve.

- El segundo [Adjudicaciones], es un ejemplo de XML largo, con XSD muy breve. Solo destacar el uso de "xs:Byte"y al
intentar trabajar con las fechas, al tener la hora y el identificador del uso horario incorporado, el tipo date no lo
validaba, asi como daba problemas la definición de este campo en pattern, porque no es el mismo en todo el documento.
De nuevo, nos supo a poco.

En nuestra siguiente búsqueda telemática, encontramos dos más que nos resultaron mucho más interesantes:

- [Listado_especies]: Integra muchas más excepciones, atributos, el uso de "enumeration" (para estos listados empleamos 
fuentes oficiales que las describen y se integra en los comentarios integrados en el propio archivo XSD).

- [BOE]:Incorpora descripciones "tipo propio" definido para las fechas en español (son hasta tres los campos en el documento
que se benefician de ello). A su vez, se han definido otros elementos que se incluyen dentro de un choice en el código, dado
que el documento permite que uno de ellos aparezca o no, mientras que el otro aparece al menos una vez, pero puede sucederse 
en más ocasiones. Todo queda debidamente referido en los comentarios del propio documento XSD.


 